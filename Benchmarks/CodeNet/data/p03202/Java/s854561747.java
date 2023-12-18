import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
		C_LexicographicConstraints solver = new C_LexicographicConstraints();
		solver.solve(1, in, out);
		out.close();
	}

	static class C_LexicographicConstraints {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}

			int[] incs = new int[n];
			int numIncs = 1;
			for (int i = 0; i + 1 < n; i++) {
				if (a[i] >= a[i + 1]) {
					incs[numIncs++] = a[i + 1];
				}
			}
			incs = Arrays.copyOf(incs, numIncs);
			Arrays.sort(incs);

			int l = 0;
			int r = n;
			while (r - l > 1) {
				int m = (l + r) / 2;
				int carry = 0;
				for (int i = incs.length - 1; i >= 0; i--) {
					int between = i + 1 == incs.length ? 0 : incs[i + 1] - incs[i];
					for (int step = 0; step < between; step++) {
						if (carry == 0 || m == 1) {
							break;
						}
						carry /= m;
					}
					if (i > 0) {
						++carry;
					}
				}
				if (carry == 0) {
					r = m;
				} else {
					l = m;
				}
			}
			out.println(r);
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

