import java.io.*;
import java.util.*;

public class Main {

    static long mod = (long) (1e9 + 7);

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        long[] dp = new long[1 << n];
        dp[0] = 1;
        for (int mask = 0; mask < (1 << n) - 1; mask++) {
            int j = countSetBits(mask);
            for (int k = 0; k < n; k++) {
                if (((mask) & (1 << k)) == 0 && a[j][k] == 1) {
                    int mask2 = mask ^ (1 << k);
                    dp[mask2] = (dp[mask2] + dp[mask]) % mod;
                }
            }
        }
        out.println(dp[(1 << n) - 1]);
        out.close();
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
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