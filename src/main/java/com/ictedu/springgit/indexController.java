package com.ictedu.springgit;

import org.springframework.web.bind.annotation.GetMapping;

public class indexController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	

}
