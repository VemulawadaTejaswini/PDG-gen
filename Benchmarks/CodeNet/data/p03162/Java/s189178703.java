import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int[][] act = new int[N][3];
			for(int i = 0 ; i < N; i++) {
				act[i][0] = sc.nextInt();
				act[i][1] = sc.nextInt();
				act[i][2] = sc.nextInt();
			}

			int[][] dp = new int[N + 1][3];
			for(int i = 0; i < 3; i++) dp[0][i] = act[0][i];

			for(int i = 1; i < N; i++) {
				for(int j = 0; j < 3; j++) {
					dp[i][j] = Math.max(dp[i - 1][(j + 1) % 3] + act[i][j], dp[i - 1][(j + 2) % 3] + act[i][j]);
				}
			}
			System.out.println(Math.max(dp[N - 1][0], Math.max(dp[N - 1][1], dp[N - 1][2])));
		}
	}
}
