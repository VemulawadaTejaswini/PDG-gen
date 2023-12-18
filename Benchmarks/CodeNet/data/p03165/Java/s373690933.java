import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static int getInt() {
        return Integer.parseInt(line());
    }

    private static int[] getIntArr(int n) {
        int[] ans = new int[n];

        StringTokenizer stringTokenizer = new StringTokenizer(line(), " ");
        for (int i = 0; i < n && stringTokenizer.hasMoreTokens(); i++) {
            ans[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        return ans;
    }

    private static String line() {
        try {
            return READER.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String solve() {
        return solveInternal(line(), line());
    }

    private static String solveInternal(String s, String t) {
        if (s.equals(t)) {
            return s;
        }
        if (s.isEmpty() || t.isEmpty()) {
            return "";
        }

        int[][] dp = new int[s.length()][t.length()];

        char firstS = s.charAt(0);
        char firstT = t.charAt(0);

        dp[0][0] = firstS == firstT ? 1 : 0;

        for (int i = 1; i < s.length(); i++) {
            dp[i][0] = s.charAt(i) == firstT ? 1 : dp[i - 1][0];
        }
        for (int i = 1; i < t.length(); i++) {
            dp[0][i] = t.charAt(i) == firstS ? 1 : dp[0][i - 1];
        }

        for (int i = 1; i < s.length(); i++) {
            for (int j = 1; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = max(dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        char[] ans = new char[dp[s.length() - 1][t.length() - 1]];

        int i = s.length() - 1;
        int j = t.length() - 1;
        int k = ans.length;
        while (k > 0) {

            if (i > 0 && j > 0 && dp[i - 1][j - 1] == k) {
                i--;
                j--;
            } else if (i > 0 && dp[i - 1][j] == k) {
                i--;
            } else if (j > 0 && dp[i][j - 1] == k) {
                j--;
            } else {
                if (s.charAt(i) != t.charAt(j)) {
                    throw new IllegalStateException();
                }
                k--;
                ans[k] = s.charAt(i);
            }
        }
        return new String(ans);
    }

    private static int max(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }

    public static void main(String... args) {
        System.out.println(solve());
//        String s = "aaaaaaaggggaaaaaaaaui";
//        String t = "baaaaahhhhhaaaaaaaaazpok";
//        System.out.println(
//                solveInternal(s, t)
//        );
    }
}
