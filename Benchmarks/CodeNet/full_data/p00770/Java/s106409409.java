
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int[] dirX = {1, 0, -1, 0};
	int[] dirY = {0, -1, 0, 1};
	
	boolean[] primeList;
	
	boolean isPrime(int n) {
		if (n <= 0) return false;
		return !primeList[n];
	}
	
	boolean[] getPrimeList(int n) {
		boolean[] res = new boolean[n];
		
		res[1] = true;
		for (int i = 2; i < res.length; i++) {
			if (res[i]) continue;
			for (int j = 2 * i; j < res.length; j += i) {
				res[j] = true;
			}
		}
		
		return res;
	}
	
	public void run() {
		while (true) {
			int m = in.nextInt(), n = in.nextInt();
			if ((n|m) == 0) break;
			int resX = -1, resY = -1;

			primeList = getPrimeList(m+1);
			
			int range = 0;
			for (range = 1; range < 100000; range++) {
				if (range*range >= m) break;
			}
			
			int[][] cave = new int[range][range];
			
			int curX, curY;
			if (range % 2 == 0) {
				curX = range / 2 - 1;
				curY = range / 2;
			} else {
				curX = range / 2;
				curY = range / 2;
			}
			
			int nowDir = 0;
			int upper = 1, changeFlag = 0;
			int cnt = 0;
			for (int i = 1; i <= m; i++) {
				cave[curY][curX] = i;
				if (i == n) {
					resX = curX;
					resY = curY;
				}
				curY += dirY[nowDir];
				curX += dirX[nowDir];
				cnt++;
				if (cnt == upper) {
					nowDir = (nowDir + 1) % 4;
					cnt = 0;
					if (changeFlag == 1) {
						upper++;
					}
					changeFlag ^= 1;
				}
			}
			
			int[][] dp = new int[range][range];
			int[][] nums = new int[range][range];
			
			for (int i = 0; i < dp[range-1].length; i++) {
				if (isPrime(cave[range-1][i])) {
					dp[range-1][i] = 1;
					nums[range-1][i] = cave[range-1][i];
				}
			}
			
			for (int i = range - 2; i >= 0; i--) {
				for (int j = 0; j < range; j++) {
					dp[i][j] = dp[i+1][j];
					nums[i][j] = nums[i+1][j];
					
					if (j < range-1 && (dp[i][j] < dp[i+1][j+1] || (dp[i][j] == dp[i+1][j+1] && nums[i][j] < nums[i+1][j+1]))) {						
						dp[i][j] = dp[i+1][j+1];
						nums[i][j] = nums[i+1][j+1];
					}
					if (j > 0 && (dp[i][j] < dp[i+1][j-1] || (dp[i][j] == dp[i+1][j-1] && nums[i][j] < nums[i+1][j-1]))) {						
						dp[i][j] = dp[i+1][j-1];
						nums[i][j] = nums[i+1][j-1];
					}
					
					if (isPrime(cave[i][j])) {
						dp[i][j] += 1;
						if (dp[i][j] == 1)
							nums[i][j] = cave[i][j];
					}
				}
			}
			
			//display(nums);
			
			out.println(dp[resY][resX] + " " + nums[resY][resX]);
			
			
		}
		out.close();
	}

	void display(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				out.printf("%4d ", board[i][j]);
			}
			out.println();
		}
		out.println();
	}
	
	public static void main(String[] args) {
		new Main().run();
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