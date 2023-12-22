import java.io.*;
import java.util.*;

public class IntegralRectangles {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	public void run() {
		while (true) {
			int h = in.nextInt(), w = in.nextInt();
			if ((h|w) == 0) break;
			
			int resH = 1000, resW = 1000;
			loop : for (int i = h+1; i <= 150; i++) {
				for (int j = i + 1; j <= 150; j++) {
					if (h*h + w*w == i*i + j*j) {
						resH = i;
						resW = j;
						break loop;
					}
				}
			}
			
			if (resH == 1000 && resW == 1000) {
				for (int i = 1; i <= 150; i++) {
					for (int j = i + 1; j <= 150; j++) {
						if (h*h + w*w < i*i + j*j && i*i + j*j < resH * resH + resW * resW) {
							resH = i;
							resW = j;
						}
					}
				}
			}
			
			System.out.println(resH + " " + resW);
		}
	}

	public static void main(String[] args) {
		new IntegralRectangles().run();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}