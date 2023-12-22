
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/E1";

	FastScanner in;
	PrintWriter out;
	
	int[] calc(String s, int K) {
		// 0 : max, 1 : min
		int[][] prev = new int[2][K+1];
		int[][] next = new int[2][K+1];
		Arrays.fill(prev[0], Integer.MIN_VALUE);
		Arrays.fill(prev[1], Integer.MAX_VALUE);
		prev[0][0] = prev[1][0] = 0;
		
		for (int i = 0; i < s.length(); i++) {
			Arrays.fill(next[0], Integer.MIN_VALUE);
			Arrays.fill(next[1], Integer.MAX_VALUE);
			
			int c = s.charAt(i) == '1' ? 1 : -1;
			for (int m = 0; m < 2; m++) {
				for (int j = 0; j <= K; j++) {
					if (prev[m][j] == Integer.MIN_VALUE || prev[m][j] == Integer.MAX_VALUE) continue;
					
					next[0][j] = Math.max(next[0][j], prev[m][j] + c);
					next[1][j] = Math.min(next[1][j], prev[m][j] + c);
					if (j != K) {
						next[0][j+1] = Math.max(next[0][j+1], -prev[m][j] + c);
						next[1][j+1] = Math.min(next[1][j+1], -prev[m][j] + c);
					}
				}
			}
			// swap
			int[][] tmp = prev; prev = next; next = tmp;
		}
		for (int i = 1; i <= K; i++) {
			prev[0][i] = Math.max(prev[0][i], prev[0][i-1]);
			prev[1][i] = Math.min(prev[1][i], prev[1][i-1]);
		}
		
		int[] res = new int[K+1];
		for (int i = 0; i <= K; i++) {
			res[i] = Math.max(Math.abs(prev[0][i]), Math.abs(prev[1][i]));
		}
		return res;
	}
	
	public void solve() {
		String s = in.next();
		int K = in.nextInt();
		int n = s.length();
		
		StringBuilder _ud = new StringBuilder();
		StringBuilder _lr = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'U')
				_ud.append('1');
			else if (s.charAt(i) == 'D')
				_ud.append('0');
			else if (s.charAt(i) == 'R')
				_lr.append('1');
			else if (s.charAt(i) == 'L')
				_lr.append('0');
		}
		String ud = _ud.toString();
		String lr = _lr.toString();
		
		int[] dp_ud = calc(ud, K);
		int[] dp_lr = calc(lr, K);
		
		int res = 0;
		for (int i = 0; i <= K; i++) {
			for (int j = 0; j <= K; j++) {
				if (i + j <= K)
					res = Math.max(res, dp_ud[i] + dp_lr[j]);
			}
		}
		System.out.println(res);
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

		Thread t = new Thread(null, new Runnable() {
			@Override
			public void run() {
				solve();
			}
		}, "lul", 1 << 30);
		t.start();
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