import java.util.*;

public class Main {
  
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String r = lcs(s, t);

        System.out.println(r);
    }

    private static String lcs(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = t.length() - 1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                sb.append(s.charAt(i));
                i++;
                j++;
            } else if(dp[i+1][j] > dp[i][j+1]) {
                i++;
            } else {
                j++;
            }
        }
        return sb.toString();
    }

}