/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // Trust me, you'll thank me later...
        double N = sc.nextDouble();
        int ones = 0;
        int twos = 0;
        int threes = 0;
        for (int i = 0; i < N; i++) {
            switch (sc.nextInt()) {
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
            }
        }
        double[][][] dp = new double[(int) N + 1][(int) N + 1][(int) N + 1];
        // At most N = 300, so 100^3 = 10^6 run time.
        // dp[i][j][k] = expected number of moves untitl reaching 0, 0, 0 left

        for (int k = 0; k <= N; k++) {
            for (int j = 0; j <= N; j++) {
                for (int i = 0; i <= N; i++) {
                    // Our recurrence is dp[i][j][k] = 1 + p(take from 1 pile) * 1 piles + ...
                    if (i == 0 && j == 0 && k == 0 || (i + j + k) > N) continue;

                    if (i > 0) {
                        // Take from 1 => i-1, j, k
                        dp[i][j][k] += (i / N) * (dp[i - 1][j][k]);
                    }
                    if (j > 0) {
                        // Take from 2 => i+1, j-1, k!
                        dp[i][j][k] += (j / N) * (dp[i + 1][j - 1][k]);
                    }
                    if (k > 0) {
                        // Take from 3 => i, j+1, k-1!
                        dp[i][j][k] += (k / N) * (dp[i][j + 1][k - 1]);
                    }
                    // There's the last possibility of taking a zero, so we just add another step
//                    double p_waste = (N - (i + j + k)) / N;
                    // Geometric series of repeatedly taking from a zero pile
                    dp[i][j][k]++;
                    dp[i][j][k] *= (N / (i + j + k));// p_waste / ((1 - p_waste) * (1 - p_waste));
                }
            }
        }
//        for (int i = 0; i <= ones; i++) {
//            for (int j = 0; j <= twos; j++) {
//                for (int k = 0; k <= threes; k++) {
//                    System.out.println("Expected moves until 0,0,0 from " + i + " " + j + " " + k + " : " + dp[i][j][k]);
//                }
//            }
//        }
        out.println(dp[ones][twos][threes]);
        out.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        FastScanner(FileReader s) {
            br = new BufferedReader(s);
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        String nextLine() throws IOException { return br.readLine(); }

        double nextDouble() throws IOException { return Double.parseDouble(next()); }

        int nextInt() throws IOException { return Integer.parseInt(next()); }

        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}