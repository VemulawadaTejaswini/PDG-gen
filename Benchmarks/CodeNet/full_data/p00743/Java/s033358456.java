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
	static boolean debug = true;

	static void solve() {
		for (;;) {
			int n = ir.nextInt();
			int m = ir.nextInt();
			if (n == 0 && m == 0)
				return;
			int a = ir.nextInt() - 1;
			int b = ir.nextInt() - 1;
			Graph[] g1 = new Graph[n];
			for (int i = 0; i < n; i++)
				g1[i] = new Graph();
			for (int i = 0; i < m; i++) {
				int x = ir.nextInt() - 1;
				int y = ir.nextInt() - 1;
				int d = ir.nextInt();
				int c = ir.nextInt();
				g1[x].add(new double[] { y, d, c });
				g1[y].add(new double[] { x, d, c });
			}
			Graph[] g2 = new Graph[31 * n];
			for (int i = 0; i < 31 * n; i++)
				g2[i] = new Graph();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < g1[i].size(); j++) {
					int to = (int) g1[i].get(j)[0];
					for (int k = 0; k <= 30; k++) {
						for (int l = -1; l <= 1; l++) {
							if (k + l >= 1 && k + l <= (int) g1[i].get(j)[2]) {
								g2[i * 31 + k]
										.add(new double[] { to * 31 + k + l, g1[i].get(j)[1] / (double) (k + l) });
							}
						}
					}
				}
			}
			double[] d = dijkstra(a * 31, g2)[b * 31 + 1];
			double ret = 1e8;
			for (int i = 1; i <= n; i++)
				ret = Math.min(ret, d[i]);
			out.println(ret == 1e8 ? "unreachable" : ret);
		}
	}

	private static double[][] dijkstra(int s, Graph[] g) {
		double[][] d = new double[g.length][g.length / 31 + 1];
		PriorityQueue<double[]> pq = new PriorityQueue<double[]>(new Comparator<double[]>() {
			public int compare(double[] a, double[] b) {
				return Double.compare(a[1], b[1]);
			}
		});
		for (int i = 0; i < g.length; i++)
			Arrays.fill(d[i], 1e8);
		d[s][0] = 0;
		pq.offer(new double[] { s, 0, -1 });
		while (!pq.isEmpty()) {
			double[] p = pq.poll();
			int from = (int) p[0];
			for (int i = 0; i < g[from].size(); i++) {
				double[] e = g[from].get(i);
				int to = (int) e[0];
				if (to / 31 != (int) p[2] && d[to][from / 31 + 1] > d[from][(int) p[2] + 1] + e[1]) {
					d[to][from / 31 + 1] = d[from][(int) p[2] + 1] + e[1];
					pq.offer(new double[] { to, d[to][from / 31 + 1], from / 31 });
				}
			}
		}
		return d;
	}

	static class Graph extends ArrayList<double[]> {
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

