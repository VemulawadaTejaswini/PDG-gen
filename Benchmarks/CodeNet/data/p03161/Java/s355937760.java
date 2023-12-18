package atcoder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int stepSize = scanner.nextInt();

        int[] dp = new int[count];
        int[] arr = new int[count];
        for (int i = 0; i < count; ++i) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < count; ++i) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= Math.min(i, stepSize); ++j) {
                dp[i] = Math.min(dp[i - j] + Math.abs(arr[i] - arr[j]), dp[i]);
            }
        }
        System.out.println(dp[count - 1]);
    }
}
