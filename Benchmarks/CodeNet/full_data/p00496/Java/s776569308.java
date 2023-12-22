import java.util.Arrays;
import java.util.Scanner;
  
  
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		int[][] dp = new int[n+1][t+1];
		for(int i = 0; i < n+1; i++) {
			Arrays.fill(dp[i], -1);
			dp[i][0] = 0;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= t; j++) {
				if(dp[i][j] == -1) continue;
				dp[i+1][j] = Math.max(dp[i][j], dp[i+1][j]);
				int tmp = j + b[i];
				if(tmp > t || (tmp > s && j < s)) continue;
				dp[i+1][tmp] = Math.max(dp[i+1][tmp], dp[i][j] + a[i]);
				dp[i+1][s] = Math.max(dp[i+1][s], dp[i][j] + a[i]);
			}
		}
		/*
		for(int i = 0; i < n+1; i++) {
			for(int j = 0; j < t+1; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		int ans = 0;
		for(int i = 0; i < t+1; i++) {
			ans = Math.max(ans, dp[n][i]);
		}
		System.out.println(ans);
		
		
		
		
		
	}
}