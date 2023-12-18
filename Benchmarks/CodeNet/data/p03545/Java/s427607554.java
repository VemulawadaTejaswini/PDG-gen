import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		no3();
	}

	private static void no3() {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			int a = Character.getNumericValue(str.charAt(0));
			int b = Character.getNumericValue(str.charAt(1));
			int c = Character.getNumericValue(str.charAt(2));
			int d = Character.getNumericValue(str.charAt(3));

			if (a + b + c + d == 7) {
				str = "+++";
			}
			if (a + b + c - d == 7) {
				str = "++-";
			}
			if (a + b - c - d == 7) {
				str = "+--";
			}
			if (a + b - c + d == 7) {
				str = "+-+";
			}
			if (a - b + c + d == 7) {
				str = "-++";
			}
			if (a - b - c + d == 7) {
				str = "--+";
			}
			if (a - b - c - d == 7) {
				str = "---";
			}
			if (a - b + c - d == 7) {
				str = "-+-";
			}
			System.out.println(String.valueOf(a) + str.charAt(0) + String.valueOf(b) + str.charAt(1) + String.valueOf(c)
					+ str.charAt(2) + String.valueOf(d) + "=7");
		}
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			BigInteger f0 = new BigInteger("2");
			BigInteger f1 = new BigInteger("1");
			BigInteger f2 = null;

			if (n == 1) {
				System.out.println(f1);
				return;
			}

			for (int i = 3; i <= n + 1; i++) {
				f2 = f0.add(f1);
				f0 = f1;
				f1 = f2;
			}

			System.out.println(f2);
		}
	}
}