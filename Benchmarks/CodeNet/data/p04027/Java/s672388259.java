import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    private static final long MOD = 1000000007;

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int c = in.nextInt();
        int[] a = readArray(n, in);
        int[] b = readArray(n, in);

        long[][] sums = new long[c + 1][401];
        for (int i = 1; i < 401; i++) {
            long xi = 1;
            for (int j = 0; j < c + 1; j++) {
                sums[j][i] = (sums[j][i - 1] + xi) % MOD;
                xi = (xi * i) % MOD;
            }
        }

        long[][] dp = new long[n + 1][c + 1];
        dp[0][0] = 1;
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = dp[i - 1][0] * (sums[0][b[i - 1]] - sums[0][a[i - 1] - 1]) % MOD;
            for (int s = 1; s < c + 1; s++) {
                for (int j = 0; s - j >= 0; j++) {
                    dp[i][s] = (dp[i][s] + (dp[i - 1][s - j] * (sums[j][b[i - 1]] - sums[j][a[i - 1] - 1])) % MOD) % MOD;
                }
            }
        }
        out.println(dp[n][c]);

        out.close();
    }

    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(' ');
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}