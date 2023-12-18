
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		//int k =sc.nextInt();
		long[][]a = input(n , 3 );
		long[][] dp = new long[n][3];
		for(int i =0 ; i < n ;i++) {
			long temp =(i>0 ? Math.max(dp[i-1][0] , dp[i-1][1]) :0) ; 
			dp[i][2] = temp+a[i][2];
			
			
			temp =(i>0 ? Math.max(dp[i-1][2] , dp[i-1][1]) :0) ; 
			dp[i][0] = temp+a[i][0];
			
			temp =(i>0 ? Math.max(dp[i-1][0] , dp[i-1][2]) :0) ; 
			dp[i][1] = temp+a[i][1];
		}
		long ans = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
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
