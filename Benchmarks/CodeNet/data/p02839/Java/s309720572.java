import java.io.*;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] A = new int[h][w];
		int[][] B = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		boolean[][][] dp = new boolean[h+1][w+1][2*6400];
		dp[0][1][0+6400] = true;
		dp[1][0][0+6400] = true;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				for(int k = -6400; k < 6400; k++) {
					if(dp[i][j+1][k+6400] || dp[i+1][j][k+6400]) {
						if(6400 + k + A[i][j] - B[i][j] >= 0 && 
								6400 + k + A[i][j] - B[i][j] < 2*6400) {
							dp[i+1][j+1][6400 + k + A[i][j] - B[i][j]] = true;
						}
						if(6400 + k - A[i][j] + B[i][j] >= 0 && 
								6400 + k - A[i][j] + B[i][j] < 2*6400) {
							dp[i+1][j+1][6400 + k - A[i][j] + B[i][j]] = true;
						}
					}
				}
			}
		}
		int min = 6400;
		for(int k = -6400; k < 6400; k++) {
			if(dp[h][w][k+6400])
				min = Integer.min(Math.abs(k), min);
		}
		System.out.println(min);
	}
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
