import java.util.*;

public class Main {
    static String [][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); String t = sc.next();
        dp = new String[s.length()+1][t.length()+1];
        System.out.println(go(s, t));
    }

    static String go (String s, String t) {
        if (dp[s.length()][t.length()] != null) {
            return dp[s.length()][t.length()];
        }
        if (t.length() == 0 || s.length() == 0) {
            return dp[s.length()][t.length()] = "";
        }
        int n = s.length(); int m = t.length();
        if (s.charAt(n - 1) == t.charAt(m - 1)) {
            return dp[s.length()][t.length()] = go(s.substring(0, n - 1), t.substring(0, m - 1)) + s.substring(n - 1);
        } else {
            String one = go(s, t.substring(0, m - 1));
            String two = go(s.substring(0, n - 1), t);
            return dp[s.length()][t.length()] = (one.length() > two.length() ? one : two);
        }
    }


}