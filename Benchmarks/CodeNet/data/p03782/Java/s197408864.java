import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
			int k = in.nextInt();
			int[] a = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				a[i] = in.nextInt();
			}
			boolean[][] pref = new boolean[n + 2][k + 1];
			boolean[][] suff = new boolean[n + 2][k + 1];
			pref[0][0] = true;
			for (int i = 1; i <= n; i++) {
				add(pref[i], pref[i - 1], a[i]);
			}
			suff[n + 1][0] = true;
			for (int i = n; i >= 1; i--) {
				add(suff[i], suff[i + 1], a[i]);
			}
			int ans = n;
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < k; j++) {
					boolean can = pref[i - 1][j] || suff[i + 1][j];
					if (can && j + a[i] >= k) {
						System.out.println(a[i] + " " + j);
						--ans;
						break;
					}
				}
			}
			out.println(ans);
		}

		private void add(boolean[] nf, boolean[] f, int x) {
			for (int i = 0; i < f.length; i++) {
				if (!f[i]) {
					continue;
				}
				nf[i] = true;
				if (i + x < f.length) {
					nf[i + x] = true;
				}
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

