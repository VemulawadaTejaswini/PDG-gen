import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    char x = s1.charAt(i - 1);
                    char y = s2.charAt(j - 1);

                    if (x == y) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    }
                }
            }
        }

        String result = "";

        int i = m;
        int j = n;
        while (i >= 1 && j >= 1) {
            char x = s1.charAt(i - 1);
            char y = s2.charAt(j - 1);
            if (x == y) {
                result = s1.charAt(i - 1) + result;
                i--;
                j--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}