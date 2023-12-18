import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long[] p = new long[a + 1];
		long[] q = new long[b + 1];
		long[] r = new long[c + 1];
		for (int i = 0; i < a; i++) {
			p[i] = sc.nextLong();
		}
		p[a] = -100;
		for (int i = 0; i < b; i++) {
			q[i] = sc.nextLong();
		}
		q[b] = -100;
		for (int i = 0; i < c; i++) {
			r[i] = sc.nextLong();
		}
		r[c] = -100;
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);
		int pn = a;
		int qn = b;
		int rn = c;
		long sum = 0;
		int mu = 0;
		while (x + y > mu && (x > 0 || y > 0)) {
			if (x > 0 && y > 0) {
				if (p[pn] >= q[qn] && p[pn] >= r[rn]) {
					sum += p[pn];
					pn--;
					x--;
				} else if (q[qn] >= p[pn] && q[qn] >= r[rn]) {
					sum += q[qn];
					qn--;
					y--;
				} else {
					sum += r[rn];
					rn--;
					mu++;
				}
			} else if (x > 0) {
				if (p[pn] >= r[rn]) {
					sum += p[pn];
					pn--;
					x--;
				} else {
					sum += r[rn];
					rn--;
					mu++;
				}
			} else {
				if (q[qn] >= r[rn]) {
					sum += q[qn];
					qn--;
					y--;
				} else {
					sum += r[rn];
					rn--;
					mu++;
				}
			}
		}
		System.out.println(sum);
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