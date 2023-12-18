import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner(System.in);
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		String s = cin.next();

		int ans = solve(s);
		cout.println(ans);
	}

	private static int solve(String s) {
		int n = s.length();
		outer: for (int i = n - 2; i >= 0; i -= 2) {
			int mid = i / 2;
			for (int j = 0; j < mid; j++)
				if (s.charAt(j) != s.charAt(mid + j))
					continue outer;
			return i;
		}
		throw new IllegalArgumentException();
	}

	static class FastScanner {
		private final InputStream in;
		private final byte[] buf = new byte[1 << 14];
		private int bufs = 0;
		private final long[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		private int ptr = 0;

		public FastScanner(InputStream in) {
			super();
			this.in = in;
		}

		boolean hasNext() {
			while (hasNextByte() && !isMeaningful(buf[ptr]))
				ptr++;
			return hasNextByte();
		}

		private boolean hasNextByte() {
			if (ptr < bufs)
				return true;
			ptr = 0;
			try {
				bufs = in.read(buf);
			} catch (IOException e) {
				throw new IllegalArgumentException(e);
			}
			if (bufs <= 0)
				return false;
			return true;
		}

		private static boolean isMeaningful(int b) {
			return 33 <= b && b <= 126;
			// return b != -1 && !Character.isWhitespace(b);
		}

		String next() {
			if (!hasNext())
				throw new IllegalArgumentException();
			StringBuilder sb = new StringBuilder();
			int b = read();
			while (isMeaningful(b)) {
				sb.appendCodePoint(b);
				b = read();
			}
			return sb.toString();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			long nl = nextLong();
			int ni = (int) nl;
			if (ni != nl)
				throw new IllegalArgumentException();
			return ni;
		}

		long nextLong() {
			if (!hasNext())
				throw new IllegalArgumentException();
			long n = 0;
			int plus = 1;
			int b = read();
			if (b == '-') {
				plus = -1;
				b = read();
			}
			if ('0' > b || b > '9')
				throw new java.lang.IllegalArgumentException();
			while (true) {
				if (!isMeaningful(b))
					return plus * n;
				n *= 10;
				n += num[b - '0'];
				b = read();
			}
		}

		private int read() {
			if (hasNextByte())
				return buf[ptr++];
			else
				return -1;
		}

	}
}
