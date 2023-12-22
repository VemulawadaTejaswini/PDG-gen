import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();

		int dp[][];

		int[][] p = new int[d+1][n+1];

		for(int day = 1; day <= d; day++) {

			for(int stockNum = 1; stockNum <= n; stockNum++) {
				p[day][stockNum] = sc.nextInt();
			}
		}

		for(int day = 1; day <= d-1; day++) {

			//dp[i][j] = 各日において、iまでの株をj円以下から選んだ時の翌日の最大差額
			// i=0, j=0の時は0で初期化
			dp = new int[n+1][x+1];

			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= x; j++) {
					if(j < p[day][i]) {
						//当日の株価より所持金が低い場合は買えないため、今までの株についての最大値を入れる
						dp[i][j] = dp[i-1][j];
					}else {
						//当日の株価よりも高い場合は、自分の株価を引いた総金額が所持金の場合＋1株追加で買った場合と、
						//今までの株のみ＝この株は買わない場合を比べる
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j- p[day][i]] + p[day+1][i] - p[day][i]);
					}
				}
			}

			x += dp[n][x];
		}
		System.out.println(x);
	}
}


