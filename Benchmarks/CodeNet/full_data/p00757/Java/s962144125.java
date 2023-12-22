
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;
		
	int NOT_YET = -1;

	int MAX = 33;
	int[][][][][] dp = new int[2][MAX][MAX][MAX][MAX];
	
	int allSum;
	int H, W, S;
	int[][] U;
	int[][] sum;
	
	int total(int lx, int ly, int rx, int ry) {
		return sum[ry][rx] + sum[ly][lx] - sum[ry][lx] - sum[ly][rx];
	}
	
	int calc(int lx, int ly, int rx, int ry) {
		if (dp[0][ly][lx][ry][rx] != NOT_YET) return dp[0][ly][lx][ry][rx];
		
		int ans = 0, rest = 0;
		if (allSum - total(lx, ly, rx, ry) <= S) {
			ans = 1;
			rest = S + total(lx, ly, rx, ry) - allSum;
		} else {
			return 0;
		}
		
		for (int y = ly + 1; y < ry; y++) {
			int num = calc(lx, ly, rx, y) + calc(lx, y, rx, ry);
			int nrest = Math.min(dp[1][ly][lx][y][rx], dp[1][y][lx][ry][rx]);
			if (num > ans || (num == ans && rest < nrest)) {
				ans = num;
				rest = nrest;
			}
		}
		
		for (int x = lx + 1; x < rx; x++) {
			int num = calc(lx, ly, x, ry) + calc(x, ly, rx, ry);
			int nrest = Math.min(dp[1][ly][lx][ry][x], dp[1][ly][x][ry][rx]);
			if (num > ans || (num == ans && rest < nrest)) {
				ans = num;
				rest = nrest;
			}
		}
		
		dp[0][ly][lx][ry][rx] = ans;
		dp[1][ly][lx][ry][rx] = rest;
		
		return ans;
	}
	
	public void solve() {
		while (true) {
			H = in.nextInt(); 
			W = in.nextInt();
			S = in.nextInt();
			if (H == 0) break;
			U = in.nextIntMap(H, W);
			sum = new int[H+1][W+1];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					sum[i+1][j+1] = sum[i][j+1] + sum[i+1][j] - sum[i][j] + U[i][j];
				}
			}
			allSum = sum[H][W];
			
			for (int i = 0; i < MAX; i++) {
				for (int j = 0; j < MAX; j++) {
					for (int k = 0; k < MAX; k++) {
						Arrays.fill(dp[0][i][j][k], NOT_YET);
						Arrays.fill(dp[1][i][j][k], NOT_YET);
					}
				}
			}
			
			calc(0, 0, W, H);
			System.out.println(dp[0][0][0][H][W] + " " + dp[1][0][0][H][W]);
		}
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
				map[i] = nextIntArray(m);
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
				map[i] = nextLongArray(m);
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
				map[i] = nextDoubleArray(m);
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