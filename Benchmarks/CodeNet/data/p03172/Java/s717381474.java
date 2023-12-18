import java.io.*;
import java.util.*;

public class Main {

    static int mod = (int) (1e9 + 7);

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = in.nextInt();
        }

        long[] dp = new long[k + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            long[] dp2 = new long[k + 1];
            for (int j = k; j >= 0; j--) {
                int l = j + 1;
                int r = Math.min(j + val[i], k);
                if (l <= r) {
                    dp2[l] = (dp2[l] + dp[j]) % mod;
                    if (r + 1 <= k) {
                        dp2[r + 1] = (dp2[r + 1] - dp[j]) % mod;
                    }
                }
            }
            long pref = 0;
            for (int j = 0; j <= k; j++) {
                pref = (pref + dp2[j]) % mod;
                dp[j] = (dp[j] + pref) % mod;
            }
        }

        out.println(dp[k] % mod);
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
