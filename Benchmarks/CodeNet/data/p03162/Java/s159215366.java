import java.io.*;
import java.util.*;
import java.math.*;

public class Main {


    public static void solve() {
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for(int i = 0; i < n; i += 1) {
            a[i] = in.nextInt(); b[i] = in.nextInt(); c[i] = in.nextInt();
        }

        int[][] store = new int[n][3];

        store[0][0] = a[0];
        store[0][1] = b[0];
        store[0][2] = c[0];

        for(int i = 1; i < n; i += 1) {
            for(int j = 0; j < 3; j += 1) {
                if(j == 0) {
                    store[i][j] = a[i] + Math.max(store[i-1][1], store[i-1][2]);
                } else if(j == 1) {
                    store[i][j] = b[i] + Math.max(store[i-1][0], store[i-1][2]);
                } else {
                    store[i][j] = c[i] + Math.max(store[i-1][0], store[i-1][1]);
                }
            }
        }

        out.println(Math.max(store[n-1][0], Math.max(store[n-1][1], store[n-1][2])));
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