import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 1000000007;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
        }
        int[][][] dp = new int[n][m][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], 10000000);
            }
        }
        if (s[0].charAt(0) == '#') {
            dp[0][0][1] = 1;
        } else {
            dp[0][0][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 1 < n) {
                    if (s[i + 1].charAt(j) == '#') {
                        dp[i + 1][j][1] = Math.min(dp[i + 1][j][1], Math.min(dp[i][j][0] + 1, dp[i][j][1]));
                    } else {
                        dp[i + 1][j][0] = Math.min(dp[i + 1][j][0], Math.min(dp[i][j][1], dp[i][j][0]));
                    }
                }
                if (j + 1 < m) {
                    if (s[i].charAt(j + 1) == '#') {
                        dp[i][j + 1][1] = Math.min(dp[i][j + 1][1], Math.min(dp[i][j][0] + 1, dp[i][j][1]));
                    } else {
                        dp[i][j + 1][0] = Math.min(dp[i][j + 1][0], Math.min(dp[i][j][1], dp[i][j][0]));
                    }
                }
            }
        }
        out.println(Math.min(dp[n - 1][m - 1][0], dp[n - 1][m - 1][1]));
    }

}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
