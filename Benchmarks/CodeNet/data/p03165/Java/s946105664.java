import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int n = s.length();
        int m = t.length();
        String dp[][] = new String[n+1][m+1];
        in.close();
        for(int i=0;i<=n;i++){
            dp[i][0] = "";
        }
        for(int j=0;j<=m;j++){
            dp[0][j] = "";
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (s.charAt(i) == t.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+s.charAt(i);
                }
                else{
                    if (dp[i][j+1].length() >= dp[i+1][j].length()){
                        dp[i+1][j+1] = dp[i][j+1];
                    }
                    else{
                        dp[i+1][j+1] = dp[i+1][j];
                    }
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}