
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	String s = null;
	int at = 0;
	int p = -1, q = -1, r = -1;
	
	int[] t = {0, 1, 2};
	int[] f = {2, 1, 0};
	
	int[][] mu = {
			{0, 0, 0},
			{0, 1, 1},
			{0, 1, 2}
	};
	
	int[][] ad = {
			{0, 1, 2},
			{1, 1, 2},
			{2, 2, 2}
	};
	
	int calc(int value, boolean not) {
		return not ? f[value] : t[value];
	}
	
	int mult(int a, int b) {
		return mu[a][b];
	}
	
	int add(int a, int b) {
		return ad[a][b];
	}
	
	int formula() {
		boolean not = false;
		int n = s.length();
		int res = 0;
		while (at < n) {
			char c = s.charAt(at);
			switch (c) {
			case 'P' :
				res = calc(p, not);
				not = false;
				break;
			case 'Q' :
				res = calc(q, not);
				not = false;
				break;
			case 'R' :
				res = calc(r, not);
				not = false;
				break;
			case '0' :
			case '1' :
			case '2' :
				res = not ? f[c - '0'] : t[c - '0'];
				not = false;
				break;
			case '-' :
				not = not ? false : true;
				break;
			case '*' :
				at++;
				res = mult(res, formula());
				break;
			case '+' :
				at++;
				res = add(res, formula());
				break;
			case '(' :
				at++;
				res = calc(formula(), not);
				break;
			case ')' :
				return res;
			}
			at++;
		}
		return res;
	}
	
	public void run() {
		while (true) {
			String s = in.next();
			if (s.matches("-1")) break;
			
			this.s = s;
			int res = 0;
			for (int i = 0; i <= 2; i++) {
				for (int j = 0; j <= 2; j++) {
					for (int k = 0; k <= 2; k++) {
						p = i; q = j; r = k;
						at = 0;
						int x = formula();
						if (x == 2) res++;
					}		
				}
			}
			out.println(res);
			out.flush();
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