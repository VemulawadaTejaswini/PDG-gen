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
		ProblemB solver = new ProblemB();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemB {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int k = in.nextInt();
			int t = in.nextInt();
			int[] a = new int[t];
			for (int i = 0; i < t; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			int p = a.length - 1;
			if (a[p] * 2 < k) {
				out.println(0);
				return;
			}
			int[] b = new int[k];
			for (int i = 0; i < k; i += 2) {
				while (a[p] == 0) {
					--p;
				}
				b[i] = p;
				--a[p];
			}
			int odd = k - 1;
			if (odd % 2 == 0) {
				--odd;
			}
			for (int i = odd; i >= 0; i -= 2) {
				while (a[p] == 0) {
					--p;
				}
				b[i] = p;
				--a[p];
			}
			// out.println(Arrays.toString(b));
			int ans = 0;
			for (int i = 1; i < k; i++) {
				if (b[i] == b[i - 1]) {
					++ans;
				}
			}
			out.println(ans);
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
					st = new StringTokenizer(in.readLine());
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

