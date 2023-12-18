import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int maxWeight = scanner.nextInt();

        int[] weights = new int[count];
        int[] values = new int[count];
        int sumValue = 0;
        for (int i = 0; i < count; ++i) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
            sumValue += values[i];
        }

        long[] dp = new long[sumValue + 1];
        for (int v = 1; v <= sumValue; ++v) {
            dp[v] = maxWeight + 1;
        }

        for (int i = 0; i < count; ++i) {
            for (int v = sumValue; v >= values[i]; --v) {
                dp[v] = Math.min(dp[v], dp[v - values[i]] + weights[i]);
            }
        }

        int res = 0;
        for (int v = 0; v <= sumValue; ++v) {
            if (dp[v] <= maxWeight) {
                res = v;
            }
        }
        System.out.println(res);
    }
}
