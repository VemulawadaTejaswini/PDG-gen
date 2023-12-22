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
        int curr = dp[1];
        for(int i = 2; i <= n; i++){
            if(dp[i] <= curr)
                curr = dp[i];
            else{
                int count = res / curr;
                res %= curr;
                int earn = count * dp[i];
                res += earn;
                curr = 201;
            }
        }
        System.out.println(res);
    }
}