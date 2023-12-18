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

    static void sortArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPos = random.nextInt(a.length);
            int t = a[i];
            a[i] = a[randomPos];
            a[randomPos] = t;
        }
        Arrays.sort(a);
    }

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int h = in.nextInt();
        int w = in.nextInt();
        char[][] c = new char[w][h];
        for (int i = 0; i < h; i++) {
            String s = in.nextString();
            for (int j = 0; j < s.length(); j++) {
                c[j][i] = s.charAt(j);
            }
        }

        long ans = 0;
        for (int i = 0; i < w - 1; i++) {
            ans += solveColumns(c[i], c[i + 1], h);
        }
        out.println(ans);

        out.close();
    }

    private static long solveColumns(char[] col1, char[] col2, int n) {
        int[][] cost = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                cost[i][j] = cost[i - 1][j - 1] + (col1[i - 1] == col2[j - 1] ? 1 : 0);
            }
        }

        long[][] dp = new long[n + 1][n + 1];
        for (int i = n; i >= 0; i--) {
            for (int j = n; j >= 0; j--) {
                if (i == n && j == n) {
                    dp[i][j] = 0;
                } else if (i == n) {
                    dp[i][j] = dp[i][j + 1] + cost[i][j + 1];
                } else if (j == n) {
                    dp[i][j] = dp[i + 1][j] + cost[i + 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j] + cost[i + 1][j], dp[i][j + 1] + cost[i][j + 1]);
                }
            }
        }

        return dp[0][0];
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