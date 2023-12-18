import java.lang.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] grid = new int[h][w];
		for(int i=0;i<h;++i){
			String s = sc.next();
			for(int j=0;j<w;++j){
				if (s.charAt(j) == '#')
					grid[i][j] = 1;
				else
					grid[i][j] = 0;
			}
		}

		int[][] dp = new int[h][w];
		dp[0][0] = 0;
		for(int i=0;i<h;++i){
			for(int j=0;j<w;++j){
				if (i==0 && j==0) continue;
				if (i==0){
					if (grid[i][j-1] == 1 && grid[i][j] == 0)
						dp[i][j] = dp[i][j-1]+1;
					else
						dp[i][j] = dp[i][j-1];
					continue;
				}
				if (j==0){
					if (grid[i-1][j] == 1 && grid[i][j] == 0)
						dp[i][j] = dp[i-1][j]+1;
					else
						dp[i][j] = dp[i-1][j];
					continue;
				}
				if (grid[i][j] == 0){
					if (grid[i-1][j] == 1 && grid[i][j-1] == 1){
						dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + 1;
					}
					else if (grid[i-1][j] == 1){
						dp[i][j] = Math.min(dp[i-1][j] + 1,dp[i][j-1]);
					}
					else if(grid[i][j-1] == 1){
						dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]+1);
					}
					else
						dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]);
				}
				else
					dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]);
			}
		}
		System.out.println(grid[h-1][w-1] == 0 ? dp[h-1][w-1] : dp[h-1][w-1]+1);
	}
}