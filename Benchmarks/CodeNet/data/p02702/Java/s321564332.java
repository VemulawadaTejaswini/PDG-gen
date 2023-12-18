

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        long count = 0;
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            prev = 0;
            for (int j = i; j < s.length(); j++) {
                int num = prev * 10 + (s.charAt(j) - '0');
                prev = num % 2019;
                if (prev == 0) {
                    count++;
                }
            }
        }
//        int[][] dp = new int[s.length() + 1][s.length() + 1];
//        for (int i = 1; i < s.length() + 1; i++) {
//            for (int j = i; j < s.length() + 1; j++) {
//                dp[i][j] = (dp[i][j - 1] * 10 + (s.charAt(j - 1) - '0')) % 2019;
//                if (dp[i][j] == 0) {
//                    count++;
//                }
//            }
//        }
        System.out.println(count);
    }
}
