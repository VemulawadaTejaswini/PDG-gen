import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() {
		FastScanner sc = new FastScanner();
		int n = (int) sc.nextLong();
		int m = (int) sc.nextLong();
		int k = (int) sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
		}
		long[][] f = new long[n][k];
		for (int i = 0; i < f.length; ++i)
			for (int j = 0; j < f[i].length; ++j)
				f[i][j] = -Long.MAX_VALUE / 3;

		ArrayDeque<Long>[] dq = new ArrayDeque[k];
		for (int i = 0; i < dq.length; ++i)
			dq[i] = new ArrayDeque();
		for (int i = 0; i < f.length; ++i) {
			for (int j = k - 1; j >= 0; --j) {
				long add = a[i] * (j + 1);
				long base;
				if (j > 0) {
					if (dq[j - 1].isEmpty())
						continue;
					else
						base = dq[j - 1].peekLast();
				} else {
					base = 0;
				}
				f[i][j] = Math.max(f[i][j], add + base);
				int cnt = 0;
				while (!dq[j].isEmpty() && dq[j].peekFirst() < f[i][j]) {
					dq[j].pollFirst();
					++cnt;
				}
				while (cnt-- >= 0) {
					dq[j].addFirst(f[i][j]);
				}
				while (dq[j].size() > m)
					dq[j].pollLast();
			}
		}
		long ans = 0;
		for (int i = 0; i < n; ++i) {
			ans = Math.max(ans, f[i][k - 1]);
		}
		System.out.println(ans);
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
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}