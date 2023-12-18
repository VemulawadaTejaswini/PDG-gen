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
		ProblemE solver = new ProblemE();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemE {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			boolean[][] g = new boolean[n][n];
			for (boolean[] arr : g) {
				Arrays.fill(arr, true);
			}
			for (int i = 0; i < n; i++) {
				g[i][i] = false;
			}
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				g[a][b] = false;
				g[b][a] = false;
			}

			int[] col = new int[n];
			int[] q = new int[n];
			int[] a = new int[n];
			int[] b = new int[n];
			int numComps = 0;
			for (int s = 0; s < n; s++) {
				if (col[s] != 0) {
					continue;
				}
				int qt = 0;
				int qh = 0;
				col[s] = 1;
				q[qh++] = s;
				while (qt < qh) {
					int v = q[qt++];
					for (int u = 0; u < n; u++) {
						if (!g[v][u]) {
							continue;
						}
						if (col[u] == 0) {
							col[u] = 3 - col[v];
							q[qh++] = u;
						} else if (col[u] == col[v]) {
							// Not bipartite.
							out.println(-1);
							return;
						}
					}
				}
				for (int i = 0; i < qt; i++) {
					int v = q[i];
					if (col[v] == 1) {
						++a[numComps];
					} else {
						++b[numComps];
					}
				}
				++numComps;
			}
			a = Arrays.copyOf(a, numComps);
			b = Arrays.copyOf(b, numComps);

			boolean[] f = new boolean[n * n + 1];
			boolean[] nf = new boolean[n * n + 1];
			f[0] = true;
			for (int i = 0; i < a.length; i++) {
				Arrays.fill(nf, false);
				for (int s = 0; s < f.length; s++) {
					if (f[s]) {
						nf[s + a[i]] = true;
						nf[s + b[i]] = true;
					}
				}
				boolean[] t = f;
				f = nf;
				nf = t;
			}
			int ans = n * n;
			for (int i = 0; i < f.length; i++) {
				if (f[i]) {
					int j = n - i;
					ans = Math.min(ans, i * (i - 1) / 2 + j * (j - 1) / 2);
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

