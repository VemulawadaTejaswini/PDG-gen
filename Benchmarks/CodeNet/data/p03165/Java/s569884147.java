import java.util.*;

public class Main {
    static String [][] dp; static String s; static String t;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next(); t = sc.next();
        int n = s.length(); int m = t.length();
        dp = new String[n+1][m+1];
        System.out.println(go(n, m));
    }

    static String go (int i, int j) {
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (i == 0 || j == 0) {
            return dp[i][j] = "";
        }
        if (s.charAt(i - 1) == t.charAt(j - 1)) {
            return dp[s.length()][t.length()] = go(i - 1, j - 1) + s.charAt(i - 1);
        } else {
            String one = go(i, j - 1);
            String two = go(i - 1, j);
            return dp[i][j] = (one.length() > two.length() ? one : two);
        }
    }


}