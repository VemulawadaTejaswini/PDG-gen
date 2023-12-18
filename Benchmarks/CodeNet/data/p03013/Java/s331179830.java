import java.util.Scanner;

public class Main {
	private final static long mod = 1000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		// 壊れている段は-1,壊れていない段は0とする
		long[] dp = new long[N];
		int key = 0;
		for (int i = 0; i < dp.length; i++) {
			dp[i] = 0;
			for (int j = key; j < a.length; j++) {
				if ((i + 1) == a[j]) {
					dp[i] = -1;
					key = j + 1;
					break;
				}
			}
		}

		// --test
		// System.out.print("# ");
		// for (int i = 0; i < dp.length; i++) {
		// 	System.out.print(dp[i] + " ");
		// }
		// System.out.println("");
		// --test

		// 最後の段に1を設定
		dp[dp.length - 1] = 1;
		// 最後の1段前が壊れていなければ1を設定
		if (dp[dp.length - 2] == 0)
			dp[dp.length - 2] = 1;
		// 壊れている段を飛ばして最後の段までのパターンを取得する
		for (int i = dp.length - 3; i >= 0; i--) {
			if (dp[i] == -1)
				continue;
			long p = 0L;
			// 1段上に行ける場合
			if (dp[i + 1] >= 0) p += dp[i + 1];
			// 2段上に行ける場合
			if (dp[i + 2] >= 0) p += dp[i + 2];
			// パターンを設定
			dp[i] = p;
		}

		// --test
		// System.out.print("# ");
		// for (int i = 0; i < dp.length; i++) {
		// 	System.out.print(dp[i] + " ");
		// }
		// System.out.println("");
		// --test

		// 結果出力
		long p1 = dp[0] == -1 ? 0 : dp[0];
		long p2 = dp[1] == -1 ? 0 : dp[1];
		System.out.println((p1 + p2) % mod);
	}
}
