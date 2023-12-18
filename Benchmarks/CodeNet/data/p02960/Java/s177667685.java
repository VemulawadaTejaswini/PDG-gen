import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int n = s.length();

        int mod = (int) 1e9 + 7;

        long[][] dp = new long[n + 1][13];
        dp[0][0] = 1;
        int f = 1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(n - i - 1);
            if (c == '?') {
                for (int j = 0; j < 13; j++) {
                    for (int d = 0; d < 10; d++) {
                        dp[i + 1][(j + f * d) % 13] += dp[i][j];
                        dp[i + 1][(j + f * d) % 13] %= mod;
                    }
                }
            } else {
                int d = c - '0';
                for (int j = 0; j < 13; j++) {
                    dp[i + 1][(j + f * d) % 13] += dp[i][j];
                    dp[i + 1][(j + f * d) % 13] %= mod;
                }
            }
            f *= 10;
            f %= 13;
        }
        System.out.println(dp[n][5]);
    }

}
