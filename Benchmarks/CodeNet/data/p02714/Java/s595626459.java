import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		String s = sc.next();
		int[] r = new int[n];
		int[] g = new int[n];
		int[] b = new int[n];
		if (s.charAt(n - 1) == 'R') {
			r[n - 1] = 1;
		} else if (s.charAt(n - 1) == 'G') {
			g[n - 1] = 1;
		} else {
			b[n - 1] = 1;
		}
		for (int i = n - 2; i >= 0; i--) {
			r[i] = r[i + 1];
			g[i] = g[i + 1];
			b[i] = b[i + 1];
			switch (s.charAt(i)) {
				case 'R':
					r[i]++;
					break;
				case 'G':
					g[i]++;
					break;
				case 'B':
					b[i]++;
					break;
			}
		}
		long ans = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					continue;
				}
				int minus = 0;
				if (j + (j - i) < n) {
					if (s.charAt(i) != s.charAt(j + (j - i)) && s.charAt(j) != s.charAt(j + (j - i))) {
						minus = -1;
					}
				}
				if ('R' != s.charAt(i) && 'R' != s.charAt(j)) {
					ans += r[j + 1] + minus;
				} else if ('G' != s.charAt(i) && 'G' != s.charAt(j)) {
					ans += g[j + 1] + minus;
				} else {
					ans += b[j + 1] + minus;
				}
			}
		}
		System.out.println(ans);
	}
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
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || Integer.MAX_VALUE < nl) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
