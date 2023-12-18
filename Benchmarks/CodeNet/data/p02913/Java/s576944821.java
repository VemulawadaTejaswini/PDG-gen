import java.io.*;
import java.util.*;
import java.lang.*;

class Main {

	private static class ZAlgorithm {

		private char[] s;
		private int n;
		private int[] z;

		ZAlgorithm(char[] text) {
			if (text == null) return;
			s = text;
			n = s.length;
			buildZTable();
		}

		public int[] lcp() {
			return z;
		}

		public void clear() {
			s = null;
			n = 0;
			z = null;
		}

		public void recreate(char[] text) {
			clear();
			s = text;
			n = s.length;
			buildZTable();
		}

		private void buildZTable() {
			if (n == 0) return;

			z = new int[n];
			z[0] = n;
			int i = 1, j = 0;
			while (i < n) {
				while (i + j < s.length && s[j] == s[i + j]) j++;
				z[i] = j;
				if (j == 0) {
					i++;
					continue;
				}
				int k = 1;
				while (i + k < n && k + z[k] < j) {
					z[i + k] = z[k];
					k++;
				}
				i += k;
				j -= k;
			}
		}
	}

	public static void main(String[] args) {
		final FastScanner sc = new FastScanner(System.in);
		sc.nextInt();
		char[] s = sc.next().toCharArray();
		ZAlgorithm zAlgorithm = new ZAlgorithm(null);

		int answer = 0;
		for (int i = 0; i < s.length; i++) {
			zAlgorithm.recreate(Arrays.copyOfRange(s, i, s.length));
			int[] z = zAlgorithm.lcp();
			//for (int j = 0; j < z.length; j++) {
			//	System.out.print(z[j] + " ");
			//}
			//System.out.println();

			for (int j = 1; j < z.length; j++) {
				if (answer >= z[j] || j < z[j]) continue;
				answer = Math.max(answer, z[j]);
			}
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
