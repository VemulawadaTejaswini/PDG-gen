import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		int n = ir.nextInt();
		int q = ir.nextInt();
		int[] a = ir.nextIntArray(n);
		long[] sum = new long[n + 1];
		for (int i = 0; i < n; i++) {
			sum[i + 1] += a[i];
			sum[i + 1] += sum[i];
		}
		long[] sum2 = new long[n / 2 + 1];
		for (int i = 0; i < n / 2; i++) {
			sum2[i + 1] += n % 2 == 0 ? a[i * 2 + 1] : a[i * 2];
			sum2[i + 1] += sum2[i];
		}
		while (q-- > 0) {
			int x = ir.nextInt();
			int idx = lower_bound(a, 0, n - 1, x);
			int l = n - idx;
			int lb = (l + 1) / 2, ub = l + 1;
			while (ub - lb > 1) {
				int mid = (lb + ub) / 2;
				if (check(mid, a, x)) {
					lb = mid;
				} else {
					ub = mid;
				}
			}
			out.println(sum[n] - sum[n - lb] + (n % 2 == 0 ? sum2[(n - 2 * lb) / 2] : sum2[(n - 2 * lb + 1) / 2]));
		}
	}

	static boolean check(int x, int[] a, int t) {
		int n = a.length;
		if (n % 2 == 0) {
			if (x * 2 > n)
				return false;
			if (n - 1 - 2 * x >= 0 && t - a[n - 1 - 2 * x] <= a[n - 1 - x] - t)
				return false;
			if (n - x < n && t - a[n - 2 * x] > a[n - x] - t)
				return false;
		} else {
			if (x * 2 - 1 > n)
				return false;
			if (n - 2 * x >= 0 && t - a[n - 2 * x] <= a[n - 1 - x] - t)
				return false;
			if (n - x < n && t - a[n - 2 * x + 1] > a[n - x] - t)
				return false;
		}
		return true;
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