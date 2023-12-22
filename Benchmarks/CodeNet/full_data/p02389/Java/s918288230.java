package step1;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {

		int height;
		int length;

		scanner = new Scanner(System.in);
		length = scanner.nextInt();
		height = scanner.nextInt();

		int round = 2*height + 2*length;
		int area = length * height;

		System.out.println(area + " " + round);
	}
}

