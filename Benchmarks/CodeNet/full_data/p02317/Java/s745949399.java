import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		
		int[] dp = new int[n];
		dp [0] = 0;
		int cnt = 1;
		
		for (int i = 1; i < n; i++) {
			if (dp [i] > dp[i-1]) {
				++cnt;
				dp[i] = Math.max(dp[i-1] , cnt);
			} else {
				dp[i] = dp[i-1];
				cnt = 1;
			}
		}
	
		System.out.println(dp[n-1]);
	}
}