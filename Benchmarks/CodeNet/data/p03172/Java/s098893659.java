import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    final static long MOD = (int) (10E8 +7);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long[][] dp = new long[n+1][k+1]; // children and  candies
        for(int child =0;child<=n;child++){
            for (int candy = 0; candy <= k; candy++) {
                if(candy==0 || child==0){
                    dp[child][candy]=1;
                }
                else {
                    int R = candy;
                    int L = candy - Math.min(candy, arr[child - 1]) - 1;
                    if (L == -1)
                        dp[child][candy] = (dp[child][candy]% MOD +dp[child - 1][R]% MOD) % MOD;
                    else
                        dp[child][candy] = (dp[child][candy]% MOD +dp[child - 1][R]% MOD - dp[child - 1][L]) % MOD;
                    dp[child][candy] = (dp[child][candy]% MOD+dp[child][candy - 1]% MOD) % MOD;
                }
            }
        }
        System.out.println((dp[n][k]-dp[n][k-1])%MOD);
    }
}
