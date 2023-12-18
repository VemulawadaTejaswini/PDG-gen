import java.util.Scanner;

public class Main {
	
	private static void solve(int n, int k,int[] h) {
		
		int[] dp = new int[n];
		for (int i=0; i<n; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		
		for (int i=1; i<n; i++) {
			for (int j=1; j<=k && (i-j) >= 0; j++) {
				dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i] - h[i-j]));
			}
		}
 
		System.out.println(dp[n-1]);
	}
 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int[] h = new int[n];
		
		for (int i=0; i<n; i++) {
			h[i] = scanner.nextInt();
		}
		
		solve(n, k, h);
		
		scanner.close();
	}
}