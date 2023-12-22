import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[] p;

	public static void main(String[] args) throws Exception {
		N = sc.nextInt();
		M = sc.nextInt();
		while (N > 0) {
			p = new int[M];
			for (int i = 0; i < M; ++i) {
				p[i] = sc.nextInt();
			}
			System.out.println(new BigDecimal(solve()).toPlainString());
			N = sc.nextInt();
			M = sc.nextInt();
		}
	}

	static double solve() {
		for (int i = 0; i < M; ++i) {
			if (p[i] == 1) {
				return 0.0;
			}
		}
		long sum = 0;
		long count = 0;
		int[] lcm = new int[1 << M];
		lcm[0] = 1;
		for (int i = 1; i < (1 << M); ++i) {
			int prev = i & (i - 1);
			int cur = Integer.numberOfTrailingZeros(i);
			lcm[i] = p[cur] / gcd(lcm[prev], p[cur]) * lcm[prev];
			long m = N / lcm[i];
			long add = lcm[i] * m * (m + 1) / 2;
			if (Integer.bitCount(i) % 2 == 0) {
				add *= -1;
				m *= -1;
			}
			sum += add;
			count += m;
		}
		long all = (long)N * (N + 1) / 2 - sum;
		return 1.0 * all / (N - count);
	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}