import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		int arr[][] = new int[n][3];
		for(int i=0;i<n;i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			arr[i] = new int[]{a,b,c};
		}
		System.out.println(func_dp(arr,n));
	}
	static int func_dp(int arr[][],int n) {
		int dp[][] = new int[n][3];
		dp[0][0] = Math.max(arr[0][1], arr[0][2]);
		dp[0][1] = Math.max(arr[0][0], arr[0][2]);
		dp[0][2] = Math.max(arr[0][1], arr[0][0]);
		for(int i=1;i<n;i++) {
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2])+arr[i][0];
			dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2])+arr[i][1];
			dp[i][2] = Math.max(dp[i-1][1], dp[i-1][0])+arr[i][2];
		}
		return (Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
	}
}
