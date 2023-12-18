import java.math.*;
import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String t1 = br.readLine();
        String t2 = br.readLine();

        if(t1.length() > t2.length()){
            System.out.println(lcs(t2, t1));
        }else{
            System.out.println(lcs(t1, t2));
        }
        
    }

    public static String lcs(String s1, String s2){
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[i].length; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i -1][j], dp[i][j - 1]);
                }
            }
        }

        int m = s1.length(), n = s2.length();
        StringBuilder sb = new StringBuilder();

        while(m > 0 && n > 0){
            if(dp[m][n] == dp[m - 1][n]){
                m--;
            }else if(dp[m][n] == dp[m][n - 1]){
                n--;
            }else{
                sb.append(s1.charAt(m - 1));
                m--;
                n--;
            }
        }
        return sb.reverse().toString();
    }

}