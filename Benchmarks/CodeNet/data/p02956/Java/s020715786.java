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
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = ir.nextInt();
			y[i] = ir.nextInt();
		}
		x = compress(x);
		y = compress(y);
		int[] co = new int[n];
		BinaryIndexedTree bit = new BinaryIndexedTree(n);
		for (int i = 0; i < n; i++) {
			co[x[i]] = y[i];
		}
		// tr(co);
		long res = 0;
		for (int i = 0; i < n; i++) {
			res = add(res, modpow(2, n));
			long a = bit.sum(co[i]);
			long b = i - a;
			long c = co[i] - a;
			long d = n - 1 - a - b - c;
			res = sub(res, modpow(2, a + b));
			res = sub(res, modpow(2, b + d));
			res = sub(res, modpow(2, c + d));
			res = sub(res, modpow(2, a + c));
			res = add(res, modpow(2, a));
			res = add(res, modpow(2, b));
			res = add(res, modpow(2, c));
			res = add(res, modpow(2, d));
			bit.update(co[i], 1);
			// tr(res);
		}
		out.println(sub(res, n));
	}

	static class BinaryIndexedTree {
		// 0-indexed
		private long[] bit;
		private int SIZE;

		public BinaryIndexedTree(int n) {
			bit = new long[n + 1];
			SIZE = n;
		}

		// sum of segment[0,i)
		public long sum(int i) {
			long res = 0;
			while (i > 0) {
				res += bit[i];
				i -= i & -i;
			}
			return res;
		}

		// sum of segment[start,end)
		public long sum(int start, int end) {
			return sum(end) - sum(start);
		}

		public long get(int i) {
			return sum(i + 1) - sum(i);
		}

		public void update(int i, long x) {
			i++;
			while (i <= SIZE) {
				bit[i] += x;
				i += i & -i;
			}
		}

		public int size() {
			return SIZE;
		}
	}

	public static int[] compress(int[] a) {
		int n = a.length;
		int[] r = a.clone();
		Arrays.sort(r);
		int[] ret = new int[n];
		for (int i = 0; i < n; i++)
			ret[i] = lower_bound(r, 0, n - 1, a[i]);
		return ret;
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

	static long mod = 998244353;

	static long add(long a, long b) {
		return (a + b) % mod;
	}

	static long sub(long a, long b) {
		long d = a - b;
		while (d < 0)
			d += mod;
		return d;
	}

	static long mul(long a, long b) {
		return a * b % mod;
	}

	static long div(long a, long b) {
		return a * mod_inverse(b) % mod;
	}

	private static long[] fact(int n) {
		long[] ret = new long[n + 1];
		ret[0] = 1 % mod;
		for (int i = 1; i <= n; i++) {
			ret[i] = mul(ret[i - 1], i);
		}
		return ret;
	}

	private static long[] factInv(int n) {
		long[] ret = new long[n + 1];
		ret[0] = 1;
		for (int i = 1; i <= n; i++) {
			ret[i] = div(ret[i - 1], i);
		}
		return ret;
	}

	public static long comb(int n, int m, long[] fact, long[] factInv) {
		long ret = fact[n];
		ret = mul(ret, factInv[m]);
		ret = mul(ret, factInv[n - m]);
		return ret;
	}

	public static long[][] stirling(int n) {
		long[][] ret = new long[n + 1][n + 1];
		ret[0][0] = 1;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= i; j++)
				ret[i][j] = add(ret[i - 1][j - 1], mul(ret[i - 1][j], j));
		return ret;
	}

	public static long mod_inverse(long a) {
		long[] ret = extgcd(a, mod);
		return add(mod, ret[0] % mod);
	}

	public static long[] extgcd(long a, long b) {
		long[] ret = new long[3];
		ret[2] = _extgcd(a, b, ret);
		return ret;
	}

	private static long _extgcd(long a, long b, long[] x) {
		long g = a;
		x[0] = 1;
		x[1] = 0;
		if (b != 0) {
			g = _extgcd(b, a % b, x);
			long temp = x[0];
			x[0] = x[1];
			x[1] = temp;
			x[1] -= (a / b) * x[0];
		}
		return g;
	}

	static long modpow(long a, long n) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) != 0)
				res = res * a % mod;
			a = a * a % mod;
			n >>= 1;
		}
		return res;
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