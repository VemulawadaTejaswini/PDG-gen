import java.util.Scanner;

public class Main {
	static long dp[];

	static long solve(int w[], int v[], long vSum, int wSum, int i, int W, int lastV) {
		if (wSum > W)
			return vSum - lastV;
		else if (wSum == W || (i >= w.length))
			return vSum;
		if (dp[i] == -1)
			return Long.max(solve(w, v, vSum + v[i], wSum + w[i], i + 1, W, v[i]),
					solve(w, v, vSum, wSum, i + 1, W, lastV));
		else
			return dp[i];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), W = sc.nextInt(), w[] = new int[N], v[] = new int[N];
		dp = new long[W];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			dp[i] = -1;
		}
		System.out.println(solve(w, v, 0, 0, 0, W, 0));
//		int dp[][] = new int[W][2];
//		dp[0][1]=v[]
//		for (int i = 1; i <= Integer.min(N, W); i++) {
//			dp[i] = dp[i - 1] + v[i - 1];
//		}
//		sc.close();
//		System.out.println(Integer.max(Integer.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
	}
}
