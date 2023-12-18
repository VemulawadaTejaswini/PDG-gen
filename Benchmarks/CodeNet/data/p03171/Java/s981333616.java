import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int N;
	static int[] a;

	static long[][][] memo;
	static boolean[][][] flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		a = new int[N];
		memo = new long[2][N][N];
		flag = new boolean[2][N][N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			Arrays.fill(flag[0][i], false);
			Arrays.fill(flag[1][i], false);
		}

		System.out.println(dp(0, 0, 0));
		sc.close();
	}

	static long dp(int i, int x, int y) {
		if(x + y == N) {
			return 0;
		}
		if(flag[i][x][y]) {
			return memo[i][x][y];
		}
		flag[i][x][y] = true;

		long r;
		if(i == 0) {
			memo[i][x][y] = dp(1, x + 1, y) + a[x];
			r = dp(1, x, y + 1) + a[N - y - 1];
			if(memo[i][x][y] < r)
				memo[i][x][y] = r;
		}
		else {
			memo[i][x][y] = dp(0, x + 1, y) - a[x];
			r = dp(0, x, y + 1) - a[N - y - 1];
			if(memo[i][x][y] > r)
				memo[i][x][y] = r;
		}

		return memo[i][x][y];
	}
}