

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	private static int n;
	private static long k;
	private static long[][] a;
	private static final int MOD = (int)1e9+7;

	public static void main(String[] args) {
		n = ini();
		k = in.nextLong();

		a = new long[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = in.nextLong();
			}
		}
		
		long[][] ans = modExp(a, k);
		
		long sol = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sol = (sol+ans[i][j])%MOD;
			}
		}
		
		println(sol);
		
		out.flush();
		out.close();

	}
	
	private static long[][] modExp(long[][] a, long b) {
		
		int n = a.length;
		
		if (b==1) {
			return a;
		} else if (b==0) {
			long[][] res = new long[n][n];
			for(int i=0; i<n; i++) {
				Arrays.fill(res[i], 1);
			}
			return res;
		}
		
		long[][] res = modExp(a, b/2);
		
		if (b%2==0) {
			return matrixMultiply(res, res);
		} else {
			return matrixMultiply(a, matrixMultiply(res, res));
		}
		
	}

	private static long[][] matrixMultiply(long[][] a, long[][] b) {
		
		int n = a.length;
		
		long[][] res = new long[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					res[i][j] = (res[i][j]+(a[i][k]*b[k][j])%MOD)%MOD;
				}
			}
		}
		return res;
	}
	
	//NONPROBLEM CODE

	

	private static InputReader in = new InputReader(System.in);
	private static PrintWriter out = new PrintWriter(System.out);

	private static class InputReader {

		private final InputStream stream;
		private final byte[] buf = new byte[8192];
		private int curChar, snumChars;

		public InputReader(InputStream st) {
			this.stream = st;
		}

		public int read() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}

		public String readString() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

	}

	//INPUT SHORTCUTS

	private static int[] ina(int n) {
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = in.nextInt();
		}
		return temp;
	}

	private static int ini() {
		return in.nextInt();
	}

	//OTHER SHORTCUTS
	public static void sort(int[] a) {
		Arrays.sort(a);
	}

	//PRINT SHORTCUTS

	private static void println(Object... o) {
		for (Object x : o) {
			out.write(x + " ");
		}
		out.write("\n");
		out.flush();
	}

	private static void print(Object... o) {
		for (Object x : o) {
			out.write(x + " ");
		}
		out.flush();
	}

	private static void debug(Object... o) {
		for (Object x : o) {
			out.write(x + " ");
		}
		out.write("\n");
		out.flush();
	}
}
