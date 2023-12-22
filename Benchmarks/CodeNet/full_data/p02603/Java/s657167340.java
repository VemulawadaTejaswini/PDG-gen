import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        long res = 1000;
        for(int i = 1; i <= n; i++){
            dp[i] = sc.nextInt();
        }
        int buy = 201;
        int sell = 0;
        for(int i = 1; i <= n; i++){
            if(dp[i] <= buy)
                buy = dp[i];
            else{
                if(dp[i] > sell){
                    sell = dp[i];
                }else {
                    res += res / buy * (sell - buy);
                    buy = dp[i];
                    sell = 0;
                }
            }
        }
        if(sell > buy){
            res += res / buy * (sell - buy);
        }
        System.out.println(res);
    }
}