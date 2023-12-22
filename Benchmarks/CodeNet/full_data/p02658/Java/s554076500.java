import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc169/tasks/abc169_b
 * Multiplication 2
 */
public class Main {
	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] a = new long[n];
			boolean zero = false;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
				if (a[i] == 0) {
					zero = true;
					continue;
				}
			}

			long ans = 1;
			if (zero) {
				ans = 0;
			} else {
				for (int i = 0; i < n; i++) {
					ans = mul(ans, a[i]);
					if (ans == -1) continue;
				}
			}
			System.out.println(ans);
		}
	}

	public static long mul(long a, long b) {
		long lim = (long) Math.pow(10, 18);
		try {
			if (a * b <= lim) {
				return a * b;
			} else {
				return -1;
			}
		} catch (Exception e) {
			return -1;
		}
	}
}