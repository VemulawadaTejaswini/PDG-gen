import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] arr = new int[n + 1];
		long[] rsum = new long[n + 1];
		long[][] dp = new long[n + 1][n + 1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(s[i - 1]);
			dp[i][i] = arr[i];
		}			

		for (int i = 2; i <= n; i++) {
			for (int j = i - 1; j > 0; j--) {
				dp[i][j] = Math.max(arr[j] - dp[i][j+1], arr[i] - dp[i-1][j]);
				
//				System.out.print("[" + i + " " + j + "](" + dp[i][j][0] + " " + dp[i][j][1] + ") ");
			}
//			System.out.println();
		}

		System.out.println(dp[n][1]);
	}

}

//use for actual values OR use system of linear equation
//long first = dp[i][j + 1][1] + arr[j];
//long last = dp[i - 1][j][1] + arr[i];
//
//if (first > last) {
//	dp[i][j][0] = first;
//	dp[i][j][1] = rsum[i] - rsum[j - 1] - first;
//} else {
//	dp[i][j][0] = last;
//	dp[i][j][1] = rsum[i] - rsum[j - 1] - last;
//}
