import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		for (;;) {
			int n = ir.nextInt();
			if (n == 0)
				return;
			int[] p = ir.nextIntArray(n - 1);
			int[] d = ir.nextIntArray(n - 1);
			Graph[] g = new Graph[n];
			Graph[] g2 = new Graph[n];
			long ret = 0;
			boolean[] l = new boolean[n];
			for (int i = 0; i < n; i++) {
				g[i] = new Graph();
				g2[i] = new Graph();
			}
			for (int i = 1; i < n; i++) {
				g[i].add(new int[] { p[i - 1] - 1, d[i - 1] });
				g[p[i - 1] - 1].add(new int[] { i, d[i - 1] });
				ret += d[i - 1];
			}
			for (int i = 0; i < n; i++)
				if (g[i].size() == 1)
					l[i] = true;
			for (int i = 0; i < n; i++) {
				if (l[i])
					continue;
				for (int j = 0; j < g[i].size(); j++) {
					int[] to = g[i].get(j);
					if (l[to[0]])
						continue;
					g2[i].add(new int[] { to[0], to[1] });
					ret += to[1];
				}
			}
			out.println(ret - doubleSweep(g2));
		}
	}

	static long doubleSweep(Graph[] g) {
		int n = g.length;
		long[] dist = new long[n];
		int u = bfs(0, dist, g);
		int v = bfs(u, dist, g);
		return dist[v];
	}

	static int bfs(int s, long[] dist, Graph[] g) {
		Deque<Integer> que = new ArrayDeque<Integer>();
		Arrays.fill(dist, Long.MAX_VALUE / 2);
		que.offerLast(s);
		dist[s] = 0;
		int ret = -1;
		while (!que.isEmpty()) {
			int from = que.pollFirst();
			for (int i = 0; i < g[from].size(); i++) {
				int[] to = g[from].get(i);
				if (dist[to[0]] == Long.MAX_VALUE / 2) {
					dist[to[0]] = dist[from] + to[1];
					que.offerLast(to[0]);
				}
			}
		}
		for (int i = 0; i < g.length; i++)
			if (dist[i] != Long.MAX_VALUE / 2 && (ret == -1 || dist[ret] < dist[i]))
				ret = i;
		return ret;
	}

	static class Graph extends ArrayList<int[]> {
	}

	public static void main(String[] args) throws Exception {
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
		if (debug)
			out.println(Arrays.deepToString(o));
	}
}

