import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public class Main {
	private static final PrintStream ps = System.out;
	private static final InputStream IS = System.in;
	private static final byte[] BUFFER = new byte[1024];
	private static int ptr = 0;
	private static int buflen = 0;

	static final int A = (int) 100000;
	
	public static void main(String[] args) {
		int n = ni();
		int C = ni();
		int[] count = new int[A+1];
		int[][] st  = new int[C+1][A+1]; // 0: なし,　1： s, 2: t
		
		for (int i = 0; i < n; i++) {
			int s = ni(), t = ni(), c = ni();
			if (st[c][s] == 2) {
				s++;
			}
			if (st[c][t] == 1) {
				t--;
			}
			st[c][s] = 1;
			st[c][t] = 2;
			for (int j = s; j <= t; j++) {
				count[j]++;
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A; i++) {
			max = Math.max(max, count[i]);
		}

		ps.println(max);
	}

	private static boolean hasNextByte() {
		if (ptr < buflen)
			return true;
		else {
			ptr = 0;
			try {
				buflen = IS.read(BUFFER);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0)
				return false;
		}
		return true;
	}

	private static int readByte() {
		if (hasNextByte())
			return BUFFER[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public static boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(BUFFER[ptr]))
			ptr++;
		return hasNextByte();
	}

	public static String n() {
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

	public static long nl() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b))
				return minus ? -n : n;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	public static int ni() {
		long nl = nl();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public static double nextDouble() {
		return Double.parseDouble(n());
	}

	private static int[] nia(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
}
