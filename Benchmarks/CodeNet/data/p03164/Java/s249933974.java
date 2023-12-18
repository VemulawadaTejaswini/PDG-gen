import java.util.Arrays;
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
        long[] dp = new long[1000 * N + 1];
        Arrays.fill(dp, 10000000000l);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            for (int j = 1000 * N; j >= v; j--) {
                dp[j] = Math.min(dp[j], dp[j - v] + w);
            }
        }

        for (int i = 1000 * N; i >= 0; i--) {
            if (dp[i] <= W) {
                System.out.println(i);
                return;
            }
        }
    }
}
