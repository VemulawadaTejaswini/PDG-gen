import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++){
			h[i] = sc.nextInt();
		}
		sc.close();

		// db[i] = iマス目にたどり着くための最小コスト
		int[] dp = new int[n];
		Arrays.fill(dp, 99999999);
		dp[0] = 0; //最初のマスは0コスト
		// 3マス目以降は、1マス前,2マス前,...kマス前までの複数パターンの移動がある
		for(int i=1;i<n;i++){
			for(int j=1;j<=k && i-j>=0;j++){
				// 1マス前,2マス前,...kマス前までの最小値を求める
				dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i] - h[i-j]));
			}
		}
		// 最後のマスに到達するための必要数を出力する
		System.out.println(dp[n-1]);
	}
}
