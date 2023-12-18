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
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskB {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[][] a = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = in.nextInt() - 1;
				}
			}
			int[] b = new int[m];
			boolean[] dead = new boolean[m];
			int[] ptr = new int[n];
			for (int ans = 1; ans <= n; ans++) {
				Arrays.fill(b, 0);
				Arrays.fill(dead, false);
				Arrays.fill(ptr, 0);
				for (int i = 0; i < n; i++) {
					++b[a[i][ptr[i]]];
				}
				int numAlive = m;
				while (numAlive > 0) {
					int bad = -1;
					for (int i = 0; i < m; i++) {
						if (dead[i]) {
							continue;
						}
						if (b[i] > ans) {
							bad = i;
							break;
						}
					}
					if (bad < 0) {
						break;
					}

					dead[bad] = true;
					--numAlive;
					for (int i = 0; i < n; i++) {
						if (a[i][ptr[i]] != bad) {
							continue;
						}
						--b[bad];
						while (ptr[i] < m && dead[a[i][ptr[i]]]) {
							++ptr[i];
						}
						if (ptr[i] < m) {
							++b[a[i][ptr[i]]];
						}
					}
				}
				if (numAlive > 0) {
					out.println(ans);
					return;
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

