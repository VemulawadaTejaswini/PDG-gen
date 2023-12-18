import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] W = new int[M];
		for(int i = 0; i < M; i++) {
			W[i] = sc.nextInt();
		}
		sc.close();
		
		long MOD = (long) 1e9 + 7;
		long[] dp = new long[N + 2]; 
		dp[0] = 1;
		int brokenSteps = 0;
		long answer = 0;
		
		for(int i = 0; i < N; i++) {
			if(brokenSteps < M && i == W[brokenSteps]) {
				brokenSteps++;
				continue;
			}
			dp[i + 1] += dp[i];
			dp[i + 2] += dp[i];
			if(i == N - 1) {
				answer = dp[N];
			}
		}
		System.out.println(answer % MOD);
		
	}
}
