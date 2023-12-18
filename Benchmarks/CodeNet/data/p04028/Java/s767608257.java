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

    private static long fastPow(long x, long y, long mod) {
        if (x == 1) {
            return 1;
        }
        if (y == 0) {
            return 1;
        }
        long p = fastPow(x, y / 2, mod) % mod;
        p = p * p % mod;
        if (y % 2 == 1) {
            p = p * x % mod;
        }
        return p;
    }

    private static final long MOD = 1000000007;

    public static void main(String[] args) throws FileNotFoundException {
//        InputReader in = new InputReader(new FileInputStream("gangs.in"));
//        PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream("gangs.out")));

        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        final int n = in.nextInt();
        String s = in.nextString();
        int l = s.length();
        long res = 0;
        for (int b = (n - l + 1) / 2; b <= n - l; b++) {
            int k = n - l - b;
            long[][][] dp = new long[k + 1][b + 1][l + 1];
            dp[0][0][0] = 1;
            for (int x = 0; x <= l; x++) {
                if (x == 0) {
                    for (int i = 0; i <= k; i++) {
                        for (int j = 0; j <= b; j++) {
                            if (i > 0) {
                                dp[i][j][x] = (dp[i][j][x] + dp[i - 1][j][x]) % MOD;
                            } if (j - i <= b - k && j > 0) {
                                dp[i][j][x] = (dp[i][j][x] + dp[i][j - 1][x]) % MOD;
                            }
                        }
                    }
                } else {
                    for (int i = 0; i <= k; i++) {
                        for (int j = 0; j <= b; j++) {
                            if (i > 0) {
                                dp[i][j][x] = (dp[i][j][x] + dp[i - 1][j][x]) % MOD;
                            }
                            if (j - i <= n - l - 2 * k && j > 0) {
                                dp[i][j][x] = (dp[i][j][x] + dp[i][j - 1][x]) % MOD;
                            }
                            if (j - i == n - l - 2 * k) {
                                dp[i][j][x] = (dp[i][j][x] + dp[i][j][x - 1]) % MOD;
                            }
                        }
                    }
                }
            }
            res = (res + dp[k][b][l] * fastPow(2, k, MOD) % MOD) % MOD;
        }
        out.println(res % MOD);

//      out.println(minLines);
//      out.println("Time:" + (System.currentTimeMillis() - startTime));
        out.close();
    }


    private static Map<String, Integer> solve(int excludeRow, int excludeCol, int n, int m, boolean[][] board) {
        int[] rowPlusCnt = new int[m];
        int[] colPlusCnt = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j]) {
                    if (i != excludeRow && j != excludeCol) {
                        rowPlusCnt[i]++;
                        colPlusCnt[j]++;
                    }
                }
            }
        }

        boolean[] excludedColContent = new boolean[m];
        boolean[] excludedRowContent = new boolean[m];
        Map<String, Integer> solution = new HashMap<>();
        for (int i = 0; i < m; i++) {
            if (i == excludeRow) {
                continue;
            }
            for (int j = 0; j < m; j++) {
                if (j == excludeCol) {
                    continue;
                }
                if ((rowPlusCnt[i] + colPlusCnt[j] - (board[i][j] ? 1 : 0)) % 2 == 1) {
                    markCross(i, j, m, solution);
                    excludedColContent[i] = !excludedColContent[i];
                    excludedRowContent[j] = !excludedRowContent[j];
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if ((board[excludeRow][i] && !excludedRowContent[i]) || (!board[excludeRow][i] && excludedRowContent[i])) {
                cnt++;
            }
            if (i != 0 && (board[i][excludeCol] && !excludedColContent[i]) || (!board[i][excludeCol] && excludedColContent[i])) {
                cnt++;
            }
        }
        if (cnt > 2 * n) {
            markCross(excludeRow, excludeCol, m, solution);
        }
        return solution;
    }

    private static void markCross(int r, int c, int m, Map<String, Integer> out) {
        List<Integer> move = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            move.add((c - r + m + i) % m + 1);
        }
        outputArray(move, out);

        for (int j = 1; j < m; j++) {
            move = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                if (i == r) {
                    move.add((c + j) % m + 1);
                } else if (i == (r + j) % m) {
                    move.add(c % m + 1);
                } else {
                    move.add((c - r + m + i) % m + 1);
                }
            }
            outputArray(move, out);
        }
    }


    private static String outputArray(Iterable<Integer> ans, Map<String, Integer> out) {
        StringBuilder str = new StringBuilder();
        for (int an : ans) {
            str.append(an).append(' ');
        }
        String s = str.toString();
        out.put(s, out.getOrDefault(s, 0) + 1);
        return s;
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
