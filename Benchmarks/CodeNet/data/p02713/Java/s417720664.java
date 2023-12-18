import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int K = scn.nextInt();

			int sum = 0;
			for (int a = 1; a <= K; a++) {
				for (int b = 1; b <= K; b++) {
					int ab = gcd(Math.max(a, b), Math.min(a, b));
					for (int c = 1; c <= K; c++) {
						sum += gcd(Math.max(ab, c), Math.min(ab, c));
					}
				}
			}
			System.out.println(sum);
		}
	}

	static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;
		}
		if (a > b) {
			return gcd(a % b, b);
		} else {
			return gcd(b % a, a);
		}
	}
}
