import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] match = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int cur = sc.nextInt();
                match[i][j] = (cur == 1);
            }
        }
        int m = (int) 1e9 + 7;
        long[] dp = new long[(1 << N) + 1];
        dp[0] = 1;
        for (int mask = 1; mask < (1 << N); mask++) {
            int i = Integer.bitCount(mask) - 1;
            for (int j = 0; j < N; j++) {
                if (match[i][j] && ((mask & (1 << j)) != 0)) {
                    dp[mask] = (dp[mask] + dp[mask - (1 << j)]) % m;
                }
            }

        }

        System.out.println(dp[(1 << N) - 1]);
    }


}
