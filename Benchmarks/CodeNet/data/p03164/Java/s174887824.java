import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int N = sc.nextInt();
        int W = sc.nextInt();
        long[] dp = new long[W + 1];
        Arrays.fill(dp, 0l);
        for (int i = 0; i < N; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            for (int j = W; j >= w; j--) {
                dp[j] = Math.max(dp[j], dp[j - w] + v);
            }
        }

        long max = 0;
        for (int i = 1; i <= W; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
