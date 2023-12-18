import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		InputReader in = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int n = in.nextInt();
		Point[] p1 = new Point[n], p2 = new Point[n]; Point1[] p3 = new Point1[n], p4 = new Point1[n];
		for (int i = 0; i < n; i++) {
			p1[i] = new Point(in.nextInt(), in.nextInt());
			p3[i] = new Point1(p1[i].x, p1[i].y);
		}
		for (int i = 0; i < n; i++) {
			p2[i] = new Point(in.nextInt(), in.nextInt());
			p4[i] = new Point1(p2[i].x, p2[i].y);
		}
		Arrays.sort(p1);
		Arrays.sort(p2);
		Arrays.sort(p3);
		Arrays.sort(p4);
		int  max = 0;
		for (int k = 0; k < n; k++) {
			int ans = 0, j = 0;
			for (int i = k; i < n; i++) {
				for (; j < n; j++) {
					if (p1[i].x < p2[j].x && p1[i].y < p2[j].y) {
						//System.out.println(p1[i].x + " " + p1[i].y + " " + p2[j].x + " " + p2[j].y);
						ans++;
						j++;
						break;
					}
				}
			}
			max = Math.max(ans, max);
		}
		for (int k = 0; k < n; k++) {
			int ans = 0, j = 0;
			for (int i = k; i < n; i++) {
				for (; j < n; j++) {
					if (p3[i].x < p4[j].x && p3[i].y < p4[j].y) {
						//System.out.println(p1[i].x + " " + p1[i].y + " " + p2[j].x + " " + p2[j].y);
						ans++;
						j++;
						break;
					}
				}
			}
			max = Math.max(ans, max);
		}
		w.println(max);

		w.close();
	}
	static class Point implements Comparable<Point> {
		int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(Point p) {
			if (this.x == p.x)
				return this.y - p.y;
			return this.x - p.x;
		}
	}
	static class Point1 implements Comparable<Point1> {
		int x, y;
		Point1(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(Point1 p) {
			if (this.y == p.y)
				return this.x - p.x;
			return this.y - p.y;
		}
	}
	static class InputReader {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (numChars == -1)
				throw new UnknownError();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new UnknownError();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int peek() {
			if (numChars == -1)
				return -1;
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					return -1;
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar];
		}

		public void skip(int x) {
			while (x-- > 0)
				read();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public String nextString() {
			return next();
		}

		public String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuffer res = new StringBuffer();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));

			return res.toString();
		}

		public String nextLine() {
			StringBuffer buf = new StringBuffer();
			int c = read();
			while (c != '\n' && c != -1) {
				if (c != '\r')
					buf.appendCodePoint(c);
				c = read();
			}
			return buf.toString();
		}

		public double nextDouble() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.') {
				if (c == 'e' || c == 'E')
					return res * Math.pow(10, nextInt());
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.') {
				c = read();
				double m = 1;
				while (!isSpaceChar(c)) {
					if (c == 'e' || c == 'E')
						return res * Math.pow(10, nextInt());
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
		public boolean hasNext() {
			int value;
			while (isSpaceChar(value = peek()) && value != -1)
				read();
			return value != -1;
		}

		private boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

	}
}