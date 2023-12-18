import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		Arrays.setAll(h, i -> sc.nextInt());
		
		long[] dp = new long[n];
		dp[0] = 0;
		dp[1] = Math.abs(h[1] - h[0]);
		for (int i = 2; i < n; i++) {
			long cost1 = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
			long cost2 = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
			
			dp[i] = Math.min(cost1, cost2);
		}
		
		System.out.println(dp[n - 1]);
		
		sc.close();
	}
}

