import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
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
            int n = in.nextInt();
            in.nextLine();

            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) {
                String s = in.nextLine();
                String[] token = s.split(" ");
                a[i] = Integer.parseInt(token[0]);
                b[i] = Integer.parseInt(token[1]);
                c[i] = Integer.parseInt(token[2]);
            }

            // dp[i][j] -> This holds the maximum happiness till ith day
            //                  and considering jth activity
            int[][] dp = new int[n][3];

            dp[0][0] = a[0];
            dp[0][1] = b[0];
            dp[0][2] = c[0];
            for (int i = 1; i < n; i++) {
                dp[i][0] = a[i] + Math.max(dp[i - 1][1], dp[i - 1][2]);
                dp[i][1] = b[i] + Math.max(dp[i - 1][0], dp[i - 1][2]);
                dp[i][2] = c[i] + Math.max(dp[i - 1][0], dp[i - 1][1]);
            }

            out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
        }

    }
}

