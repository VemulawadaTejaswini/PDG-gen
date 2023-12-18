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
		int[] firstEdge;
		int[] edgeNxt;
		int[] edgeDst;
		int numEdges;
		boolean[] used;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			firstEdge = new int[n];
			Arrays.fill(firstEdge, -1);
			edgeNxt = new int[2 * m];
			edgeDst = new int[2 * m];
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				addEdge(a, b);
				addEdge(b, a);
			}
			used = new boolean[2 * m];
			for (int i = 0; i < n; i++) {
				while (true) {
					int e = firstEdge[i];
					while (e >= 0 && used[e]) {
						e = edgeNxt[e];
						firstEdge[i] = e;
					}
					if (e < 0) {
						break;
					}
					int j = i;
					boolean foundCycle = false;
					while (true) {
						e = firstEdge[j];
						while (e >= 0 && used[e]) {
							e = edgeNxt[e];
							firstEdge[j] = e;
						}
						if (e < 0) {
							break;
						}
						used[e] = true;
						used[e ^ 1] = true;
						j = edgeDst[e];
						if (j == i) {
							foundCycle = true;
							break;
						}
					}

					if (!foundCycle) {
						out.println("NO");
						return;
					}
				}
			}
			out.println("YES");
		}

		private void addEdge(int a, int b) {
			int e = numEdges++;
			edgeNxt[e] = firstEdge[a];
			edgeDst[e] = b;
			firstEdge[a] = e;
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

