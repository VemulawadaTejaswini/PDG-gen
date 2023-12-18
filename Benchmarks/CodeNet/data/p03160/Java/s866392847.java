import java.util.Scanner;

public class Main {
	
	private static void solve(int n ,int[] h) {
		
		int[] dp = new int[n];
		for (int i=0; i<n; i++) {
			dp[i] = 1000000;
		}
		dp[0] = 0;
		
		for (int i=0; i<n-2; i++) {
			
			dp[i+1] = Math.min(
						dp[i] + Math.abs(h[i] - h[i+1]), 
						dp[i+1]
						);
			
			dp[i+2] = Math.min(
					dp[i] + Math.abs(h[i] - h[i+2]), 
					dp[i+2]
					);
		}

		dp[n-1] = Math.min(dp[n-1], dp[n-2] + Math.abs(h[n-1] - h[n-2]));
		
		System.out.println(dp[n-1]);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] h = new int[n];
		
		for (int i=0; i<n; i++) {
			h[i] = scanner.nextInt();
		}
		
		solve(n, h);
		
		scanner.close();
	}

}
