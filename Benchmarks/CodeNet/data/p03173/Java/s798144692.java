import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; ++i) {
            arr[i] = scanner.nextInt();
        }

        long[][] dp = new long[count][count];
        for (int size = 1; size < count; ++size) {
            for (int i = 0; i + size < count; ++i) {
                long minCost = Long.MAX_VALUE;
                long sum = 0;

                for (int j = 0; j < size; ++j) {
                    minCost = Math.min(minCost, dp[i][i + j] + dp[i + j + 1][i + size]);
                }

                for (int j = 0; j <= size; ++j) {
                    sum += arr[i + j];
                }
                dp[i][i + size] = minCost + sum;
            }
        }
        System.out.println(dp[0][count - 1]);
    }
}
