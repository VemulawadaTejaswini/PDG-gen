import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		int m = sc.nextInt();
		
		for (int i = 0; i< m; i++) {
			int a = sc.nextInt();
			dp[a] = -1;
		}
		
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i = 2; i < dp.length;i++) {
			if (dp[i] == -1) {
				dp[i] = 0;
			} else {
				dp[i] = dp[i-1] + dp[i-2];
			}
		}
		
		System.out.println(dp[dp.length-1]);
	}

}
