
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/D1";

	FastScanner in;
	PrintWriter out;
	
	int MOD = 1000000007;
	public void solve() {
		int H = in.nextInt(), W = in.nextInt();
		if (W != 3) return;
		
		char[][] bs = new char[H][];
		for (int i = 0; i < H; i++) {
			bs[i] = in.next().toCharArray();
		}
		
		int[][] cost01 = new int[H+1][H+1];
		int[][] cost12 = new int[H+1][H+1];
		for (int h1 = 1; h1 <= H; h1++) {
			for (int h2 = 1; h2 <= H; h2++) {
				int ptr1 = h1 - 1, ptr2 = h2 - 1;
				while (ptr1 >= 0 && ptr2 >= 0) {
					if (bs[ptr1][0] == bs[ptr2][1]) cost01[h1][h2]++;
					if (bs[ptr1][1] == bs[ptr2][2]) cost12[h1][h2]++;
					ptr1--; ptr2--;
				}
			}
		}
		
		int[][][] dp = new int[H+1][H+1][H+1];
		for (int i = 0; i <= H; i++) for (int j = 0; j <= H; j++) 
			Arrays.fill(dp[i][j], Integer.MAX_VALUE);
		
		dp[H][H][H] = 0;
		for (int h0 = H; h0 >= 0; h0--) {
			for (int h1 = H; h1 >= 0; h1--) {
				for (int h2 = H; h2 >= 0; h2--) {
					if (h0 != 0)
						dp[h0-1][h1][h2] = Math.min(dp[h0-1][h1][h2], dp[h0][h1][h2] + cost01[h0][h1]);
					if (h1 != 0)
						dp[h0][h1-1][h2] = Math.min(dp[h0][h1-1][h2], dp[h0][h1][h2] + cost01[h0][h1] + cost12[h1][h2]);
					if (h2 != 0)
						dp[h0][h1][h2-1] = Math.min(dp[h0][h1][h2-1], dp[h0][h1][h2] + cost12[h1][h2]);
				}
			}
		}
		System.out.println(dp[0][0][0]);
	}
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
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


