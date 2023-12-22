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
		dp [0] = 1;
		int cnt = 1;
		
		for (int i = 1; i < n; i++) {
			if (A[i] > A[i-1]) {
				++cnt;
				dp[i] = Math.max(dp[i-1] , cnt);
			} else {
				cnt = 1;
				dp[i] = dp[i-1];
			}
		}
	
		System.out.println(dp[n-1]);
	}
}