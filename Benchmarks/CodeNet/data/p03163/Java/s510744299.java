import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int N;
	static int[] w, v;
	static long[][] memo;

	static long dp(int idx, int remW) {
		if(remW < 0)
			return -(int)1e9;
		if (idx == N)
			return 0;
		if (memo[idx][remW] != -1)
			return memo[idx][remW];

		long take = v[idx] + dp(idx + 1, remW - w[idx]);
		long leave = dp(idx + 1, remW);
		return memo[idx][remW] = Math.max(take, leave);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int W = sc.nextInt();
		w = new int[N];
		v = new int[N];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		memo = new long[N][W+1];
		for (long[] l : memo)
			Arrays.fill(l, -1);
		System.out.println(dp(0, W));

	}

}
