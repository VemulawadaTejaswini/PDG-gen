import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ProblemB solver = new ProblemB();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemB {
		final int N = (int) (3e5 + 100);
		final int MOD = 998244353;
		int[] fact = new int[N];
		int[] inv = new int[N];
		int[] invFact = new int[N];

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			precalc();
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			long k = in.nextLong();
			long ans = 0;
			for (long na = 0; na <= n; na++) {
				long nb = k - na * a;
				if (nb < 0) {
					continue;
				}
				if (nb % b != 0) {
					continue;
				}
				nb /= b;
				if (nb > n) {
					continue;
				}

				ans = (ans + (long) C(n, (int) na) * C(n, (int) nb)) % MOD;
			}
			out.println(ans);
		}

		private void precalc() {
			inv[1] = 1;
			for (int i = 2; i < N; i++) {
				inv[i] = (int) ((MOD - (MOD / i) * (long) inv[MOD % i] % MOD) % MOD);
			}
			fact[0] = 1;
			invFact[0] = 1;
			for (int i = 1; i < N; i++) {
				fact[i] = (int) (i * (long) fact[i - 1] % MOD);
				invFact[i] = (int) (inv[i] * (long) invFact[i - 1] % MOD);
			}
		}

		private int C(int n, int k) {
			if (k < 0 || k > n) {
				return 0;
			}
			long a = fact[n];
			long b = invFact[k] * (long) invFact[n - k] % MOD;
			return (int) (a * b % MOD);
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

	}
}

