import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		int[] x = new int[q];
		int[] d = new int[q];
		int[] n = new int[q];
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			d[i] = Integer.parseInt(sa[1]);
			n[i] = Integer.parseInt(sa[2]);
		}
		br.close();

		int mod = 1000003;
		long[] p = new long[mod];
		long[] pi = new long[mod];
		p[0] = 1;
		for (int i = 1; i < p.length; i++) {
			p[i] = p[i - 1] * i % mod;
			pi[i] = modinv(p[i], mod);
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			long xi = x[i];
			long di = d[i];
			long ni = n[i];
			if (di == 0) {
				pw.println(power(xi, ni));

			} else {
				long xd = xi * modinv(di, mod) % mod;
				if (xd == 0 || xd + ni - 1 >= mod) {
					pw.println(0);
				} else {
					long ans = p[(int) (xd + ni - 1)];
					if (xd > 1) {
						ans *= pi[(int) (xd - 1)];
						ans %= mod;
					}
					ans *= power(di, ni);
					ans %= mod;
					pw.println(ans);
				}
			}
		}
		pw.flush();
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

	static long power(long x, long n) {
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 0) {
			return power(x * x % 1000003, n / 2) % 1000003;
		} else {
			return x * power(x, n - 1) % 1000003;
		}
	}
}
