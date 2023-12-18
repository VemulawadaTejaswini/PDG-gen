import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        String[] t = sc.next().split("");

        String[][] dp = new String[s.length + 1][t.length + 1];
        for (String[] dpi : dp) {
            Arrays.fill(dpi, "");
        }

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (s[i].equals(t[j])) {
                    dp[i + 1][j + 1] = dp[i][j] + s[i];
                } else {
                    dp[i + 1][j + 1] = getLonger(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        System.out.println(dp[s.length][t.length]);
    }

    private static String getLonger(String s1, String s2) {
        return s1.length() > s2.length() ? s1 : s2;
    }
}
