import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static long[] p;
	static long[] pi;
	static long mod = 1000000007;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int a = Integer.parseInt(sa[2]);
		int b = Integer.parseInt(sa[3]);
		br.close();

		p = new long[h + w];
		p[0] = 1;
		for (int i = 1; i < p.length; i++) {
			p[i] = p[i - 1] * i % mod;
		}
		pi = new long[h + w];
		pi[0] = 1;
		for (int i = 1; i < pi.length; i++) {
			pi[i] = pi[i - 1] * modinv(i) % mod;
		}

		long ans = 0;
		for (int i = 0; i < h - a; i++) {
			long temp = nCr(i + b - 1, i);
			temp *= nCr(h - i - 1 + w - b - 1, h - i - 1);
			temp %= mod;
			ans += temp;
			ans %= mod;
		}
		System.out.println(ans);
	}

	static long nCr(int n, int r) {
		if (n <= 0 || r <= 0) {
			return 1;
		}
		long v = p[n];
		v = v * pi[n - r] % mod;
		v = v * pi[r] % mod;
		return v;
	}

	static long modinv(long a) {
		long b = mod;
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

		u %= mod;
		if (u < 0) u += mod;
		return u;
	}
}
