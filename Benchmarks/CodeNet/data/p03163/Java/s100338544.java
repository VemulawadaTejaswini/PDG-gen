

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = null;
    int totalCases, testNum;

    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    void solve() throws IOException {

    }

    void execute() throws IOException {
        int n = ni();
        int w = ni();
        int[][] k = new int[n][2];
        for (int i = 0; i < n; i++) {
            k[i][0] = ni();
            k[i][1] = ni();
        }
        long[][] dp = new long[n + 1][w + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                int weight = k[i - 1][0];
                int value = k[i - 1][1];
                if (j >= weight) {
                    dp[i][j] = Math.max(value + dp[i - 1][j - weight], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        out.print(dp[n][w]);

        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().execute();
    }

    void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String ns() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(br.readLine());
        }
        return tokenizer.nextToken();
    }

    String nline() throws IOException {
        tokenizer = null;
        return br.readLine();
    }

    boolean input() throws IOException {
        return true;
    }

}
