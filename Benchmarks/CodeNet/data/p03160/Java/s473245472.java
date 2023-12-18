import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; ++i) {
			arr[i] = scan.nextInt();
		}
		
		int[] dp = new int[n];
		Arrays.fill(dp, INF);
		dp[0] = 0;
		dp[1] = Math.abs(arr[1] - arr[0]);
		for(int i = 2 ; i < n ; ++i) {
			dp[i] = Math.min(Math.abs(arr[i] - arr[i-1]) + dp[i-1], Math.abs(arr[i] - arr[i-2]) + dp[i-2]);
		}
		System.out.println(dp[n-1]);
	}
}
