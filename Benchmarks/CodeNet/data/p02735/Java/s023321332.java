package agc;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class AGC_043_a {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	static class Task {
		static final long MOD = (long) 1e9 + 7;

		public void solve() {
			Scan sc = new Scan();
			int m = (int) sc.scanLong();
			int n = (int) sc.scanLong();
			char[][] carr = new char[m][n];
			for (int i = 0; i < m; ++i) {
				for (int j = 0; j < n; ++j) {
					carr[i][j] = (char) sc.scanChar();
				}
			}
			int[][] cnt = new int[m][n];
			for (int i = 0; i < m; ++i) {
				for (int j = 0; j < n; ++j) {
					char curr = carr[i][j];
					if (i + j == 0) {
						cnt[i][j] = (curr == '.' ? 0 : 1);
						continue;
					}
					if (i == 0) {
						cnt[i][j] = curr == '.' ? cnt[i][j - 1]
								: (carr[i][j - 1] == '.' ? cnt[i][j - 1] + 1 : cnt[i][j - 1]);
						continue;
					}
					if (j == 0) {
						cnt[i][j] = curr == '.' ? cnt[i - 1][j]
								: (carr[i - 1][j] == '.' ? cnt[i - 1][j] + 1 : cnt[i - 1][j]);
						continue;
					}
					int fromTop = (curr == '.' ? cnt[i - 1][j]
							: (carr[i - 1][j] == '.' ? cnt[i - 1][j] + 1 : cnt[i - 1][j]));
					int fromLeft = (curr == '.' ? cnt[i][j - 1]
							: (carr[i][j - 1] == '.' ? cnt[i][j - 1] + 1 : cnt[i][j - 1]));
					cnt[i][j] = Math.min(fromTop, fromLeft);
				}
			}
//			for (int i = 0; i < m; ++i) {
//				for (int j = 0; j < n; ++j)
//					System.out.print(cnt[i][j] + " ");
//				System.out.println();
//			}
			System.out.println(cnt[m - 1][n - 1]);
		}
	}

	static class Scan {
		private byte[] buf = new byte[1024];
		private int index;
		private InputStream in;
		private int total;

		public Scan() {
			in = System.in;
		}

		public int scan() {
			if (total < 0)
				throw new InputMismatchException();
			if (index >= total) {
				index = 0;
				try {
					total = in.read(buf);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				if (total <= 0)
					return -1;
			}
			return buf[index++];
		}

		public long scanLong() {
			long integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}

		public double scanDouble() throws IOException {
			double doub = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doub *= 10;
					doub += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doub += (n - '0') * temp;
						n = scan();
					} else
						throw new InputMismatchException();
				}
			}
			return doub * neg;
		}

		public String scanString() {
			StringBuilder sb = new StringBuilder();
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			while (!isWhiteSpace(n)) {
				sb.append((char) n);
				n = scan();
			}
			return sb.toString();
		}

		public char scanChar() {
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			return (char) n;
		}

		private boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}
	}
}
