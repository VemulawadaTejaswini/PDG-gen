import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
		ProblemD solver = new ProblemD();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemD {
		long min1;
		long min2;
		boolean ans = true;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int height = in.nextInt();
			int width = in.nextInt();
			int n = in.nextInt();
			List<Edge>[] edges = new List[height + width];
			for (int i = 0; i < edges.length; i++) {
				edges[i] = new ArrayList<>();
			}
			for (int i = 0; i < n; i++) {
				int r = in.nextInt() - 1;
				int c = in.nextInt() - 1;
				int a = in.nextInt();
				edges[r].add(new Edge(height + c, a));
				edges[height + c].add(new Edge(r, a));
			}
			boolean[] was = new boolean[edges.length];
			long[] val = new long[edges.length];
			for (int i = 0; i < edges.length; i++) {
				if (!was[i]) {
					min1 = Long.MAX_VALUE / 2;
					min2 = Long.MAX_VALUE / 2;
					dfs(i, height, edges, was, val);
					if (min1 + min2 < 0) {
						ans = false;
					}
				}
			}
			out.println(ans ? "Yes" : "No");
		}

		private void dfs(int v, int height, List<Edge>[] edges, boolean[] was, long[] val) {
			was[v] = true;
			if (v < height) {
				min1 = Math.min(min1, val[v]);
			} else {
				min2 = Math.min(min2, val[v]);
			}
			for (Edge e : edges[v]) {
				int u = e.dst;
				if (was[u] && val[u] + val[v] != e.w) {
					ans = false;
				}
				if (!was[u]) {
					val[u] = e.w - val[v];
					dfs(u, height, edges, was, val);
				}
			}
		}

		class Edge {
			int dst;
			long w;

			Edge(int dst, long w) {
				this.dst = dst;
				this.w = w;
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

