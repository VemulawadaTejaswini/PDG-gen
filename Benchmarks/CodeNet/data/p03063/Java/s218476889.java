
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int[][] dp = new int[S.length()][2];
        
        if (S.charAt(0)=='.') {
            dp[0][0] = 0;
            dp[0][1] = 1;
        } else if (S.charAt(0)=='#') {
            dp[0][0] = 1;
            dp[0][1] = 0;
        }
        for (int i=1;i<S.length();++i){
            if (S.charAt(0)=='.') {
                dp[i][0] = dp[i-1][0];
                dp[i][1] = Math.min(dp[i-1][0],dp[i-1][1])+1;
            } else if (S.charAt(0)=='#') {
                dp[i][0] = dp[i-1][0]+1;
                dp[i][1] = Math.min(dp[i-1][0],dp[i-1][1]);
            }
        }
        int ans = Math.min(dp[dp.length-1][0],dp[dp.length-1][1]);
        System.out.println(ans);
    }
    
}
