import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bars = { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        int[] as = new int[m];
        for (int i = 0; i < m; i++) {
            as[i] = sc.nextInt();
        }
        Arrays.sort(as);

        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                if (i - bars[as[j]] >= 0) {
                    dp[i] = Math.max(dp[i], dp[i - bars[as[j]]] + 1);
                }
            }
        }

        StringBuilder sb = new StringBuilder(dp[n]);
        int remainBars = n;
        while (remainBars > 0) {
            for (int j = m - 1; j >= 0; j--) {
                if (remainBars - bars[as[j]] >= 0 && dp[remainBars - bars[as[j]]] == dp[remainBars] - 1) {
                    sb.append(as[j]);
                    remainBars -= bars[as[j]];
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
