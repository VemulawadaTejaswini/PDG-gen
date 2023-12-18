import java.util.*;
import java.math.BigDecimal;

class Main{
    static long mod = 1000000000+7;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long[] dp = new long[b+1];
        dp[0]=0;
        dp[1]=n;
        for(int i=2;i<=b;i++){
            dp[i] = (dp[i-1]*(n-i+1)/i)%mod;
        }
        long res = pow(2, n)-1;
        System.out.println(res);
        res = (res-dp[a]+mod)%mod;
        res = (res-dp[b]+mod)%mod;
        System.out.println(res);
    }

    public static long pow(long a, long n) {
        if(n==0){
            return 1;
        }
        if(n%2==1){
            return a*pow(a, n-1)%mod;
        }
        long half = pow(a, n/2)%mod;
        return half*half%mod;
    }
}
