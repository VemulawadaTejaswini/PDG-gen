import java.util.Arrays;
import java.util.Scanner;

public class D_Knapsack1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        long[][] dp = new long[N + 1][W + 1];

        for (int i = 1; i <= N; i++) {
            int wi = sc.nextInt(); // Weight of the item(i)
            int vi = sc.nextInt(); // Value of the item(i)
            for (int j = 0; j <= W; j++) {
                // Get max total value of items under weight j.
                if (wi <= W && wi <= j) {
                    // Compare weight of item, previous value, and summed value
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wi] + vi);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(Arrays.stream(dp[N]).max().getAsLong());
    }
}