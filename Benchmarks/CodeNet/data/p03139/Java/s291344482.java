import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

class Main {
	public static void main(String[] args) {
		new Main().A();
	}

	void A() {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ma = -1, mi = 101;
		for (int i = 0; i <= Math.min(A, B); ++i) {// A,B両方
			int j = A - i;
			int k = B - i;
			if (i + j + k > N || j < 0 || k < 0)
				continue;
			ma = Math.max(i, ma);
			mi = Math.min(i, mi);
		}
		System.out.println(ma + " " + mi);

	}

	void B() {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			if (a.charAt(i) == b.charAt(i) && b.charAt(i) == c.charAt(i)) {
				continue;
			} else if (a.charAt(i) == b.charAt(i) || b.charAt(i) == c.charAt(i) || c.charAt(i) == a.charAt(i)) {
				ans += 1;
			} else {
				ans += 2;
			}
		}
		System.out.println(ans);
	}


	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

}

class Scanner {
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

	private static boolean isPrintableChar(int c) {
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
