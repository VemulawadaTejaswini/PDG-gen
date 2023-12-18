

import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

import java.util.Scanner;

import static java.lang.Math.max;


public class MainApp extends ClassPathScanningCandidateComponentProvider{

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int[] weight = new int[n + 1];
        int[] value = new int[n + 1];
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 1; i <= n; i++) {
            weight[i] = scan.nextInt();
            value[i] = scan.nextInt();
        }

        // dp[i][j]  表示选到第i个物品时剩余j容量的最大价值
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if(j >= weight[i]) {
                   dp[i][j] = max(dp[i][j], dp[i-1][j-weight[i]] + value[i]);
                } else {
                   dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][w]);
    }


}