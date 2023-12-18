import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws Exception{
		// BufferedInputStream bs = new BufferedInputStream(new FileInputStream(new File("data.txt")));
		// Scanner sc = new Scanner(bs);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[][] arr = new int[N+1][2];
		long[][] dp = new long[N+1][W+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= W; j++) {
				if(j >= arr[i][0])
					dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-arr[i][0]]+arr[i][1]);
				else dp[i][j] = dp[i-1][j];
			}
		}
	}
}