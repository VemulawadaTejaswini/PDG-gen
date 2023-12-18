// https://atcoder.jp/contests/abc145/submissions/8698269

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EAllyoucaneat solver = new EAllyoucaneat();
        solver.solve(1, in, out);
        out.close();
    }

    static class EAllyoucaneat {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int t = in.nextInt();
            int[] a = new int[n + 1];
            int[] b = new int[n + 1];
            ArrayList<Pair> alp = new ArrayList<Pair>();
            alp.add(new Pair(0, 0));
            int[][] dp = new int[n + 1][t + 2]; // dp[i][j] -> maximum value from 1 to i, within j min
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                alp.add(new Pair(a[i], b[i]));
            }
            Collections.sort(alp, Comparator.comparing(x -> x.time));
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= t; j++) {
                    // dp[i][j] = dp[i-1][j-a[i]] -> Add or dp[i-1][j] NoAdd
                    if (j - alp.get(i).time >= 0) {
                        dp[i][j] = Math.max(dp[i - 1][j - alp.get(i).time] + alp.get(i).val, dp[i - 1][j]);
                    } else {
                        // Add -> cannot
                        dp[i][j] = dp[i - 1][j];
                    }
                }
                dp[i][t + 1] = Math.max(dp[i - 1][t - 1] + alp.get(i).val, dp[i - 1][t + 1]);
            }
            out.println(dp[n][t + 1]);

        }

    }

    static class Pair {
        int time;
        int val;

        public Pair(int x, int y) {
            this.time = x;
            this.val = y;
        }

    }
}

