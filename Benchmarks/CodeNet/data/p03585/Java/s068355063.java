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
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskE {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				b[i] = in.nextInt();
				c[i] = -in.nextInt();
				if (a[i] < 0) {
					a[i] = -a[i];
					b[i] = -b[i];
					c[i] = -c[i];
				}
			}
			double x = findX(n, a, b, c);
			double y = findX(n, b, a, c);
			out.printf("%.15f %.15f\n", x, y);
		}

		private double findX(int n, int[] a, int[] b, int[] c) {
			final double BOUND = 1e8 + 100;
			double l = -BOUND;
			double r = +BOUND;
			long k = (long) n * (n - 1) / 2;
			k = (k - 1) / 2;
			for (int step = 0; step < 50; step++) {
				double m = 0.5 * (l + r);
				long need = k;
				long got = 0;
				outer:
				for (int i = 0; i < n; i++) {
					for (int j = i + 1; j < n; j++) {
						int u = c[i] * b[j] - c[j] * b[i];
						int v = a[i] * b[j] - a[j] * b[i];
						double x = -(double) u / v;
						if (x <= m) {
							++got;
						}
						if (got > need) {
							break outer;
						}
					}
				}
				if (got <= need) {
					l = m;
				} else {
					r = m;
				}
			}
			return 0.5 * (l + r);
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

