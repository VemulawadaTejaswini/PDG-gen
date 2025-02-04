
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);
	boolean[][] memo = null;
	long[][] memonum = null;
	long ans = 0;

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		try {
			int N = sc.nextInt();
			String X = sc.next().trim();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = Integer.valueOf(X.substring(i, i + 1));
			}
			//out.println(Integer.bitCount(Integer.MAX_VALUE));
			int p = 0;
			long now = 1;
			long num = 0;
			//num = 0;
			for (int i = N - 1; i >= 0; i--) {
				if (A[i] == 1) {
					p += 1;
					num += now;
				}
				now *= 2;
			}

			memo = new boolean[2][p + 1000];
			memonum = new long[2][p + 1000];

			long t1 = p <= 1 ? 0 : num % (p - 1);
			long t2 = num % (p + 1);

			for (int i = 0; i < N; i++) {
				ans = 0;
				if (A[i] == 1) {
					if (p == 1) {
						out.println(0);
						continue;
					} else {
						long wa = pow(2, N - i - 1, p - 1) % (p - 1);
						int val = (int) ((t1 - wa + p - 1) % (p - 1));
						solve(val, 0, (p - 1), true);
						memo[0][val] = true;
						memonum[0][val] = ans;
					}
				} else {
					long wa = pow(2, N - i - 1, p + 1) % (p + 1);
					int val = (int) ((t2 + wa) % (p + 1));
					solve(val, 0, (p + 1), false);
					memo[1][val] = true;
					memonum[1][val] = ans;
				}
				out.println(1 + ans);
			}

		} catch (ArithmeticException ae) {
			//ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			//e.printStackTrace();
			throw new RuntimeException();
		} finally {
			out.flush();
			out.close();
		}
	}

	public void solve(int in, int count, long m, boolean w) {
		int type = w ? 0 : 1;
		if (!memo[type][in]) {
			if (in != 0) {
				ans++;
				solve(in % Integer.bitCount(in), count, m, w);
			}
		} else {
			ans += memonum[type][in];
		}
	}

	public static long pow(long x, long n, long mod) {
		if (mod <= 0)
			return 0;
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				res *= x;
				res %= mod;
			}
			x *= x;
			x %= mod;
			n >>= 1;
		}
		return res;
	}

	///////////////////////////////////////////////////////////
	// 高速なScanner
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
}
