import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
	static final long M = 1000000007;

	private static long pow(long x, long n, long M) {
		long a = 1;
		while (n > 0) {
			if ((n & 1) == 1) a = (a * x) % M;
			x = (x * x) % M;
			n >>= 1;
		}
		return a;
	}

	public static void main(String[] args) {
		final FastScanner sc = new FastScanner(System.in);
		long n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[k + 1];
		for (int i = k; i >= 1; i--) {

			a[i] = pow(k / i, n, M);
			//a[i] = k / i;

			for (int j = 2; i * j <= k; j++) {
				a[i] = (a[i] - a[i * j] + M) % M;
				//a[i] = (a[i] - a[i * j] + M) % M;
			}
		}

		long answer = 0;
		for (int i = 1; i <= k; i++) {
			answer = (answer + a[i] * i) % M;
		}

		System.out.println(answer);
	}

	static class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public FastScanner(InputStream source) {
			in = source;
		}

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
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
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
