import java.io.*;
import java.util.*;
import java.math.*;

public class Main {


    public static void solve() {
        int n = in.nextInt(), w = in.nextInt();

        int[] weights = new int[n];
        int[] values = new int[n];

        for(int i = 0; i < n; i += 1) {
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }

        long[][] store = new long[n][w+1];

        for(int j = 0; j <= w; j += 1)
            store[0][j] = weights[0] > j ? 0 : values[0];

        for(int i = 1; i < n; i += 1) {
            for(int j = 1; j <= w; j += 1) {
                store[i][j] = store[i-1][j];

                if(j-weights[i] >= 0)
                    store[i][j] = Math.max(store[i][j], values[i] + store[i-1][j-weights[i]]);
            }
        }

        out.println(store[n-1][w]);
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