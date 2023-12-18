
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    static long[] dp;
    static long[] pre;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int[][] can = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                can[i][j] = scanner.nextInt();
            }
        }
        pre = new long[(1 << n)];
        for (int mask = 0; mask < (1 << n); mask++) {
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    for (int j = i + 1; j < n; j++) {
                        if ((mask & (1 << j)) != 0)
                            pre[mask] += can[i][j];
                    }
                }
            }
        }
        dp = new long[1 << n];
        Arrays.fill(dp, Long.MIN_VALUE);
        dp[0]=0;
        for (int mask = 0; mask < (1 << n); mask++) {
            ArrayList<Integer> notTaken = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == 0)
                    notTaken.add(i);
            }
            rec(0, dp[mask], notTaken, mask, 0);
        }
        System.out.println(dp[(1<<n)-1]);

    }

    private static void rec(int i, long score, ArrayList<Integer> notTaken, int mask, int group) {
        if (i == notTaken.size()) {
            dp[mask] = Math.max(dp[mask], score + pre[group]);
            return;
        }
        rec(i+1, score,notTaken,mask | (1<<notTaken.get(i)),group | (1<<notTaken.get(i)));
        rec(i+1, score,notTaken,mask ,group );
    }
}
