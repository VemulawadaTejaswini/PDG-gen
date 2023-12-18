import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main ans = new Main();
		System.out.println(ans.solve());
	}

	private long solve() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char [][] grid = new char[H+1][W+1];
		sc.nextLine();
		for(int i=1;i<=H;i++){
			String line = sc.nextLine();
			int j=1;
			for(char c: line.toCharArray()){
				grid[i][j++] = c;
			}
		}
 		
 		long dp[][] = new long[H+1][W+1];

 		dp[H][W] =1;
 		
 	 	long MOD = (long) 1e9+7;

 		for(int i=H;i>=1;i--){
 			for(int j=W;j>=1;j--) {

 				if (i==H && j==W) continue;

 				if(grid[i][j]=='#') continue;
 				else dp[i][j] = (((i==H) ? 0 : dp[i+1][j]) + ((j==W) ? 0 : dp[i][j+1]))%MOD;
 			}
 		}

		return dp[1][1];

	}
}