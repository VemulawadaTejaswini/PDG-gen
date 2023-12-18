import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		br.close();

		int mod = 998244353;
		NCR ncr = new NCR(n, mod);
		long ans = 0;
		for (int i = 0; i <= k; i++) {
			long v1 = ncr.calc(n - 1, i);
			long v2 = power(m - 1, n - 1 - i, mod);
			long val = m * v1 % mod * v2 % mod;
			ans += val;
			ans %= mod;
		}
		System.out.println(ans);
	}

	static long power(long x, long n, int m) {
		if (n == 0) {
			return 1;
		}
		long val = power(x, n / 2, m);
		val = val * val % m;
		if (n % 2 == 1) {
			val = val * x % m;
		}
		return val;
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
