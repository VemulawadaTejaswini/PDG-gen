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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			long a = in.nextLong();
			long b = in.nextLong();
			int[] h = new int[n];
			int hmax = 0;
			for (int i = 0; i < n; i++) {
				h[i] = in.nextInt();
				hmax = Math.max(hmax, h[i]);
			}
			long l = 0;
			long r = hmax;
			while (r - l > 1) {
				long m = l + (r - l) / 2;
				if (can(n, a, b, h, m)) {
					r = m;
				} else {
					l = m;
				}
			}
			out.println(r);
		}

		private boolean can(int n, long a, long b, int[] h, long k) {
			long need = 0;
			long d = a - b;
			for (int i = 0; i < h.length; i++) {
				long x = h[i];
				x -= k * b;
				if (x <= 0) {
					continue;
				}
				need += (x + d - 1) / d;
			}
			return need <= k;
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

