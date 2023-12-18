import java.util.Scanner;

class Main{
	static int N;

	static int[][] h;

	static int[][] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		h = new int[N][3];
		memo = new int[N][3];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				h[i][j] = sc.nextInt();
				memo[i][j] = -1;
			}
		}

		int ans = Math.max(dp(0, 0), Math.max(dp(0, 1), dp(0, 2)));

		System.out.println(ans);
		sc.close();
	}

	static int dp(int i, int x) {
		if(i >= N)
			return 0;
		if(memo[i][x] == -1) {
			int max = Integer.MIN_VALUE;
			for(int j = 0; j < 3; j++) {
				if(x != j) {
					int choice = dp(i + 1, j) + h[i][j];
					if(max < choice)
						max = choice;
				}
			}
			memo[i][x] = max;
		}
		return memo[i][x];
	}
}