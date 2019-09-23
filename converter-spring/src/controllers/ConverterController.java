package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/")
    public String converterForm() {
        return "index";
    }
    @PostMapping("/converter")
    public String converter(@RequestParam float USD, Model model) {
        float result = USD*23000;
        model.addAttribute("vnd",result);
        return "index";
    }
}