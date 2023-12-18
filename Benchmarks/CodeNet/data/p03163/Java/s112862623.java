import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int maxWeight = scanner.nextInt();

        int[] weights = new int[count];
        int[] values = new int[count];
        for (int i = 0; i < count; ++i) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }

        long[] dp = new long[maxWeight + 1];
        for (int i = 0; i < count; ++i) {
            for (int w = maxWeight; w >= weights[i]; --w) {
                dp[w] = Math.max(dp[w], dp[w - weights[i]] + values[i]);
            }
            System.out.println(Arrays.toString(dp));
        }

        System.out.println(dp[maxWeight]);
    }
}
