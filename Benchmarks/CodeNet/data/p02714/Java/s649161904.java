import java.io.*;
import java.util.*;
import java.lang.*;

class Main {

	public static void main(String[] args) {
		final FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		int[][] a = new int[n][3];
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < 3; j++) {
				a[i - 1][j] += a[i][j];
			}

			switch (s[i]) {
				case 'R':
					a[i - 1][0]++;
					break;
				case 'G':
					a[i - 1][1]++;
					break;
				case 'B':
					a[i - 1][2]++;
					break;
			}
		}

		long count = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) continue;
				switch (s[i]) {
					case 'R':
						if (s[j] == 'G') {
							count += a[j][2];
						} else { // B
							count += a[j][1];
						}
						break;
					case 'G':
						if (s[j] == 'R') {
							count += a[j][2];
						} else { // B
							count += a[j][0];
						}
						break;
					case 'B':
						if (s[j] == 'R') {
							count += a[j][1];
						} else { // G
							count += a[j][0];
						}
						break;
				}

				int d = j - i;
				if (j + d < n && s[i] != s[j] && s[j] != s[j + d] && s[i] != s[j + d]) {
					count--;
				}
			}
		}

		System.out.println(count);
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
