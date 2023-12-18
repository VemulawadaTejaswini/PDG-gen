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
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int k = in.nextInt();
			long[] a = new long[k];
			for (int i = 0; i < k; i++) {
				a[i] = in.nextInt();
			}
			if (a[k - 1] != 2) {
				out.println(-1);
				return;
			}
			long l = 2;
			long r = 3;
			for (int i = k - 2; i >= 0; i--) {
				long min = (l + a[i] - 1) / a[i] * a[i];
				long max = r / a[i] * a[i];
				l = min;
				r = max + a[i] - 1;
			}
			if (l > r) {
				out.println(-1);
			} else {
				out.println(l + " " + r);
			}
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

	}
}

