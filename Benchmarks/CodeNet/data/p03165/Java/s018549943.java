import java.util.*;
import java.lang.*;
import java.io.*;
 
public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        int n = s.length(), m = t.length();
        int[][] dp = int[n+1][m+1];

        for(int i =1; i<=n; i++){
            for(int j = 1; j<=m; j++ ){
                if(s.charAt(i)==t.charAt(j)){
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(dp[n][m]>0){
            if(s.charAt(n-1)==t.charAt(n-1)){
                res.append(s.charAt(n-1));
                m--; n--;
            } else {
                if(dp[n][m]==dp[n-1][m]) m--;
                else n--;
            }
        } 

        System.out.println(res.reverse.toString());
    }
}