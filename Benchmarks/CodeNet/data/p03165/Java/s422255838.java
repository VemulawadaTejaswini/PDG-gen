import java.util.*;

public class Main {

    long INF = 1000000001;
    String[][] dp;
    boolean A, B, C;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        dp = new String[S.length() + 1][T.length() + 1];
        for (int i = 0; i <= S.length(); i++) {
            for (int j = 0; j <= T.length(); j++) {
                dp[i][j] = "";
            }
        }
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < T.length(); j++) {
                if (s[i] == t[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + String.valueOf(s[i]);
                } else {
                    if (dp[i + 1][j].length() > dp[i][j + 1].length()) {
                        dp[i + 1][j + 1] = dp[i + 1][j];
                    } else {
                        dp[i + 1][j + 1] = dp[i][j + 1];
                    }
                }
            }
        }
        System.out.println(dp[S.length()][T.length()]);
    }
}