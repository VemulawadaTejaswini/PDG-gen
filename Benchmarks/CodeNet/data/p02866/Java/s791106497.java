import java.util.*;

public class Main{
    static final int MOD = 998244353;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] d = new long[n];
        int s = sc.nextInt();
        d[s]++;
        for (int i=1; i<n; i++){
            int t = sc.nextInt();
            d[t]++;
        }
        if (s!=0 || d[0]!=1){
            System.out.println(0);
            return;
        }

        long ans = 1;

        for (int i=0; i<n-1; i++){
            ans *= power(d[i], d[i+1]);
            ans %= MOD;
        }
        System.out.println(ans);

    }

    public static long power(long x, long n){
        long sum = 1;
        while (n>0){
            if ((n&1)==1){
                sum *= x;
                sum %= MOD;
            }
            x *= x;
            x %= MOD;
//            if (sum < 0) sum += MOD;
//            if (x < 0) x += MOD;
            n>>=1;
        }
//        return sum;
        return sum%MOD;
    }
}