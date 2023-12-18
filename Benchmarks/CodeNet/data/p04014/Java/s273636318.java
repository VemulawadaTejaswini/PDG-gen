import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long s = sc.nextLong();
		sc.close();

		if (s > n) {
			System.out.println(-1);
			return;
		} else if (s == n) {
			System.out.println(n + 1);
			return;
		}

		long n2 = (long) Math.ceil(Math.sqrt(n));
		for (int b = 2; b <= n2; b++) {
			if (f(b, n) == s) {
				System.out.println(b);
				return;
			}
		}

		long ns = n - s;
		for (long i = n2; i > 0; i--) {
			if (ns % i == 0) {
				long b = ns / i + 1;
				if (i < b && f(b, n) == s) {
					System.out.println(b);
					return;
				}
			}
		}
		System.out.println(-1);
	}

	static long f(long b, long n) {
		long ret = 0;
		while (n > 0) {
			ret += n % b;
			n /= b;
		}
		return ret;
	}
}
