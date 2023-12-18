import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String in1 = scan.next();
        String in2 = scan.next();
        int n = in1.length();
        int m = in2.length();
        char[] s = new char[n];
        char[] t = new char[m];
        for(int i = 0; i < n; i++) s[i] = in1.charAt(i);
        for(int i = 0; i < m; i++) t[i] = in2.charAt(i);
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(s[i] == t[j]) dp[i + 1][j + 1] = dp[i][j] + 1;
                else dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }
        int l = dp[n][m];
        char[] out = new char[l];
        l--;
        while(l >= 0){
            if(s[n - 1] == t[m - 1]){
                out[l] = s[n - 1];
                n--;
                m--;
                l--;
            }else if(dp[n][m] == dp[n - 1][m]){
                n--;
            }else{
                m--;
            }
        }
        for(int i = 0; i < out.length; i++) System.out.print(out[i]);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
