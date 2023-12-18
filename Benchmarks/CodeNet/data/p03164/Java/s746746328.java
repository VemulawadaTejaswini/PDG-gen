
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		int w = sc.nextInt();
		long[][]a = input(n , 2 );
		long[][] dp = new long[n+1][w+1];
		for(long[] k : dp)Arrays.fill(k, Long.MIN_VALUE);
		dp[0][0]=0;
		long ans = 0 ; 
		for(int i = 1 ;i <= n ;i++) {
			for(int j = 0 ;j <= w  ;j++) {
				if(j==0) {dp[i][j]=0;continue;}
				if(j - a[i-1][0] >=0) {
						dp[i][j] =Math.max( dp[i-1][(int) (j-a[i-1][0])] + a[i-1][1]  , dp[i-1][j]) ;
					
				}else {
					dp[i][j] =dp[i-1][j];
				}
				
			}
		}
		for(int i = 0 ;i <=w ;i++) ans = Math.max(ans, dp[n][i]);
		System.out.println(ans);

		
	}
	public static long[] input(int n) throws Exception {

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		return arr;
	}
	public static long[][] input(int n , int m ) throws Exception {

		long[][] arr = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}
