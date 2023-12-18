import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int w = in.nextInt();

        int[] wa = new int[n];
        long[] va = new long[n];
        for (int i = 0; i < n; i++) {
            wa[i] = in.nextInt();
            va[i] = in.nextInt();
        }
        long[][] dp = new long[n][w];
        for (int i = 0; i < w; i++) {
            if (i >= wa[0] - 1)
                dp[0][i] = va[0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < w; j++) {
                long val = j - wa[i] >= 0 ? dp[i - 1][j - wa[i]] + va[i] : 0;
                dp[i][j] = Math.max(dp[i - 1][j], val);
            }
        }

        long ans = 0;
        for (int k = 0; k < w; k++) {
            ans = Math.max(ans, dp[n - 1][k]);
        }
        out.println(ans);
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

    }
}
