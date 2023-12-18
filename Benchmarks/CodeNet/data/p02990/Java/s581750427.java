import java.util.Scanner;


import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;



public class Main {
	static long [][] createdp(int n) {
		long [][] dp = new long [n][n];
		for (int i = 0; i<n;i++) {
			dp[0][i] = 1;
			dp[i][0] = i+1;
		}
		for(int i = 1; i<n;i++) {
			for(int j = 1; j<n;j++) {
				dp[i][j] = dp[i][j-1]+dp[i-1][j];
				if(dp[i][j] > 1000*1000*1000 + 7) {
					dp[i][j] -= 1000*1000*1000 + 7;
				}
			}
		}
		return dp;
	}
	static int result(int n, int k, int i, long [][] dp){
		if(i > (n-k+1)) {
			return 0;
		}
		else if(i == n-k+1) {
			return (int)dp[i-1][k-i-1];
		}
		else if(k == i) {
			return (int)dp[i][n-k-i];
		}
		else {
			long tmp;
			tmp = dp[i][n-k-i] * dp[i-1][k-i-1] % (1000*1000*1000 + 7);
			return (int)tmp;
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long [][] dp = new long [n][n];
		if(k == n) {
			System.out.println(1);
			for(int i = 2; i<=k ;i++) {
				System.out.println(0);
			}
		}else {
			dp = createdp(n);
			for(int i = 1; i<=k ;i++) {
				System.out.println(result(n, k, i, dp) );
			}
		}
		
		
	}
}
