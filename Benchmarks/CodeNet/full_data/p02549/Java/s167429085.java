import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 998244353;

        int[] l = new int[k];
        int[] r = new int[k];
        long[] sum = new long[k];

        for(int i = 0; i < k; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        long[] dp = new long[n * 2];
        dp[1] = 1;

        for(int i = 1; i <= n; i++){
            //System.out.println("i = " + i);
            for(int j = 0; j < k; j++){
                int ra = Math.min(n, i - l[j]);
                ra = Math.max(0, ra);
                int la = Math.max(0, i - r[j]);
                la = Math.min(n, la);
                sum[j] += dp[ra];
                dp[i] += sum[j];
                sum[j] -= dp[la];
                //System.out.println("la = " + la);
                //System.out.println("ra = " + ra);
            }
            dp[i] %= mod;
            //System.out.println(Arrays.toString(dp));
        }
        System.out.println(dp[n]);

    }
}
/*

5 2
3 3
5 5

 */