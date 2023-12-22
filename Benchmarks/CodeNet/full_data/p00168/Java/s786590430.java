import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static long[][] dp = new long[31][31];
    public static void main(String[] args) {
        makeDpTable();
        while(read()){
            solve();
        }
    }

    static void makeDpTable(){
        dp[0][0] = 1;
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                for(int k = 1; k <=3; k++){
                    if(j-k <0)continue;
                    dp[i][j] += dp[i-1][j-k];
                }
            }
        }
    }
    static boolean read(){
        n = sc.nextInt();
        if( n == 0 ) return false;
        return true;
    }

    static void solve(){
        int res = 0;
        for(int i = 1; i <= n; i++){
            res += dp[i][n];
        }

        System.out.println((res/10-1)/365+1);
    }
}