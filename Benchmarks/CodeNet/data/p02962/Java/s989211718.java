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
		long LO = (long) Math.pow(2L, 30), HI = LO + 100000;
		long[] mods = new long[] { (long) 1e9 + 21, 2078526727L },
				bases = new long[] { 3655665837329325079L, 6422997478807908741L };
		String s = ir.next();
		int n = s.length();
		String t = ir.next();
		int m = t.length();
		StringBuilder sb = new StringBuilder();
		RollingHash rht = new RollingHash(t, mods, bases);
		while (sb.length() <= m * 2)
			sb.append(s);
		sb.append(s);
		RollingHash rhs = new RollingHash(sb.toString(), mods, bases);
		long hasht = rht.calcHash(1, m);
		int[] p = new int[n];
		Arrays.fill(p, -1);
		long[] hashs = new long[n];
		for (int i = 0; i < n; i++) {
			hashs[i] = rhs.calcHash(i + 1, i + m);
		}
		for (int i = 0; i < n; i++) {
			if (hashs[i] == hasht) {
				p[i] = (i + m) % n;
			}
		}
		// tr(p);
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		int ma = 0;
		boolean[] used = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (dp[i] >= 0 || p[i] < 0 || used[i])
				continue;
			dp[i] = 0;
			int cur = i;
			while (p[cur] >= 0) {
				dp[i]++;
				used[cur] = true;
				cur = p[cur];
				if (used[cur]) {
					out.println(-1);
					return;
				}
				if (dp[cur] >= 0) {
					dp[i] += dp[cur];
					break;
				}
			}
			ma = Math.max(dp[i], ma);
			Arrays.fill(used, false);
		}
		// tr(dp);
		out.println(ma);
	}

	static class RollingHash {
		private String s;
		private long[][] b, H;
		private long[] mods, bases;

		RollingHash(String s, long[] mods, long[] bases) {
			this.s = s;
			this.mods = mods;
			this.bases = bases;
			b = new long[2][0];
			H = new long[2][0];
			int n = s.length();
			for (int j = 0; j < 1; ++j) {
				long B = bases[j] % mods[j];
				b[j] = new long[n + 1];
				H[j] = new long[n + 1];
				b[j][0] = 1;
				H[j][0] = 0;
				for (int i = 0; i < n; ++i) {
					b[j][i + 1] = b[j][i] * B;
					b[j][i + 1] %= mods[j];
					H[j][i + 1] = H[j][i] * B + (int) s.charAt(i);
					H[j][i + 1] %= mods[j];
				}
			}
		}

		long calcHash(int l, int r) {
			long h0 = (H[0][r] - b[0][r - l + 1] * H[0][l - 1]) % mods[0];
			if (h0 < 0) {
				h0 += mods[0];
			}
			// long h1 = (H[1][r] - b[1][r - l + 1] * H[1][l - 1]) % mods[1];
			// if (h1 < 0) {
			// h1 += mods[1];
			// }
			// long hash = (h0 << 31) + h1;
			// return hash;
			return h0;
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