import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MODULO = 1_000_000_000 + 7;

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long l = 0;
		long u = Long.MAX_VALUE / 10;
		while (u - l > 1) {
			long m = (l + u) / 2;
			if (f(a, m) < 0) {
				l = m;
			} else {
				u = m;
			}
		}
		for (long i = Math.max(0, u - 1000); i <= u + 1000; ++i) {
			if (f(a, i) == 0) {
				System.out.println(i);
				return;
			}
		}
	}

	long f(long[] a, long k) {
		int n = a.length;
		long s = 0;
		for (int i = 0; i < n; ++i) {
			if (a[i] + k <= n - 1) {
				continue;
			} else {
				long res = a[i] + k - (n - 1);
				s += (res + n) / (n + 1);
			}
		}
		return k - s;

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
