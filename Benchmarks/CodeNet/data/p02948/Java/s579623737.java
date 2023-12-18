import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[][] = new int[N][2];
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, Comparator.comparingInt(o -> o[1]));
		long ans = 0;
		int cnt = 0;
		int day = 0;
		int now = N - 1;
		for(int i = now; i >= 0; i--) {
			if(A[i][0] + day <= M) {
				ans += A[i][1];
				day++;
				now = i - 1;
			}
		}
		System.out.println(ans);
		
		/*long dp[][] = new long[N + 1][M + 1];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= M; j++) {
				if(j - A[i] < 0) {
					dp[i + 1][j] = dp[i][j]; 
				} else {
					dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - A[i]] + B[i]);
				}
			}
		}
		long ans = 0;
		for(int i = 0; i < N; i++) {
			ans = Math.max(ans, dp[i][M]);
		}
		System.out.println(dp[N][M]);
		System.out.println(ans);*/
		
		
	}
}
