import java.util.Scanner;

public class Main {

	private static long f(long x) {
		int a = 0;
		while (x % 2 == 0) {
			x /= 2;
			a++;
		}
		return a;
	}

	private static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	private static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long m = sc.nextLong();
		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			if (a[i] % 2 == 1) {
				System.out.println(0);
				return;
			}
			a[i] /= 2;
		}

		long t = f(a[0]);
		for (int i = 0; i < n; i++) {
			if (f(a[i]) != t) {
				System.out.println(0);
				return;
			}
			a[i] >>= t;
		}
		m >>= t;

		long b = 1;
		for (int i = 0; i < n; i++) {
			b = lcm(b, a[i]);
			if (b > m) {
				System.out.println(0);
				return;
			}
		}

		m /= b;
		System.out.println((m + 1) / 2);
	}
}
