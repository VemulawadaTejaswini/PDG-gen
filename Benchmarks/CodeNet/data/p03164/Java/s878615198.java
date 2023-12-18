import java.util.Scanner;

import static java.lang.Math.max;


public class MainApp{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] weight = new int[n + 1];
        int[] value = new int[n + 1];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            weight[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
            sum = sum > value[i]?sum:value[i];
        }
        long[] dp = new long[sum + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1000000000;
        }
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = sum - value[i]; j >= 0; j--) {
                dp[j + value[i]] = max(dp[j + value[i]], dp[j] + weight[i]);
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] <= w) {
                max = i;
            }
        }
        System.out.println(max);
    }



}