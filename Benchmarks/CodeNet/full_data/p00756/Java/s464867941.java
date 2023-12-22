
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int INF = 100000000;
	BitSet visited;
	
	class Circle {
		int x;
		int y;
		int r;
		int c;
		
		Circle(int x, int y, int r, int c) {
			this.x = x;
			this.y = y;
			this.r = r;
			this.c = c;
		}
	}
	
	boolean intersect(Circle c1, Circle c2) {
		double dx = c1.x - c2.x, dy = c1.y - c2.y;
		double a = (c1.r + c2.r) * (c1.r + c2.r);
		double b = dx * dx + dy * dy;
		return a > b;
	}
	
	int res = 0;
	int[] mask;
	void calc(Circle[] circle, int bit) {
		if (visited.get(bit)) return;
		
		int n = circle.length;
		res = Math.max(res, n - Integer.bitCount(bit));
		
		for (int i = 0; i < n; i++) {
			if (((1 << i) & bit) == 0 || (mask[i] & bit) != 0) continue;
			for (int j = i + 1; j < n; j++) {
				if (((1 << j) & bit) == 0 || (mask[j] & bit) != 0) continue;
				if (circle[i].c != circle[j].c) continue;
				
				int nbit = bit;
				nbit -= (1 << i);
				nbit -= (1 << j);
				
				calc(circle, nbit);
			}
		}
		
		visited.set(bit);
	}
	
	public void run() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			
			Circle[] circle = new Circle[n];
			for (int i = 0; i < n; i++) {
				circle[i] = new Circle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
			}
			
			visited = new BitSet(1 << n);
			mask = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i; j++) {
					if (intersect(circle[i], circle[j])) mask[i] |= (1 << j);
				}
			}
			res = 0;
			calc(circle, (1 << n) - 1);
			out.println(res);
		}
		out.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
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

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
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

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
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