import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		String s = sc.next();
		int c1 = 0;
		int c2 = 0;
		if (s.charAt(0) == ')') {
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) == ')') {
					cnt++;
				} else {
					break;
				}
			}
			StringBuilder sb = new StringBuilder(s);
			StringBuilder add = new StringBuilder();
			for (int i = 0; i < cnt; i++) {
				add.append("(");
			}
			s = add.append(sb).toString();
		}
		if (s.charAt(s.length() - 1) == '(') {
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(s.length() - i - 1) == '(') {
					cnt++;
				} else {
					break;
				}
			}
			StringBuilder sb = new StringBuilder(s);
			StringBuilder add = new StringBuilder();
			for (int i = 0; i < cnt; i++) {
				add.append(")");
			}
			s = sb.append(add).toString();
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				c1++;
			} else {
				c2++;
			}
		}
		if (c1 < c2) {
			for (int i = 0; i < c2 - c1; i++) {
				System.out.print("(");
			}
			System.out.println(s);
		} else {
			System.out.print(s);
			for (int i = 0; i < c1 - c2; i++) {
				System.out.print(")");
			}
			System.out.println();
		}
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
