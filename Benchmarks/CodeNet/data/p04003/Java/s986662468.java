import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		int n = ir.nextInt();
		int m = ir.nextInt();
		Graph[] g = new Graph[n + 2 * m];
		for (int i = 0; i < n + 2 * m; i++)
			g[i] = new Graph();
		HashMap<Long, Integer> mp = new HashMap<>();
		int p = 0;
		for (int i = 0; i < m; i++) {
			int a = ir.nextInt() - 1;
			int b = ir.nextInt() - 1;
			int c = ir.nextInt() - 1;
			if (!mp.containsKey((long) c << 30L | a)) {
				mp.put((long) c << 30L | a, p++);
			}
			if (!mp.containsKey((long) c << 30L | b)) {
				mp.put((long) c << 30L | b, p++);
			}
			int ac = mp.get((long) c << 30L | a) + n, bc = mp.get((long) c << 30L | b) + n;
			g[ac].add(new int[] { a, 1 });
			g[a].add(new int[] { ac, 1 });
			g[bc].add(new int[] { b, 1 });
			g[b].add(new int[] { bc, 1 });
			g[ac].add(new int[] { bc, 0 });
			g[bc].add(new int[] { ac, 0 });
		}
		long[] d = dijkstra(0, g);
		out.println(d[n - 1] >= (1L << 50L) ? -1 : (d[n - 1] / 2));
	}

	public static int lower_bound(int[] a, int fromIndex, int toIndex, int val) {
		if (val > a[toIndex])
			return toIndex + 1;
		if (val <= a[fromIndex])
			return fromIndex;
		int lb = fromIndex - 1, ub = toIndex;
		while (ub - lb > 1) {
			int mid = (ub - lb) / 2 + lb;
			if (a[mid] >= val) {
				ub = mid;
			} else {
				lb = mid;
			}
		}
		return ub;
	}

	static class Graph extends ArrayList<int[]> {
	}

	private static long[] dijkstra(int s, Graph[] g) {
		long[] d = new long[g.length];
		PriorityQueue<long[]> pq = new PriorityQueue<long[]>(new Comparator<long[]>() {
			public int compare(long[] a, long[] b) {
				return Long.compare(a[1], b[1]);
			}
		});
		Arrays.fill(d, 1L << 50L);
		d[s] = 0;
		pq.offer(new long[] { s, 0 });
		while (!pq.isEmpty()) {
			long[] p = pq.poll();
			int from = (int) p[0];
			for (int i = 0; i < g[from].size(); i++) {
				int[] e = g[from].get(i);
				int to = e[0];
				if (d[to] > d[from] + e[1]) {
					d[to] = d[from] + e[1];
					pq.offer(new long[] { to, d[to] });
				}
			}
		}
		return d;
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
		if (debug)
			out.println(Arrays.deepToString(o));
	}
}