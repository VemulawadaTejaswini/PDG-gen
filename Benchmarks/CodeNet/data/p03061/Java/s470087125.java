import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][3];
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            dp[i][0] = gcd(a, dp[i-1][0]);
            if(i == 1) dp[i][1] = a;
            else if (i == 2){
                if(dp[i-1][1] < a){
                    dp[i][1] = a;
                    dp[i][2] = dp[i-1][1];
                }else{
                    dp[i][1] = dp[i-1][1];
                    dp[i][2] = a;
                }
            }else{
                int[] tmp = new int[3];
                tmp[0] = dp[i-1][0];
                tmp[1] = gcd(a, dp[i-1][1]);
                tmp[2] = gcd(a, dp[i-1][2]);
                Arrays.sort(tmp);
                dp[i][1] = tmp[2];
                dp[i][2] = tmp[1];
            }
        }
        System.out.println(dp[n][1]);
        sc.close();

    }

    public static int gcd(int a, int b) {
        if (a < b)
            return gcd(b, a);
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
