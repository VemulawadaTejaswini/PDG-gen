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
		HashSet<Integer>[][] dp = new HashSet[h+1][w+1];
		for(int i = 0; i <= h; i++) {
			dp[i][0] = new HashSet<>();
		}
		for(int i = 0; i <= w; i++) {
			dp[0][i] = new HashSet<>();
		}
		dp[0][1].add(0); dp[1][0].add(0);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				dp[i+1][j+1] = new HashSet<>();
				for(int k: dp[i+1][j]) {
					if(k > 6400 || k < -6400) continue;
					dp[i+1][j+1].add(k + A[i][j] - B[i][j]);
					dp[i+1][j+1].add(k - A[i][j] + B[i][j]);
				}
				for(int k: dp[i][j+1]) {
					if(k > 6400 || k < -6400) continue;
					dp[i+1][j+1].add(k + A[i][j] - B[i][j]);
					dp[i+1][j+1].add(k - A[i][j] + B[i][j]);
				}
			}
		}
		int min = 6400;
		for(int k: dp[h][w]) {
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
