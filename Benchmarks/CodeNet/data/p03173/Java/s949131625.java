import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int N;
	static int[] a;
	static long[] sum;
	static long[][] dp;
	static long f(int i, int j) {
		if(i == j) return 0;
		if(dp[i][j] != -1) return dp[i][j];
		long ans = Long.MAX_VALUE;
		for(int k = i; k < j; k++) {
			ans = Math.min(ans, f(i, k) + f(k + 1, j) + sum[j + 1] - sum[i]);
		}
		return dp[i][j] = ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		a = new int[N];
		sum = new long[N + 1];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sum[i + 1] = a[i];
			if(i != 0) sum[i + 1] += sum[i];
		}
		dp = new long[N][N];
		for(int i = 0; i < N; i++) Arrays.fill(dp[i], -1);
		System.out.println(f(0, N - 1));
	}
}