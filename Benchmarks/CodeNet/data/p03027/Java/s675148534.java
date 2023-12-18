
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	long pow(long a, int b, int mod) {
		switch (b) {
			case 0: return 1;
			case 1: return a;
			case 2: return a * a % mod;
			default: return pow(pow(a, b >> 1, mod), 2, mod) * pow(a, b & 1, mod) % mod;
		}
	}

	long inv(long a, int mod) {
		return pow(a, mod - 2, mod);
	}

	final int MOD = 1000003;

	public Main() {
		FastIO io = new FastIO();

		/*
		 * ヒント: 巡回群
		 * まずxが1でないとき、dをいじることでxが1の時の値に移動することができる
		 * これは(1000004-x)/dで求められる
		 * よってx=1の時のみ考えれば良い(後で差で導出する)
		 * 求めるべきは、1*...*((1000004-x)/d+1)(1000003-d) - 1*...*((1000004-x)/d+1 - d)(1000003-d)
		 * ということで、新たにl, r, d2を定義する
		 * r = (1000004-x)/d+1, l = r - d, d2 = 1000003 - dとなる
		 * この時、求めるべきは1からrまでd2に対する積を求め、1からlまでの奴を引けば良い
		 * あとは1からlまでのd2に対する積～を高速に求められればいい
		 * まっさきに考えるのは累積積だが配列が足りない(mod^2)
		 * そこで、一部を削れないか考える
		 * 1. 埋め込むと通る(酷い)
		 * 実装が面倒なので一度投げてみる、コンパイラを信じる
		 *
		 */
		int Q = io.nextInt();
		long[] inv = new long[MOD];
		inv[1] = 1;
		for (int i = 2;i < MOD;++ i) inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
		while(Q-- > 0) {
			int x = io.nextInt(), d = io.nextInt(), n = io.nextInt();
			if (n >= MOD) { // 自明を省く
				io.println(0);
				continue;
			}
			if (d == 0) { // 同様に自明
				io.println(x);
				continue;
			}
			if ((MOD - x) % d == 0 && (MOD - x) / d < n) { // これも自明
				io.println(0);
				continue;
			}
			long ans = 1;
			for (int i = 0;i < n;++ i) {
				ans *= x + i * d;
				ans %= MOD;
			}

			/*
			long r = ((MOD + 1) - x) * inv[d] % MOD + 1, l = (r + MOD - d) % MOD, d2 = MOD - d;
			long first = (1 + l * d) % MOD;
			for (int i = 0;i < n;++ i) {
				ans *= first + i * d2;
				ans %= MOD;
			}*/
			io.println(ans);
		}
		io.flush();
	}

	public class FastIO {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int read = 0;
		private int length = 0;
		public final PrintWriter out = new PrintWriter(System.out, false);
		public final PrintWriter err = new PrintWriter(System.err, false);

		private boolean hasNextByte() {
			if (read < length) return true;
			else {
				try {
					read = 0;
					length = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return length > 0;
		}

		private int readByte() {
			return hasNextByte() ? buffer[read++] : -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private boolean isNumber(int c) {
			return '0' <= c && c <= '9';
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[read])) read++;
			return hasNextByte();
		}

		public char nextChar() {
			if (!hasNextByte())  throw new NoSuchElementException();
			return (char)readByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b;
			while (isPrintableChar(b = readByte())) sb.appendCodePoint(b);
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (!isNumber(b)) throw new NumberFormatException();
			while (true) {
				if (isNumber(b)) {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) return minus ? -n : n;
				else throw new NumberFormatException();
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextInt(int width) {
			int[] ret = new int[width];
			for (int i = 0;i < width;++ i) ret[i] = nextInt();
			return ret;
		}

		public long[] nextLong(int width) {
			long[] ret = new long[width];
			for (int i = 0;i < width;++ i) ret[i] = nextLong();
			return ret;
		}

		public int[][] nextInt(int width, int height) {
			int[][] ret = new int[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[i][j] = nextInt();
			return ret;
		}

		public long[][] nextLong(int width, int height) {
			long[][] ret = new long[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[j][i] = nextLong();
			return ret;
		}

		public boolean[] nextBoolean(char T) {
			char[] s = next().toCharArray();
			boolean[] ret = new boolean[s.length];
			for (int i = 0;i < ret.length;++ i) ret[i] = s[i] == T;
			return ret;
		}

		@Override
		protected void finalize() throws Throwable {
			try {
				super.finalize();
			} finally {
				in.close();
				out.close();
				err.close();
			}
		}

		public void print(boolean b) {
			out.print(b);
		}

		public void print(char c) {
			out.print(c);
		}

		public void print(char[] s) {
			out.print(s);
		}

		public void print(double d) {
			out.print(d);
		}

		public void print(float f) {
			out.print(f);
		}

		public void print(int i) {
			out.print(i);
		}

		public void print(long l) {
			out.print(l);
		}

		public void print(Object obj) {
			out.print(obj);
		}

		public void print(String s) {
			out.print(s);
		}

		public void printf(String format, Object... args) {
			out.printf(format, args);
		}

		public void printf(Locale l, String format, Object... args) {
			out.printf(l, format, args);
		}

		public void println() {
			out.println();
		}

		public void println(boolean b) {
			out.println(b);
		}

		public void println(char c) {
			out.println(c);
		}

		public void println(char[] s) {
			out.println(s);
		}

		public void println(double d) {
			out.println(d);
		}

		public void println(float f) {
			out.println(f);
		}

		public void println(int i) {
			out.println(i);
		}

		public void println(long l) {
			out.println(l);
		}

		public void println(Object obj) {
			out.println(obj);
		}

		public void println(String s) {
			out.println(s);
		}

		public void flush() {
			out.flush();
			err.flush();
		}
	}
}
