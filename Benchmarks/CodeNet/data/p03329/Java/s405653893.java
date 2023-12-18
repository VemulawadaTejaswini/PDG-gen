import java.util.Arrays;
import java.util.Scanner;

/* 参考:　貰う DP と配る DP、メモ化再帰、個数制限なしナップサック問題 @drken https://qiita.com/drken/items/ace3142967c4f01d42e9#%E8%A7%A3%E6%B3%95-1-1-%E3%83%88%E3%83%83%E3%83%97%E3%83%80%E3%82%A6%E3%83%B3%E3%81%AB-n-%E3%82%92%E9%99%8D%E4%B8%8B%E3%81%97%E3%81%A6%E3%81%84%E3%81%8F%E3%83%A1%E3%83%A2%E5%8C%96%E5%86%8D%E5%B8%B0 */

public class Main {
	static final int MAX_N = 110000;
	static int[] dp = new int[MAX_N];
	static {
		Arrays.fill(dp, MAX_N); // 初期化 Infinity
		dp[0] = 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		calc(N);
		System.out.println(dp[N]);
	}

	static void calc(int N) {
		for (int n = 1; n <= N; n++) {
			for (int pow6 = 1; pow6 <= n; pow6*=6) {
				dp[n] = Math.min(dp[n], dp[n-pow6] + 1);
			}
			for (int pow9 = 1; pow9 <= n; pow9*=9) {
				dp[n] = Math.min(dp[n], dp[n-pow9] + 1);
			}
		}
	}
}
