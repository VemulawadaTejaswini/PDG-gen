
import java.util.*;

public class Main  {

    static int[][] dp;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String f = in.next();
        String s = in.next();

//        System.out.println(lcs(f, s));
        lcs(f, s);
        char[] LCS = LCS(f, s);
        String ans = "";
        for (int i = 0; i < LCS.length; i++) {
            
            ans = ans += LCS[i];
            
        }
        
        System.out.println(ans);
        
    }

    static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    static char[] LCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int index = dp[m][n];
        char word[] = new char[index];
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                word[index - 1] = s1.charAt(i - 1);
                i--;
                j--;
                index--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return word;
    }

}
