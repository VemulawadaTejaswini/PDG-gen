import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long mo = (long) (1e9 + 7);

	void run() {
		FastScanner sc = new FastScanner();
		char[] c = sc.next().toCharArray();
		long[][] cntA = new long[c.length][2];
		for (int i = 0; i < c.length; ++i) {
			if (i > 0) {
				cntA[i][0] = cntA[i - 1][0];
				cntA[i][1] = cntA[i - 1][1];
			}
			if (c[i] == 'A')
				++cntA[i][0];
			else if (c[i] == '?')
				++cntA[i][1];
			cntA[i][0] %= mo;
			cntA[i][1] %= mo;
		}
		long[][] cntAB = new long[c.length][3];
		for (int i = 1; i < c.length; ++i) {
			for (int j = 0; j < 3; ++j)
				cntAB[i][j] = cntAB[i - 1][j];
			if (c[i] == 'B') {
				for (int j = 0; j < 2; ++j) {
					cntAB[i][j] += cntA[i - 1][j];
				}
			} else if (c[i] == '?') {
				for (int j = 0; j < 2; ++j) {
					cntAB[i][j + 1] += cntA[i - 1][j];
				}
			}
			for (int j = 0; j < 3; ++j) {
				cntAB[i][j] %= mo;
			}
		}
		int cnt = 0;
		for (char cs : c) {
			if (cs == '?')
				++cnt;
		}
		long[][] cntABC = new long[c.length][4];
		for (int i = 2; i < c.length; ++i) {
			for (int j = 0; j < 4; ++j)
				cntABC[i][j] = cntABC[i - 1][j];
			if (c[i] == 'C') {
				for (int j = 0; j < 3; ++j) {
					cntABC[i][j] += cntAB[i - 1][j];
				}
			} else if (c[i] == '?') {
				for (int j = 0; j < 3; ++j) {
					cntABC[i][j + 1] += cntAB[i - 1][j];
				}
			}
			for (int j = 0; j < 4; ++j)
				cntABC[i][j] %= mo;
		}
		long ans = 0;
		for (int j = 0; j < 4; ++j) {
			ans = (ans + cntABC[c.length - 1][j] * pow(3, cnt - j) % mo) % mo;
		}
		System.out.println(ans);
	}

	long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a = a * a % mo) {
			if (n % 2 == 1)
				ret = ret * a % mo;
		}
		return ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}