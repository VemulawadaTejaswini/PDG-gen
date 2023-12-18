import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();

			long cd = c * d / gcd(c, d);

			long s = 0;
			long t = 0;
			long u = 0;

			if (a % c == 0) {
				s = b / c - a / c + 1;
			} else {
				s = b / c - a / c;
			}

			if (a % d == 0) {
				t = b / d - a / d + 1;
			} else {
				t = b / d - a / d;
			}

			if (a % cd == 0) {
				u = b / cd - a / cd + 1;
			} else {
				u = b / cd - a / cd;
			}

			long result = (b - a + 1) - (s + t - u);

			System.out.println(result);
		}

	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

}
