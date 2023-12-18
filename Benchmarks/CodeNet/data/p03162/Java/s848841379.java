import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CVacation solver = new CVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CVacation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int days = in.nextInt();
            int[][] dayvals = new int[days][3];
            for (int r = 0; r < days; r++) {
                for (int c = 0; c < 3; c++) {
                    dayvals[r][c] = in.nextInt();
                }
            }
            int[][] dp = new int[days + 1][3];
            for (int r = 1; r <= days; r++) {
                for (int c = 0; c < 3; c++) {
                    int max = Integer.MIN_VALUE;
                    for (int ct = 0; ct < 3; ct++) {
                        if (ct != c) max = Math.max(dayvals[r - 1][ct] + dp[r - 1][ct], max);
                    }
                    dp[r][c] = max;
                }
            }
            int max = 0;
            for (int c : dp[dp.length - 1]) max = Math.max(max, c);
            out.println(max);
        }

    }
}

