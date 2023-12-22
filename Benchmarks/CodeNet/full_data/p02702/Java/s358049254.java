

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String s = sc.next();
        int count = 0;
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = i; j < s.length() + 1; j++) {
                dp[i][j] = (dp[i][j - 1] * 10 + (s.charAt(j - 1) - '0')) % 2019;
                if (dp[i][j] == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
