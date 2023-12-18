import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b;

		int c;

		b = a / 1;
		c = a % 1;

		if (Anser(b, c)) {

			System.out.println("Yes");
			System.exit(0);
		}

		b = a / 2;
		c = a % 2;

		if (Anser(b, c)) {

			System.out.println("Yes");
			System.exit(0);
		}

		b = a / 3;
		c = a % 3;

		if (Anser(b, c)) {

			System.out.println("Yes");
			System.exit(0);
		}

		b = a / 4;
		c = a % 4;

		if (Anser(b, c)) {

			System.out.println("Yes");
			System.exit(0);
		}

		b = a / 5;
		c = a % 5;

		if (Anser(b, c)) {

			System.out.println("Yes");
			System.exit(0);
		}

		b = a / 6;
		c = a % 6;

		if (Anser(b, c)) {

			System.out.println("Yes");
			System.exit(0);
		}

		b = a / 7;
		c = a % 7;

		if (Anser(b, c)) {

			System.out.println("Yes");
			System.exit(0);
		}

		b = a / 8;
		c = a % 8;

		if (Anser(b, c)) {

			System.out.println("Yes");
			System.exit(0);
		}

		b = a / 9;
		c = a % 9;

		if (Anser(b, c)) {

			System.out.println("Yes");
			System.exit(0);
		}

		System.out.println("No");

	}

	public static Boolean Anser(int val01, int val02) {

		boolean flg = true;

		if (val01 >= 10) {

			return flg = false;

		}

		if (val02 != 0) {

			return flg = false;

		}

		return flg;

	}

}
