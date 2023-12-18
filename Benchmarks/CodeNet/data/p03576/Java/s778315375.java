import java.io.*;
import java.util.*;

class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);

	public void solve() {
		int N = sc.nextInt();
		int K = sc.nextInt();
		Point[] po = new Point[N];
		for (int i = 0; i < N; i++) {
			Point p = new Point();
			p.x = sc.nextInt();
			p.y = sc.nextInt();
			po[i] = p;
		}

		Point[] xpoint = Arrays.stream(po).sorted(Comparator.comparing(Point::getX)).skip(N-K).toArray(Point[]::new);
		Point[] ypoint = Arrays.stream(po).sorted(Comparator.comparing(Point::getY)).skip(N-K).toArray(Point[]::new);
		out.println(Math.min(calc(xpoint), calc(ypoint)));
	}

	long calc(Point[] po) {
		long h = Math.abs(Arrays.stream(po).map(p -> p.y).min(Comparator.naturalOrder()).get() -
							Arrays.stream(po).map(p -> p.y).max(Comparator.naturalOrder()).get());
		long w = Math.abs(Arrays.stream(po).map(p -> p.x).min(Comparator.naturalOrder()).get() -
						Arrays.stream(po).map(p -> p.x).max(Comparator.naturalOrder()).get());
		return h * w;
	}

	class Point {
		public int x;
		public int y;
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
	}

	public static void main(String[] args) {
		new Main().solve();
		out.flush();
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
