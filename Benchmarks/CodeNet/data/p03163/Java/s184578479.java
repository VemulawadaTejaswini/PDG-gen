import java.util.Scanner;

// D - Knapsack 1
// https://atcoder.jp/contests/dp/tasks/dp_d
// #DP #ナップサック
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        int W = Integer.parseInt(scanner.next());

        int[][] wv = new int[N][2];
        for (int i = 0; i < N; i++) {
            wv[i][0] = Integer.parseInt(scanner.next());
            wv[i][1] = Integer.parseInt(scanner.next());
        }

        scanner.nextLine();

        // dp[i][sum_w]: i-1番目までの品目から重さが sum_w
        // を超えないように選んだ際の価値の総和の最大値
        long[][] dp = new long[N + 1][W + 1];

        for (int i = 0; i < N; i++) { // 品目
            for (int sumW = 0; sumW <= W; sumW++) { // 重さ
                if (sumW >= wv[i][0]) {
                    // 選ぶ場合
                    dp[i + 1][sumW] = Math.max(dp[i][sumW], dp[i][sumW - wv[i][0]] + wv[i][1]);
                } else {
                    // 選ばない場合
                    dp[i + 1][sumW] = dp[i][sumW];
                }
            }
        }

        System.out.println(dp[N][W]);
    }
}