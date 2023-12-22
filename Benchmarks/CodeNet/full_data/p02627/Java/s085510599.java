

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		if (a.matches("[a-z]"))
			System.out.println("a");
		else
			System.out.println("A");
	}

}
