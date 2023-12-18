import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		char[] cs = sc.next().toCharArray();
		int Q = sc.nextInt();
		int[] K = new int[Q];
		for (int i = 0; i < Q; ++i) {
			K[i] = sc.nextInt();
		}
		for (int i = 0; i < Q; ++i) {
			pw.println(solve(cs, K[i]));
		}
		pw.close();
	}

	long solve(char[] cs, int K) {
		int n = cs.length;
		long d = 0, m = 0, c = 0, dm = 0, mc = 0, dmc = 0;
		for (int i = 0; i < K; ++i) {
			if (cs[i] == 'D') {
				++d;
			} else if (cs[i] == 'M') {
				++m;
				dm += d;
			} else if (cs[i] == 'C') {
				++c;
				mc += m;
				dmc += dm;
			} else {
				continue;
			}
		}
		long ret = 0;
		for (int i = 0; i < n; ++i) {
			if (cs[i] == 'D') {
				ret += mc;
				dmc -= mc;
				dm -= m;
				--d;
			} else if (cs[i] == 'M') {
				mc -= c;
				--m;
			} else if (cs[i] == 'C') {
				--c;
			}
			int tail = i + K;
			if (i + K >= n)
				continue;
			if (cs[tail] == 'D') {
				++d;
			} else if (cs[tail] == 'M') {
				++m;
				dm += d;
			} else if (cs[tail] == 'C') {
				++c;
				mc += m;
				dmc += dm;
			}
		}
		return ret;
	}

	static class Scanner {
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

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
		}

		public boolean hasNext() {
			skipUnprintable();
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
			return (int) nextLong();
		}
	}

	public static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
