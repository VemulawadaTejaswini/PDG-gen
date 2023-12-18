import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main ans = new Main();
		System.out.printf("%d",ans.solve());
	}

	private int solve() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int MOD = 1000000007;
		sc.nextLine();
		char[][] grid = new char[H+1][W+1];
		for(int i=1;i<=H;i++){
			String line = sc.nextLine();
			for(int j=0;j<line.length();j++){
				grid[i][j+1] = line.charAt(j);
			}
		}
 		
 		int [][] dp = new int[H+1][W+1];
 		dp[H][W] = 1;

 		for(int i=H;i>=1;i--){
 			for(int j=W;j>=1;j--){
 				if (i==H && j==W) continue;
 				if (grid[i][j]=='#') continue;
 				else {
 					dp[i][j] = (((i==H) ? 0 : dp[i+1][j]) + ((j==W) ? 0 : dp[i][j+1]))%MOD;
 				}
 			}
 		}

 		return dp[1][1];

	}
}