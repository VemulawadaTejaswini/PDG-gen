import java.math.MathContext;
import java.math.RoundingMode;
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
		MathContext mc = new MathContext(25, RoundingMode.HALF_EVEN);

		// BigDecimal[] p = new BigDecimal[n];
		// for (int i = 0; i < n; i++)
		// p[i] = (new BigDecimal(sc.nextInt())).divide(BigDecimal.valueOf(100),
		// mc);
		int[] p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = sc.nextInt();

		long[] cnt = new long[1 << n];
		for (int i = 1; i < (1 << n); i++) {
			long l = 1;
			for (int j = 0; j < n; j++) {
				if (((i >> j) & 1) == 1) {
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
				if (((j >> i) & 1) == 1) {
					cnt[j] -= cnt[j ^ (1 << i)];
				}
			}
		}
		double ans = 0;
		// BigDecimal ans = new BigDecimal(0);
		for (int i = 0; i < (1 << n); i++) {
			// BigDecimal pro = BigDecimal.valueOf(Math.abs(cnt[i]));
			double pro = Math.abs(cnt[i]);
			for (int j = 0; j < n; j++) {
				if (((i >> j) & 1) == 1) {
					// pro = pro.multiply(p[j], mc);
					pro *= p[j] / 100.0;
				} else {
					pro *= (100 - p[j]) / 100.0;
					// pro = pro.multiply(BigDecimal.ONE.subtract(p[j], mc),
					// mc);
				}
			}
			ans += pro;
//			ans = ans.add(pro, mc);

		}
		System.out.printf("%.10f\n", ans);
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
		a /= gcd(a, b);
		if (a * b / b != a)
			return 0;
		else
			return a * b;
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}