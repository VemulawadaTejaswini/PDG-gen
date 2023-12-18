import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static int mod = (int) (1e9 + 7);
    static int total;
    static int n;
    static int[][] mapping;
    static Long[][] store;

    public static void solve() {
        n = in.nextInt();
        total = (1 << n) - 1;

        mapping = new int[n][n];
        store = new Long[(int) Math.pow(2, n)][n + 1];

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                mapping[i][j] = in.nextInt();
            }
        }

        long result = calc(0, 0, store) % mod;

        out.println(result);
    }

    private static long calc(int mask, int i, Long[][] store) {
        if (mask == total)
            return 1;
        if (i == n)
            return 0;

        if (store[mask][i] != null)
            return store[mask][i];

//        long ans = calc(mask, i + 1, store);

        long ans = 0;

        for (int j = 0; j < mapping[i].length; j += 1) {
            if ((mask & (1 << j)) == 1)
                continue;

            if (mapping[i][j] == 1)
                ans += calc(mask | 1 << j, i + 1, store) % mod;
        }

        store[mask][i] = ans % mod;
        return store[mask][i];
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