import java.util.Scanner;

import static java.lang.Math.max;


public class MainApp{

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int[] weight = new int[n + 1];
        int[] value = new int[n + 1];
        int[] dp = new int[w + 1];
        for (int i = 1; i <= n; i++) {
            weight[i] = scan.nextInt();
            value[i] = scan.nextInt();
        }

        // dp[i][j]  表示选到第i个物品时剩余j容量的最大价值
        for (int i = 1; i <= n; i++) {
            for (int j = w; j >= 0; j--) {
                if(j >= weight[i]) {
                    dp[j] = max(dp[j], dp[j-weight[i]] + value[i]);
                } else {
                }
            }
        }
        System.out.println(dp[w]);
    }


}