import java.util.Scanner;

public class Main {

	static long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] broken =new int[M];

		for (int i = 0; i < M; i++) {
			broken[i] = sc.nextInt();
		}

		int[] dp=new int[N+1];
		dp[N] = 1;
		for (int i = N-1; i >= 0; i--) {
			boolean judge = false;
			for (int j = 0; j < M; j++) {
				if (broken[j] == i) judge = !judge;
			}
			if (judge) {
				continue;
			}else {
				int con = 0;
				//1段
				if (i+1 <= N) {
					con += dp[i+1] % MOD;
				}
				//2段
				if (i+2 <= N) {
					con += dp[i+2] % MOD;
				}
				dp[i] = Math.max(dp[i], con);
			}
		}

		System.out.println(dp[0]);

	}

}
