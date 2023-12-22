import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        int res = 1000;
        for(int i = 1; i <= n; i++){
            dp[i] = sc.nextInt();
        }
        int buy = dp[1];
        int sell = 0;
        for(int i = 2; i <= n; i++){
            if(dp[i] <= buy)
                buy = dp[i];
            else{
                if(dp[i] > sell){
                    sell = dp[i];
                }else {
                    int count = res / buy;
                    res %= buy;
                    int earn = count * sell;
                    res += earn;
                    buy = 201;
                    sell = 0;
                }
            }
        }
        if(sell > buy){
            int count = res / buy;
            res %= buy;
            int earn = count * sell;
            res += earn;
        }
        System.out.println(res);
    }
}