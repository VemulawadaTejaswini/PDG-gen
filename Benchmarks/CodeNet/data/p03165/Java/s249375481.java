import java.util.*;
import java.io.*;

class Main{


    /**
     * https://atcoder.jp/contests/dp/tasks/dp_f
     * Longest Common Subsequence.
    */

    private static String solver(String s, String t){

        int n = s.length();
        int m = t.length();
        String[][] dp = new String[n + 1][m + 1];
        for(String[] str: dp) Arrays.fill(str, "");

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){

                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + s.charAt(i - 1);
                }

                else{
                    int l1 = dp[i - 1][j].length();
                    int l2 = dp[i][j - 1].length();
                    String str = l1 > l2 ? dp[i - 1][j]: dp[i][j - 1];
                    dp[i][j] = str;
                }
            }
        }
        return dp[n][m];
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.next();
        String t = in.next();

        if(s=="" || t==""){
            System.out.println("");
            return;
        }

        System.out.println(solver(s, t));

    }
}