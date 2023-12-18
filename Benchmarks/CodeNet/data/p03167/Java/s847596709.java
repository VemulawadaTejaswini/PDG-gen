import java.util.*;
import java.io.*;

public class Main {
	final static int MOD = 1000000007;
	final static int intMax = 1000000000;
	final static int intMin = -1000000000;
	final static int[] dx = { 0, 0, -1, 1 };
	final static int[] dy = { -1, 1, 0, 0 };

	static int add(int a, int b) {
		return (a + b) % MOD;
	}
	
	static int sub(int a, int b) {
		return (a - b + MOD) % MOD;
	}
	
	static int mult(int a, int b) {
		return (int)((((long)(a)) * b) % MOD);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br = new BufferedReader(new FileReader(".in"));
		PrintWriter out = new PrintWriter(new File(".out"));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int[][] grid = new int[H][W];
		for(int i = 0; i < H; ++i) {
			String s = br.readLine();
			for(int j = 0; j < W; ++j) {
				grid[i][j] = s.charAt(j) == '.' ? 0 : 1;
			}
		}
		int[][] dp = new int[H][W];
		dp[0][0] = 1;
		for(int i = 0; i < H; ++i) {
			for(int j = 0; j < W; ++j) {
				if(grid[i][j] == 1) continue;
				if(i > 0) dp[i][j] = add(dp[i][j], dp[i - 1][j]);
				if(j > 0) dp[i][j] = add(dp[i][j], dp[i][j - 1]);
			}
		}
		System.out.println(dp[H - 1][W - 1]);
		br.close();
		out.close();
	}
}