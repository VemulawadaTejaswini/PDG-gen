import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();
        String t = in.next();

        int n = s.length();
        int m = t.length();

        String[][] dp = new String[n + 1][m + 1];


        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= m; j++) {


                if (i == 0 || j == 0) dp[i][j] = "";

                else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    //System.out.println(s.charAt(i-1)+" "+t.charAt(j-1)+" "+i+" "+j);
                    String x = dp[i - 1][j] + s.charAt(i - 1);
                    dp[i][j] = x;
                } else {

                    int max = dp[i - 1][j].length();
                    dp[i][j] = dp[i - 1][j];

                    if (dp[i - 1][j - 1].length() > max) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }

                    if (dp[i][j - 1].length() > max) {
                        dp[i][j] = dp[i][j - 1];
                    }

                }


            }


        }

//
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= m; j++) {
//                System.out.print(dp[i][j] + " ");
//            }
//
//            System.out.println();
//
//        }

        System.out.println(dp[n][m]);


    }
}