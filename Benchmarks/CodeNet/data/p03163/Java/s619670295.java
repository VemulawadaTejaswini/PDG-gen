import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int []wei = new int [n];
		int []val = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			wei[i] = sc.nextInt();
			val[i] = sc.nextInt();
		}
		long [][]dp = new long [n+1][w+1];
		
		for(int i = 0; i < n ;i++) {
			for(int j = 0 ; j <= w ; j++) {
				if(j - wei[i] >= 0) {
					dp[i+1][j] = Math.max(dp[i][j] ,dp[i][j -wei[i]] + val[i]);
				}
				else {
					dp[i+1][j] = dp[i][j];
				}
			}
		}
		System.out.println(dp[n][w]);

	}

}
