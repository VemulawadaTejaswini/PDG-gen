
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;
	
	/* MOD_CALCULATION */
	int MOD = 1000000007;
	long ADD(long a, long b) { 
		return (a + b) % MOD;
	}
	
	long SUB(long a, long b) { 
		return (a - b + MOD) % MOD;
	}	
	
	long MULT(long a, long b) {
		return (a * b) % MOD;
	}
	
	long POW(long a, long x) {
		long res = 1;
		for ( ; x > 0; x >>= 1) {
			if (x % 2 == 1) res = MULT(res, a);
			a = MULT(a, a);
		}
		
		return res;
	}
	
	long DIV(long a, long b) {
//		System.out.println("div : " + a + " " + b + " = " + MULT(a, POW(b, MOD - 2)));
		return MULT(a, POW(b, MOD - 2));
	}
	/* end */

	int RHASH = 966585769;
	public void solve() {
		int n = in.nextInt(), m = in.nextInt();
		char[] _s = in.next().toCharArray();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = _s[i] - 'a' + 1;
		}
		
		HashSet<Long> hash = new HashSet<Long>();
		int l = 0, r = 0;
		long hashValue = s[0];
		for (int i = 0; i < m; i++) {
			String cmd = in.next();
			if (cmd.matches("L[+][+]")) {
				hashValue = DIV(SUB(hashValue, s[l]), RHASH);
				l++;
			} else if (cmd.matches("L--")) {
				l--;
				hashValue = ADD(MULT(hashValue, RHASH), s[l]);
			} else if (cmd.matches("R[+][+]")) {
				r++;
				hashValue = ADD(hashValue, MULT(POW(RHASH, r - l), s[r]));
			} else if (cmd.matches("R--")) {
				hashValue = SUB(hashValue, MULT(POW(RHASH, r - l), s[r]));
				r--;
			}			
			hash.add(hashValue);
		}
		System.out.println(hash.size());
	}

	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
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

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
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

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
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

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
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