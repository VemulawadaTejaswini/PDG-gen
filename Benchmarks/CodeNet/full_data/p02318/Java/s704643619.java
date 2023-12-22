import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int NA = A.length();
        int NB = B.length();

        int[][] dp = new int[NA+1][NB+1];

        for (int i = 0; i < NA + 1; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j < NB + 1; j++) {
            dp[0][j] = j;
        }

        for (int i = 0; i < NA; i++) {
            for (int j = 0; j < NB; j++) {
                int a = dp[i+1][j] + 1;
                int b = dp[i][j+1] + 1;
                int c = dp[i][j] + (A.charAt(i) == B.charAt(j) ? 0 : 1);
                dp[i+1][j+1] = Math.min(Math.min(a, b), c);
            }
        }

        System.out.println(dp[NA][NB]);
    }
}
