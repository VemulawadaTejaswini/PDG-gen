package doubleHelix;

import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);

		String b = scanner.next();

		scanner.close();

		switch (b) {
		case "A":
			System.out.println("T");
			break;
		case "T":
			System.out.println("A");
			break;
		case "C":
			System.out.println("G");
			break;
		case "G":
			System.out.println("C");
			break;
		}

	}
}