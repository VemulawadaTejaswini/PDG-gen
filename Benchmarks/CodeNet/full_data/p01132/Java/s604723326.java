
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	int[] VAL = {10, 50, 100, 500};
	int calc(int x) {
		if (x < 0) return Integer.MAX_VALUE;
		
		int res = 0;
		for (int i = 3; i >= 0; i--) {
			while (x >= VAL[i]) {
				x -= VAL[i];
				res++;
			}
		}
		return res;
	}
	
	public void run() {
		int turn = 0;
		while (true) {
			int price = in.nextInt();
			if (price == 0) break;
			if (turn != 0) System.out.println();
			turn++;
			
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
			
			int sum = a + b + c + d;
			int min = Integer.MAX_VALUE;
			int[] res = null; 
			
			int cnt = 0;
			for (int ten = 0; ten <= a; ten++) {
				for (int ften = 0; ften <= b; ften++) {
					for (int hund = 0; hund <= c; hund++) {
						for (int fhund = 0; fhund <= d; fhund++) {
							cnt = ten * 10 + ften * 50 + hund * 100 + fhund * 500;
							int num = sum - ten - ften - hund - fhund;
							if (cnt > price && (min > num + calc(cnt - price))) {
								min = num + calc(cnt - price);
								res = new int[]{ten, ften, hund, fhund};
							}
						}
					}
				}
			}
			
			for (int i = 0; i < 4; i++) {
				if (res[i] != 0) {
					System.out.println(VAL[i] + " " + res[i]);
				}
			}
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