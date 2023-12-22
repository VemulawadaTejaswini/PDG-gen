import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;
	static final int[] d = { 0, 1, 0, -1 };

	static void solve() {
		for (;;) {
			int w = ir.nextInt();
			int h = ir.nextInt();
			if (h == 0 && w == 0)
				return;
			char[][] map = ir.nextCharMap(h, w);
			Graph[] g = new Graph[h * w];
			for (int i = 0; i < h * w; i++)
				g[i] = new Graph();
			ArrayList<Integer> dir = new ArrayList<Integer>();
			int s = -1;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 'x')
						continue;
					if (map[i][j] == 'o')
						s = i * w + j;
					if (map[i][j] == '*')
						dir.add(i * w + j);
					for (int k = 0; k < 4; k++) {
						int nx = i + d[k];
						int ny = j + d[k ^ 1];
						if (nx >= 0 && nx < h && ny >= 0 && ny < w && map[nx][ny] != 'x') {
							g[i * w + j].add(new int[] { nx * w + ny, 1 });
						}
					}
				}
			}
			int[][] dist = new int[dir.size() + 1][];
			int mi = 1 << 29;
			dist[0] = dijkstra(s, g);
			for (int i = 1; i <= dir.size(); i++)
				dist[i] = dijkstra(dir.get(i - 1), g);
			int[] ord = new int[dir.size()];
			for (int i = 0; i < dir.size(); i++)
				ord[i] = i;
			do {
				int pre = s, ret = 0;
				for (int i = 0; i < ord.length; i++) {
					if (dist[ord[i] + 1][pre] == 1 << 29) {
						out.println(-1);
						return;
					}
					ret += dist[ord[i] + 1][pre];
					pre = dir.get(ord[i]);
				}
				mi = Math.min(mi, ret);
			} while (next_permutation(ord));
			out.println(mi);
		}
	}

	public static boolean next_permutation(int[] a) {
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] < a[i + 1]) {
				for (int j = a.length - 1;; j--) {
					if (a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
						for (i++, j = a.length - 1; i < j; i++, j--) {
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
						return true;
					}
				}
			}
		}
		return false;
	}

	static class Graph extends ArrayList<int[]> {
	}

	private static int[] dijkstra(int s, Graph[] g) {
		int[] d = new int[g.length];
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});
		Arrays.fill(d, 1 << 29);
		d[s] = 0;
		pq.offer(new int[] { s, 0 });
		while (!pq.isEmpty()) {
			int[] p = pq.poll();
			int from = p[0];
			for (int i = 0; i < g[from].size(); i++) {
				int[] e = g[from].get(i);
				int to = e[0];
				if (d[to] > d[from] + e[1]) {
					d[to] = d[from] + e[1];
					pq.offer(new int[] { to, d[to] });
				}
			}
		}
		return d;
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

