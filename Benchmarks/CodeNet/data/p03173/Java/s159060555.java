import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        long[] val = new long[n];
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            val[i] = in.nextInt();
            prefix[i + 1] += prefix[i] + val[i];
        }

        long[][] dp = new long[n][n];
        for (int gap = 1; gap < n; gap++) {
            for (int i = 0; i < n; i++) {
                if (i + gap < n) {
                    if (gap == 1) {
                        dp[i][i + gap] = val[i] + val[i + gap];
                    } else {
                        long min = Long.MAX_VALUE;
                        for (int p = i; p < i + gap; p++) {
                            if (p + 1 <= i + gap) {
                                min = Math.min(min, dp[i][p] + dp[p + 1][i + gap]);
                            }
                        }
                        dp[i][i + gap] = min + prefix[i + gap + 1] - prefix[i];
                    }
                }
            }
        }

        out.println(dp[0][n - 1]);
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}