import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		int m = ir.nextInt();
		int p = ir.nextInt();
		Graph[] g = new Graph[n];
		Graph[] g2 = new Graph[n];
		int[][] es = new int[m][];
		for (int i = 0; i < n; i++) {
			g[i] = new Graph();
			g2[i] = new Graph();
		}
		for (int i = 0; i < m; i++) {
			int a = ir.nextInt() - 1;
			int b = ir.nextInt() - 1;
			int c = ir.nextInt();
			g[b].add(new int[] { a, i });
			g2[a].add(new int[] { b, i });
			es[i] = new int[] { a, b, p - c };
		}
		boolean[] visited = new boolean[n];
		boolean[] used = new boolean[m];
		boolean[] visited2 = new boolean[n];
		boolean[] used2 = new boolean[m];
		dfs(n - 1, g, visited, used);
		dfs(0, g2, visited2, used2);
		// tr(used);
		// tr(visited);
		if (find_negative_loop(g, es, used, used2) || !visited[0]) {
			out.println(-1);
			return;
		}
		long[] d = BellmanFord(g, es, used, used2);
		// tr(d);
		out.println(d[n - 1] < 0 ? -d[n - 1] : 0);
	}

	static void dfs(int cur, Graph[] g, boolean[] visited, boolean[] used) {
		visited[cur] = true;
		for (int[] e : g[cur]) {
			used[e[1]] = true;
			if (!visited[e[0]]) {
				dfs(e[0], g, visited, used);
			}
		}
	}

	static boolean find_negative_loop(Graph[] g, int[][] es, boolean[] used, boolean[] used2) {
		int n = g.length;
		int m = es.length;
		long[] d = new long[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!used[j] || !used2[j])
					continue;
				if (d[es[j][1]] > d[es[j][0]] + es[j][2]) {
					d[es[j][1]] = d[es[j][0]] + es[j][2];
					if (i == n - 1)
						return true;
				}
			}
		}
		return false;
	}

	static long[] BellmanFord(Graph[] g, int[][] es, boolean[] used, boolean[] used2) {
		int n = g.length;
		int m = es.length;
		long[] d = new long[n];
		Arrays.fill(d, 1L << 60);
		d[0] = 0;
		while (true) {
			boolean update = false;
			for (int j = 0; j < m; j++) {
				if (!used[j] || !used2[j])
					continue;
				if (d[es[j][1]] > d[es[j][0]] + es[j][2]) {
					d[es[j][1]] = d[es[j][0]] + es[j][2];
					update = true;
				}
			}
			if (!update)
				break;
		}
		return d;
	}

	static class Graph extends ArrayList<int[]> {
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		out.println(Arrays.deepToString(o));
	}
}