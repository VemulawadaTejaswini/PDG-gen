import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int a = fs.nextInt();
		int b = fs.nextInt();
		int c = fs.nextInt();
		boolean isok = true;
		List<String> output = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String s = fs.next();
			if (s.equals("AB")) {
				if (a < b) {
					output.add("A");
					a++;
					b--;
				} else {
					output.add("B");
					b++;
					a--;
				}
			} else if (s.equals("AC")) {
				if (a < c) {
					output.add("A");
					a++;
					c--;
				} else {
					output.add("C");
					c++;
					a--;
				}
			} else {
				if (c < b) {
					output.add("C");
					c++;
					b--;
				} else {
					output.add("B");
					b++;
					c--;
				}
			}
			if (a < 0 || b < 0 || c < 0) {
				isok = false;
				break;
			}
		}
		if (isok) {
			System.out.println("Yes");
			for (int i = 0; i < n; i++) {
				System.out.println(output.remove(0));
			}
		} else {
			System.out.println("No");
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
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
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}