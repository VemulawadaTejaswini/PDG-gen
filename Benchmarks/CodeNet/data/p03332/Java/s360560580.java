import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		long a = Long.parseLong(sa[1]);
		long b = Long.parseLong(sa[2]);
		long k = Long.parseLong(sa[3]);
		br.close();

		int mod = 998244353;
		long[] p = new long[n + 1];
		long[] pi = new long[n + 1];
		p[0] = 1;
		pi[0] = 1;
		for (int i = 1; i < p.length; i++) {
			p[i] = p[i - 1] * i % mod;
			pi[i] = modinv(p[i], mod);
		}

		long ans = 0;
		for (int i = 0; i <= n; i++) {
			long j = (k - a * i);
			if (j % b != 0) {
				continue;
			}
			j /= b;
			if (j > n) {
				continue;
			}
			long val1 = nCr(n, i, mod, p, pi);
			long val2 = nCr(n, (int) j, mod, p, pi);
			val1 *= val2;
			ans += val1;
			ans %= mod;
		}
		System.out.println(ans);
	}

	static long nCr(int n, int r, int m, long[] p, long[] pi) {
		return p[n] * pi[r] % m * pi[n - r] % m;
	}

	static long modinv(long a, long m) {
		long b = m;
		long u = 1;
		long v = 0;
		long tmp = 0;

		while (b > 0) {
			long t = a / b;
			a -= t * b;
			tmp = a;
			a = b;
			b = tmp;

			u -= t * v;
			tmp = u;
			u = v;
			v = tmp;
		}

		u %= m;
		if (u < 0) u += m;
		return u;
	}
}
