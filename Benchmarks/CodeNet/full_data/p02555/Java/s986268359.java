import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        final long mod = 1000000007;
        //s個の〇に仕切りを入れて数列を作る
        long dp[] = new long [s + 1];
        dp[0] = 1;
        
        for(int i = 1; i < s + 1; i++){
            for(int j = 0; j < i - 3 + 1; j++){
                dp[i] += dp[j];
                dp[i] %= mod;
            }
        }
        //正解を出力
        System.out.println(dp[s]);
    }
}
