import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int mod = 1000000007;
		NCR ncr = new NCR(n * 2, mod);

		if (k >= n - 1) {
			System.out.println(ncr.calc(n + n - 1, n));
		} else {
			long ans = 0;
			for (int i = 0; i <= k; i++) {
				long val0 = ncr.calc(n, i);
				long val1 = ncr.calc(n - 1, i);;
				ans += val0 * val1;
				ans %= mod;
			}
			System.out.println(ans);
		}
	}

	static class NCR {
		long[] p, pi;
		int m;

		public NCR(int n, int mod) {
			n++;
			m = mod;
			p = new long[n];
			pi = new long[n];
			p[0] = 1;
			pi[0] = 1;
			for (int i = 1; i < n; i++) {
				p[i] = p[i - 1] * i % m;
			}
			pi[n - 1] = BigInteger.valueOf(p[n - 1])
					.modInverse(BigInteger.valueOf(m)).longValue();
			for (int i = n - 1; i > 1; i--) {
				pi[i - 1] = pi[i] * i % m;
			}
		}

		public long calc(int n, int r) {
			if (n < r) return 0;
			return p[n] * pi[r] % m * pi[n - r] % m;
		}
	}
}
