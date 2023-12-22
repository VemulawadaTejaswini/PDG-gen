import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();

		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextLong();

		double[] p = new double[n];
		for (int i = 0; i < n; i++)
			p[i] = sc.nextDouble() / 100.0;

		int[] cnt = new int[1 << n];

		for (int i = 1; i < (1 << n); i++) {
			long l = 1;
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0) {
					l = lcm(l, a[j]);
					if (l == 0)
						break;
				}
			}
			if (l != 0)
				cnt[i] += m / l;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (1 << n); j++) {
				if ((j & (1 << i)) > 0) {
					cnt[j] -= cnt[j ^ (1 << i)];
				}
			}
		}
		double ans = 0;

		for (int i = 0; i < (1 << n); i++) {
			double pro = 1;
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0) {
					pro *= p[j];
				} else {
					pro *= (1 - p[j]);
				}
			}
			ans += Math.abs(cnt[i]) * pro;
		}
		System.out.println(ans);
	}

	long gcd(long a, long b) {
		if (a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	long lcm(long a, long b) {
		a = a / gcd(a, b);
		if (a * b / b != a)
			return 0;
		else
			return a / gcd(a, b) * b;
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}