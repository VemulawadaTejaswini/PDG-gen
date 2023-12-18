import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static long mod = (long) 1e9 + 7;

	static void solve() {
		int n = ir.nextInt();
		long[] a = ir.nextLongArray(n);
		long[] sx = new long[n];
		ArrayList<Integer> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sx[i] = i == 0 ? a[0] : sx[i - 1] ^ a[i];
			if (sx[i] == 0)
				l.add(i);
		}
		if (sx[n - 1] != 0) {
			long ct = 0;
			int p = 0;
			long[] t = new long[l.size()];
			for (int i = 0; i < n - 1; i++) {
				if (sx[n - 1] == sx[i]) {
					ct++;
				}
				if (sx[i] == 0) {
					t[p++] = ct;
					ct = 0;
				}
			}
			if (p == 0) {
				out.println(1);
				return;
			}
			long[] dp = new long[l.size()];
			dp[0] = t[0];
			long sum = dp[0];
			for (int i = 1; i < l.size(); i++) {
				dp[i] = add(add(mul(sum, t[i]), dp[i - 1]), t[i]);
				sum = add(sum, dp[i]);
			}
			out.println(add(sum, 1));
		} else {
			if (l.size() == 1) {
				out.println(n);
				return;
			}
			long res = modpow(2, l.size() - 1);
			int[] csx = compress(sx);
			// 0:dp 1:sum 2:ct
			long[][] dp = new long[n][3];
			for (int i = 0; i < n; i++)
				Arrays.fill(dp[i], -1);
			long ct = 0;
			for (int i = n - 1; i >= 0; i--) {
				if (csx[i] == 0) {
					ct++;
					continue;
				}
				if (dp[csx[i]][0] < 0) {
					dp[csx[i]][0] = dp[csx[i]][1] = 1;
					dp[csx[i]][2] = ct;
				} else {
					dp[csx[i]][0] = add(mul(dp[csx[i]][1], sub(ct, dp[csx[i]][2])), dp[csx[i]][0]);
					dp[csx[i]][1] = add(dp[csx[i]][1], dp[csx[i]][0]);
					dp[csx[i]][2] = ct;
				}
			}
			for (int i = 0; i < n; i++)
				if (dp[i][1] >= 0) {
					res = add(res, dp[i][1]);
				}
			out.println(res);
		}
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
