import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		int K = ir.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = ir.nextLong();
			y[i] = ir.nextLong();
		}
		BinaryIndexedTree2D bit = new BinaryIndexedTree2D(n, n);
		int[] cx = compress(x);
		int[] cy = compress(y);
		for (int i = 0; i < n; i++) {
			bit.add(cx[i], cy[i], 1);
		}
		Arrays.sort(x);
		Arrays.sort(y);
		long res = Long.MAX_VALUE;
		tr(res);
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = 0; k < n; k++) {
					for (int l = k; l < n; l++) {
						tr(bit.query(i, k, j + 1, l + 1));
						if (bit.query(i, k, j + 1, l + 1) >= K) {
							res = Math.min(res, (x[j] - x[i]) * (y[l] - y[k]));
							tr(res);
						}
					}
				}
			}
		}
		out.println(res);
	}

	public static int[] compress(long[] a) {
		int n = a.length;
		long[] r = a.clone();
		Arrays.sort(r);
		int[] ret = new int[n];
		for (int i = 0; i < n; i++)
			ret[i] = lower_bound(r, 0, n - 1, a[i]);
		return ret;
	}

	public static int lower_bound(long[] a, int fromIndex, int toIndex, long val) {
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

	static class BinaryIndexedTree2D {

		private int H, W;
		private long[][] bit;

		public BinaryIndexedTree2D(int H_, int W_) {
			this.H = H_ + 1;
			this.W = W_ + 1;
			bit = new long[H][W];
		}

		void add(int h, int w, long x) {
			h++;
			w++;
			for (int i = h; i < H; i += (i & -i)) {
				for (int j = w; j < W; j += (j & -j)) {
					bit[i][j] += x;
				}
			}
		}

		// [1,h] && [1,w]
		private long sum(int h, int w) {
			long s = 0;
			for (int i = h; i > 0; i -= (i & -i)) {
				for (int j = w; j > 0; j -= (j & -j)) {
					s += bit[i][j];
				}
			}
			return s;
		}

		// [h1,h2) && [w1,w2)
		public long query(int h1, int w1, int h2, int w2) {
			return sum(h2, w2) - sum(h2, w1) - sum(h1, w2) + sum(h1, w1);
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
		System.err.println(Arrays.deepToString(o));
	}
}