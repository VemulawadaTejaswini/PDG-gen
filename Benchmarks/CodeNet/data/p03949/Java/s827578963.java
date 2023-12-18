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
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskE {
		final int BAD = Integer.MAX_VALUE / 2;
		int n;
		int[][] ls;
		int[][] rs;
		int[] ptr;
		int[][] adj;
		int[] a;
		boolean[] colored;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			n = in.nextInt();
			adj = readTree(n, in);
			int k = in.nextInt();
			a = new int[n];
			Arrays.fill(a, -1);
			colored = new boolean[n];
			for (int i = 0; i < k; i++) {
				int v = in.nextInt() - 1;
				a[v] = in.nextInt();
				colored[v] = true;
			}

			ls = new int[n][];
			rs = new int[n][];
			ptr = new int[n];
			for (int i = 0; i < n; i++) {
				ls[i] = new int[adj[i].length];
				rs[i] = new int[adj[i].length];
			}

			for (int i = 0; i < n; i++) {
				if (colored[i]) {
					dfs1(i, -1, a[i], a[i]);
				}
			}

			for (int i = 0; i < n; i++) {
				if (colored[i]) {
					continue;
				}
				boolean even = ls[i][0] % 2 == 0;
				int l = ls[i][0];
				int r = rs[i][0];
				for (int j = 0; j < ptr[i]; j++) {
					boolean e = ls[i][j] % 2 == 0;
					if (even != e) {
						out.println("No");
						return;
					}
					l = Math.max(l, ls[i][j]);
					r = Math.min(r, rs[i][j]);
				}
				if (l > r) {
					out.println("No");
					return;
				}
				a[i] = l;
				colored[i] = true;
			}

			for (int v = 0; v < n; v++) {
				if (colored[v]) {
					for (int u : adj[v]) {
						int c = dfs2(u, v, a[v] - 1, a[v] + 1);
						if (c == BAD) {
							out.println("No");
							return;
						}
					}
				}
			}

			for (int v = 0; v < n; v++) {
				if (!colored[v]) {
					throw new AssertionError();
				}
				for (int u : adj[v]) {
					if (Math.abs(a[v] - a[u]) != 1) {
						out.println("No");
						return;
					}
				}
			}

			out.println("Yes");
			for (int i = 0; i < n; i++) {
				out.println(a[i]);
			}
		}

		private void dfs1(int v, int p, int l, int r) {
			if (!colored[v]) {
				ls[v][ptr[v]] = l;
				rs[v][ptr[v]] = r;
				++ptr[v];
				if (adj[v].length > 2) {
					return;
				}
			}
			for (int u : adj[v]) {
				if (u == p) {
					continue;
				}
				if (!colored[u]) {
					dfs1(u, v, l - 1, r + 1);
				}
			}
		}

		private int dfs2(int v, int p, int l, int r) {
			if (colored[v]) {
				boolean e1 = l % 2 == 0;
				boolean e2 = a[v] % 2 == 0;
				if (e1 != e2 || !(a[v] >= l && a[v] <= r)) {
					return BAD;
				}
				return a[v];
			}
			for (int u : adj[v]) {
				if (u == p) {
					continue;
				}
				int c = dfs2(u, v, l - 1, r + 1);
				if (c == BAD) {
					return c;
				}
				for (int nc = c - 1; nc <= c + 1; nc += 2) {
					if (nc >= l && nc <= r) {
						colored[v] = true;
						a[v] = c - 1;
						return c - 1;
					}
				}
			}
			return BAD;
		}

		private int[][] readTree(int n, FastScanner in) {
			int[] as = new int[n - 1];
			int[] bs = new int[n - 1];
			int[] deg = new int[n];
			for (int i = 0; i < n - 1; i++) {
				as[i] = in.nextInt() - 1;
				bs[i] = in.nextInt() - 1;
				++deg[as[i]];
				++deg[bs[i]];
			}
			int[][] adj = new int[n][];
			for (int i = 0; i < n; i++) {
				adj[i] = new int[deg[i]];
				deg[i] = 0;
			}
			for (int i = 0; i < n - 1; i++) {
				int a = as[i];
				int b = bs[i];
				adj[a][deg[a]] = b;
				adj[b][deg[b]] = a;
				++deg[a];
				++deg[b];
			}
			return adj;
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

