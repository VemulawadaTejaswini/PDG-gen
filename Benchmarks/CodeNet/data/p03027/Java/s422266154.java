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
		int Q = ir.nextInt();
		long[] f = fact((int) mod - 1, mod);
		long[] fi = factInv((int) mod - 1, mod);
		while (Q-- > 0) {
			long x = ir.nextLong();
			long d = ir.nextLong();
			long n = ir.nextLong();
			if (d == 0) {
				out.println(modpow(x, n));
				continue;
			}
			if (x == 0) {
				out.println(0);
				continue;
			}
			if (n >= mod) {
				out.println(0);
				continue;
			}
			long res = modpow(d, n);
			long p = add(div(x, d, mod), mod + n - 1, mod);
			long q = sub(div(x, d, mod), 1, mod);
			if (p < 0)
				p += mod;
			if (q < 0)
				q += mod;
			res = mul(res, f[(int) p], mod);
			res = mul(res, fi[(int) q], mod);
			out.println(res);
		}
	}

	static long mod = (long) 1e6 + 3;

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

	static long add(long a, long b, long mod) {
		return (a + b) % mod;
	}

	static long sub(long a, long b, long mod) {
		long d = a - b;
		while (d < 0)
			d += mod;
		return d;
	}

	static long mul(long a, long b, long mod) {
		return a * b % mod;
	}

	static long div(long a, long b, long mod) {
		return a * mod_inverse(b, mod) % mod;
	}

	private static long[] fact(int n, long mod) {
		long[] ret = new long[n + 1];
		ret[0] = 1 % mod;
		for (int i = 1; i <= n; i++) {
			ret[i] = mul(ret[i - 1], i, mod);
		}
		return ret;
	}

	private static long[] factInv(int n, long mod) {
		long[] ret = new long[n + 1];
		ret[0] = 1;
		for (int i = 1; i <= n; i++) {
			ret[i] = div(ret[i - 1], i, mod);
		}
		return ret;
	}

	public static long mod_inverse(long a, long mod) {
		long[] ret = extgcd(a, mod);
		return add(mod, ret[0] % mod, mod);
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
