package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cat = scan.nextInt();
		int other = scan.nextInt();
		int othercat = scan.nextInt();
		int n = 0;
		String a = "YES";

		for (n = 0; n < other; n++) {
			cat += 1;
			if (cat == othercat) {
				break;
			}
		}

		if (n == other) {
			a = "NO";
		}

		System.out.println(a);

		scan.close();

	}

}
