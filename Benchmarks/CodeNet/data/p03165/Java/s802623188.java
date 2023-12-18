

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
        String s = ns();
        String t = ns();
        int n = s.length(), m = t.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char c1 = s.charAt(i - 1);
                char c2 = t.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int i  = n, j = m;
        StringBuilder sb = new StringBuilder();
        while (dp[i][j] > 0) {
            if (s.charAt(i - 1) == t.charAt(j - 1)) {
                sb.append((s.charAt(i - 1)));
                i--;
                j--;
            } else if (dp[i-1][j] > dp[i][j-1]){
                i--;
            } else {
                j--;
            }
        }

        out.print(sb.reverse().toString());


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
