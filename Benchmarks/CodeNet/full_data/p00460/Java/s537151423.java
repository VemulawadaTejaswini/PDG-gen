import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
   
   
public class Main {
	static int INF = 2 << 29;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			if(n == 0 && m == 0 && s == 0) break;
			int[][][] dp = new int[n*n+1][m + 1][s+1];
			dp[0][0][0] = 1;
			
			for(int i = 0; i < dp.length-1; i++) {
				for(int j = 0; j < dp[i].length; j++) {
					for(int k = j; k < dp[i][j].length; k++) {
						if(dp[i][j][k] == 0) continue;
						for(int l = j+1; l < dp[i].length; l++) {
							if(k + l > s) break;
							dp[i+1][l][k + l] += dp[i][j][k];
							dp[i+1][l][k + l] %= 100000;
						}
					}
				}
			}
			int sum = 0;
			for(int i = 0; i <= m; i++) {
				sum += dp[n*n][i][s];
				sum %= 100000;
			}
			System.out.println(sum);
		}
		
		
	}
	
}