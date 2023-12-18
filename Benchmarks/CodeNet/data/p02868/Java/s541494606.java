import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.function.BinaryOperator;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		int m = ir.nextInt();
		int[][] a = new int[m][];
		Graph[] g = new Graph[n];
		BinaryOperator<Long> f = (A, B) -> Math.min(A, B);
		SegmentTree st = new SegmentTree(n, f, 1L << 60);
		for (int i = 0; i < n; i++) {
			g[i] = new Graph();
		}
		for (int i = 0; i < m; i++) {
			a[i] = ir.nextIntArray(3);
			g[a[i][0] - 1].add(new int[] { a[i][1] - 1, a[i][2] });
		}
		long[] d = new long[n];
		Arrays.fill(d, 1L << 60);
		st.update(n - 1, 0);
		d[n - 1] = 0;
		boolean[] used = new boolean[n];
		used[n - 1] = true;
		long res = dfs(0, d, g, st, used);
		out.println(res == 1L << 60 ? -1 : res);
	}

	static long dfs(int cur, long[] d, Graph[] g, SegmentTree st, boolean[] used) {
		if (d[cur] < 1L << 60) {
			return d[cur];
		}
		long res = 1L << 60;
		if (!used[cur + 1]) {
			dfs(cur + 1, d, g, st, used);
		}
		for (int[] to : g[cur]) {
			res = Math.min(res, st.query(cur + 1, to[0] + 1) + (long) to[1]);
		}
		st.update(cur, res);
		used[cur] = true;
		return d[cur] = res;
	}

	static class SegmentTree {

		BinaryOperator<Long> f;
		int n;
		long[] seg;
		long e;

		public SegmentTree(int nn, BinaryOperator<Long> f, long e) {
			this.f = f;
			this.e = e;
			n = 1;
			while (n < nn)
				n <<= 1;
			seg = new long[n * 2 - 1];
			Arrays.fill(seg, e);
		}

		public SegmentTree(long[] a, BinaryOperator<Long> f, long e) {
			this.f = f;
			this.e = e;
			n = 1;
			while (n < a.length)
				n <<= 1;
			seg = new long[n * 2 - 1];
			Arrays.fill(seg, e);
			for (int i = 0; i < a.length; i++)
				seg[i + n - 1] = a[i];
			for (int i = n - 2; i >= 0; i--)
				seg[i] = f.apply(seg[i * 2 + 1], seg[i * 2 + 2]);
		}

		public long query(int l, int r) {
			return query(l, r, 0, 0, n);
		}

		private long query(int a, int b, int k, int l, int r) {
			if (a <= l && r <= b)
				return seg[k];
			if (r <= a || b <= l)
				return e;
			long vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
			long vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
			return f.apply(vl, vr);
		}

		void update(int i, long x) {
			i += n - 1;
			seg[i] = x;
			while (i > 0) {
				i = (i - 1) / 2;
				seg[i] = f.apply(seg[i * 2 + 1], seg[i * 2 + 2]);
			}
		}
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