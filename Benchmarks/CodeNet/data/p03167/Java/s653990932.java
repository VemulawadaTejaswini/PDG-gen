import java.io.*;

public class Main {
	static int[][] grid = null;
	static long[][] dp = null;
	static long mod = 1000000007;
	
	public static long countWays(int i, int j) {
		if(i<0 || j<0) return 0L;
		if(i==0 && j==0) return 1L;
		if(grid[i][j] == 0) return 0L;
		if(dp[i][j]!=0) return dp[i][j];
		return dp[i][j] = (countWays(i-1, j)+countWays(i, j-1))%mod;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		str = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);
		grid = new int[h][w];
		//dp = new long[h][w];
		dp = new long[h+1][w+1];
		for(int i=0; i<h; i++) {
			String tmp = br.readLine();
			for(int j=0; j<tmp.length(); j++) {
				if(tmp.charAt(j)=='.')
					grid[i][j] = 1;
			}
		}
		//System.out.println(countWays(h-1, w-1));
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=w; j++) {
				if(i==1 && j==1) {
					dp[i][j] = 1;
					continue;
				}
				if(grid[i-1][j-1]!=0) dp[i][j] = (dp[i-1][j]+dp[i][j-1])%mod;
			}
		}
		System.out.println(dp[h][w]);
	}
}