import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.function.BinaryOperator;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		long[] e = new long[n / 2];
		long[] o = new long[n / 2];
		int[] pos = new int[n + 1];
		for (int i = 0; i < n; i++) {
			int x = ir.nextInt();
			if (i % 2 == 0)
				e[i / 2] = x;
			else
				o[i / 2] = x;
			pos[x] = i;
		}
		BinaryOperator<Long> f = (a, b) -> Math.min(a, b);
		SegmentTree ste = new SegmentTree(e, f, 1L << 60);
		SegmentTree sto = new SegmentTree(o, f, 1L << 60);
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] A, int[] B) {
				return A[4] - B[4];
			}
		});
		pq.add(calc(0, n, ste, sto, pos));
		while (!pq.isEmpty()) {
			int[] s = pq.poll();
			int l = s[0];
			int r = s[1];
			int u = s[2];
			int v = s[3];
			out.print(s[4] + " " + s[5] + " ");
			if (l < u)
				pq.add(calc(l, u, ste, sto, pos));
			if (u + 1 < v)
				pq.add(calc(u + 1, v, ste, sto, pos));
			if (v + 1 < r)
				pq.add(calc(v + 1, r, ste, sto, pos));
		}

		out.println();
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

		void update(int i, int x) {
			i += n - 1;
			seg[i] = x;
			while (i > 0) {
				i = (i - 1) / 2;
				seg[i] = f.apply(seg[i * 2 + 1], seg[i * 2 + 2]);
			}
		}
	}

	// [l,r)
	static int[] calc(int l, int r, SegmentTree ste, SegmentTree sto, int[] pos) {
		if (l % 2 == 0) {
			int f = (int) ste.query(l / 2, r / 2);
			int s = (int) sto.query(pos[f] / 2, r / 2);
			return new int[] { l, r, pos[f], pos[s], f, s };
		} else {
			int f = (int) sto.query(l / 2, r / 2);
			int s = (int) ste.query(pos[f] / 2 + 1, r / 2 + 1);
			return new int[] { l, r, pos[f], pos[s], f, s };
		}
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
