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
 *
 * @author lucasr
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ECoprime solver = new ECoprime();
		solver.solve(1, in, out);
		out.close();
	}

	static class ECoprime {
		static final int MAX = 1000001;

		public void solve(int testNumber, MyScanner sc, PrintWriter out) {
			int N = sc.nextInt();
			int[] vals = sc.nextIntArray(N);
			int[] smallerPrime = new int[MAX], next = new int[MAX];
			for (int i = 2; i < MAX; i++) {
				if (smallerPrime[i] == 0) {
					for (int j = 2 * i; j < MAX; j += i)
						if (smallerPrime[j] == 0) {
							smallerPrime[j] = i;
						}
				} else {
					int tmp = i;
					while (tmp % smallerPrime[i] == 0) {
						tmp /= smallerPrime[i];
					}
					next[i] = tmp;
				}
			}
			int[] count = new int[MAX];
			for (int i = 0; i < N; i++) {
				int cur = vals[i];
				while (smallerPrime[cur] != 0) {
					count[smallerPrime[cur]]++;
					cur = next[cur];
				}
				if (cur > 1) {
					count[cur]++;
				}
			}
			boolean pairwise = true;
			for (int i = 2; i < MAX; i++) {
				if (count[i] > 1) pairwise = false;
			}
			if (pairwise) {
				out.println("pairwise coprime");
				return;
			}
			long gcd = 0;
			for (int i = 0; i < N; i++) {
				gcd = MathLib.gcd(gcd, vals[i]);
			}
			out.println(gcd == 1 ? "setwise coprime" : "not coprime");
		}

	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;

		public MyScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = nextInt();
			}
			return ret;
		}

	}

	static class MathLib {
		public static long gcd(long a, long b) {
			a = Math.abs(a);
			b = Math.abs(b);
			while (b != 0) {
				long tmp = b;
				b = a % b;
				a = tmp;
			}
			return a;
		}

	}
}

