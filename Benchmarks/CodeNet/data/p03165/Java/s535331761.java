import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        String s = next();
        String t = next();

        dp = new long[3010][3010];

        for (long[] longs : dp) {
            Arrays.fill(longs, 0);
        }

        // 文字数
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    if (dp[i + 1][j + 1] < dp[i][j] + 1) {
                        dp[i + 1][j + 1] = dp[i][j] + 1;
                    }
                }

                if (dp[i + 1][j + 1] < dp[i + 1][j]) {
                    dp[i + 1][j + 1] = dp[i + 1][j];
                }

                if (dp[i + 1][j + 1] < dp[i][j + 1]) {
                    dp[i + 1][j + 1] = dp[i][j + 1];
                }
            }
        }

        // 復元
        String result = "";
        int i = s.length();
        int j = t.length();
        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[i - 1][j]) { // (i-1, j) -> (i, j) と更新されていた場合
                i--;
            } else if (dp[i][j] == dp[i][j - 1]) { // (i, j-1) -> (i, j) と更新されていた場合
                j--;
            } else { // (i-1, j-1) -> (i, j) と更新されていた場合
                result = s.charAt(i - 1) + result;
                i--;
                j--;
            }
        }
        System.out.println(result);
    }

    static char nextChar() throws IOException {
        return next().charAt(0);
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static int[] readArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    static long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int Char2Int(Character c) {
        return Character.getNumericValue(c);
    }

    static double Char2Double(Character c) {
        return (double) Char2Int(c);
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            a = a % b; // 残り部分
            return gcd(b, a); // 残り部分から最小の正方形を見つける
        }
    }
}