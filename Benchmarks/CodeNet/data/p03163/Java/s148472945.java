import java.util.*;
public class Main {
   private static int dp[];
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int w = sc.nextInt();
        int[] wgt = new int[n];
        int[] val = new int[n];
		long[][] dp = new long[n+1][w+1];
        for (int i = 0; i < n; i++) {
        	wgt[i] = sc.nextInt();
        	val[i] = sc.nextInt();
        }
//3 8
//3 30
//4 50
//5 60
for (int i = 0; i < n; ++i) {
        for (int sum_w = 0; sum_w <= w; ++sum_w) {

            // i 番目の品物を選ぶ場合
            if (sum_w - wgt[i] >= 0) {
                dp[i+1][sum_w]=chmax(dp[i+1][sum_w], dp[i][sum_w - wgt[i]] + val[i]);
            } else {

	            // i 番目の品物を選ばない場合
	            dp[i+1][sum_w]=chmax(dp[i+1][sum_w], dp[i][sum_w]);
	        }
        }
    }
		System.out.println(dp[n][w]);
	}

	private static long chmax(long i, long j) {
		return Math.max(i, j);
	}
}






