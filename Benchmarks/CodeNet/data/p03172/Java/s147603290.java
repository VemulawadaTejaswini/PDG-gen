import java.io.*;
import java.util.*;
import java.math.*;

public class Main {


    public static void solve() {
        int mod = (int) (1e9 + 7);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] canHave = new int[n];

        for (int i = 0; i < n; i += 1) {
            canHave[i] = in.nextInt();
        }

        long[][] store = new long[n][k + 1];

        for (int j = 0; j <= k; j += 1) {
            if (canHave[0] >= j)
                store[0][j] = 1;
        }

        for(int i = 1; i < n; i += 1)
            store[i][0] = 1;

        for (int i = 1; i < n; i += 1) {
            long[] prefixSum = new long[k+1+1];
            prefixSum[0] = 1;
            for(int j = 0; j <= k; j += 1)
                prefixSum[j+1] = (prefixSum[j] + store[i-1][j])%mod;

            for (int j = 1; j <= k; j += 1) {
                long count = prefixSum[j+1] - prefixSum[(j-Math.min(canHave[i], j))];
                store[i][j] = count%mod;
            }
        }


        out.println((store[n - 1][k])%mod);

    }


    public static InputReader in = new InputReader();
    public static PrintWriter out;

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        /**
         * When you call next(), that entire line will be skipped.
         * No flushing buffers.
         * Doesn't work when you want to scan the remaining line.
         *
         * @return entire line
         */
        public String nextLine() {
            String str = "";
            try {
                str = reader.readLine();
                tokenizer = null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }
}