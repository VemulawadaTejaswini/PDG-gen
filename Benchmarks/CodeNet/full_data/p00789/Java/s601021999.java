import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[][] dp = new long[18][301];
		dp[0][0] = 1;
		for(int i = 0; i < 18; i++) {
			for(int j = 0; j < 301; j++) {
				if(dp[i][j] == 0) continue;
				if(i != 17) {
					dp[i+1][j] += dp[i][j];
				}
				int tmp = j + (i+1)*(i+1);
				if(tmp < 301) {
					dp[i][tmp] += dp[i][j]; 
				}
			}
		}
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println(dp[17][n]);
		}
		
	}
}