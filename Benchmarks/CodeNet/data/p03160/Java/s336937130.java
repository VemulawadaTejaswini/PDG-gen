import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++){
			h[i] = sc.nextInt();
		}
		sc.close();

		// db[i] = iマス目にたどり着くための最小コスト
		int[] dp = new int[n];
		dp[0] = 0; //最初のマスは0コスト
		// 2つ目のマスは、1つ前から移動するパターンのみ
		dp[1] = Math.abs(h[1] - h[0]); // Math.aps()は絶対値を返す
		// 3マス目以降は、1マス前または2マス前からの2パターンの移動がある
		for(int i=2;i<n;i++){
			// 1マス前から移動したときの最小コストを求める
			int step1 = dp[i-1] + Math.abs(h[i] - h[i-1]);
			// 2マス前から移動したときの最小コストを求める
			int step2 = dp[i-2] + Math.abs(h[i] - h[i-2]);
			// 2つの最小値を求めることで、i+1マス目の最小コストを求めることができる
			dp[i] = Math.min(step1, step2);
		}
		// 最後のマスに到達するための必要数を出力する
		System.out.println(dp[n-1]);
	}
}