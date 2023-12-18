package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getAnswer(scanner.nextLine()));
		scanner.close();
	}

	static String getAnswer(String param) {
		switch (param) {
		case "A":
			return "C";
		case "C":
			return "A";
		case "G":
			return "T";	
		case "T":
			return "G";
		}
		return "不正な文字";
	}
}
