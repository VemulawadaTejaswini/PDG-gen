import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//import java.util..math

public class Main {
    private static Integer solve(Integer i, Integer total, Integer n, Integer W, int[] ws, int[] vs) {
        if (i > n - 1) {
            return 0;
        }

        Integer weight = ws[i];
        Integer val = vs[i];

        if (total + weight <= W) {
            Integer chose = val + solve(i+1, total + weight, n, W, ws, vs);
            Integer unchose = solve(i+1, total, n, W, ws, vs);
            return Math.max(chose, unchose);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int w = in.nextInt();
        int[] ws = new int[n];
        int[] vs = new int[n];
        for (int i = 0; i < n; i++) {
            ws[i] = in.nextInt();
            vs[i] = in.nextInt();
        }

        Integer ans = solve(0, 0, n, w, ws, vs);
        System.out.println(ans);

//        long[][] dp = new long[n + 1][w + 1];
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= w; j++) {
//                if (j - ws[i - 1] >= 0) {
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - ws[i - 1]] + vs[i - 1]);
//                } else {
//                    dp[i][j] = dp[i - 1][j];
//                }
//            }
//        }
//        System.out.println(dp[n][w]);
    }
}