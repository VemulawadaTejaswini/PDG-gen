
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int n = a.length();
        int m = b.length();
        String dp[][] = new String[n+1][m+1];
        Arrays.fill(dp[0],"");
        for(int i=1;i<=n;i++){
            Arrays.fill(dp[i],"");
            for(int j=1;j<=m;j++){
                if(a.charAt(i-1) == b.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + a.charAt(i-1);
                else
                    dp[i][j] = dp[i-1][j].length() >= dp[i][j-1].length() ? dp[i-1][j] : dp[i][j-1];
            }
        }
        System.out.println(dp[n][m]);
    }

}