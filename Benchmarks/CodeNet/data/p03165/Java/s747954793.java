import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        String res = lcs(s, t);
        System.out.println(res);
    }

    private static final int UPPER_LEFT = 1;
    private static final int UPPER = 2;
    private static final int LEFT = 3;

    private static String lcs(String s, String t) {
        // subproblem:
        // f(k, l) = LCS of s[0..k) and t[0..l)
        // f(s.length, t.length)

        // f(0, *) = ""
        // f(*, 0) = ""
        // f(k, l) = max:
        //         f(k-1, l)
        //         f(k, l-1)
        //         f(k-1, l-1) + s[k-1], if s[k-1] == t[l-1]

        int N1 = s.length();
        int N2 = t.length();
        int[][] dp = new int[N1+1][N2+1];
        int[][] last = new int[N1+1][N2+1];
        for (int i = 0; i <= N1; i++) {
            for (int j = 0; j <= N2; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    last[i][j] = 0;
                } else {
                    if (s.charAt(i-1) == t.charAt(j-1)) {
                        dp[i][j] = dp[i-1][j-1] + 1;
                        last[i][j] = UPPER_LEFT;
                    } else if (dp[i-1][j] > dp[i][j-1]) {
                        dp[i][j] = dp[i-1][j];
                        last[i][j] = UPPER;
                    } else {
                        dp[i][j] = dp[i][j-1];
                        last[i][j] = LEFT;
                    }
                }
            }
        }

        int i = N1;
        int j = N2;
        StringBuilder sb = new StringBuilder();
        while (i > 0 && j > 0) {
            if (last[i][j] == UPPER_LEFT) {
                sb.append(s.charAt(i-1));
                i--;
                j--;
            } else if (last[i][j] == UPPER) {
                i--;
            } else if (last[i][j] == LEFT) {
                j--;
            } else {
                break;
            }
        }
        return sb.reverse().toString();
    }
}
