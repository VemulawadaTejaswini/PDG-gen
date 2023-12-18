import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);

    static long x = sc.nextLong();
    static long y = sc.nextLong();
    static int t = (int)(x+y)/3;

    static long MOD = (int)1e9+7;

    static long[] facts = new long[t+1];

    public static void main(String[] args){
        facts[0] = 1;
        for (int i=1; i<t+1; i++){
            facts[i] = facts[i-1]*i %MOD;
        }


        if ((x+y)%3!=0){
            System.out.println(0);
            return;
        }

        long ans = 0;


        for (int i=0; i<t+1; i++){
            int a = i;
            int b = t-a;
            if (((a+b*2)!=x) || ((a*2+b)!=y)){
                continue;
            }
//            System.out.println(t);
//            System.out.println(a);

            ans += nck(t, a);
            ans %= MOD;
        }
        System.out.println(ans%MOD);


    }
    public static long modpow(long a, long b){
        if (b==0) return 1;
        else if (b==1) return a;
        long x = modpow(a, b/2);
        return b%2==0 ? x*x%MOD : x*(x*a%MOD)%MOD;
    }
    public static long inv(long n){
        return modpow(n, MOD-2);
    }
    public static long nck(int n, int k){
        return n<k ? 0: facts[n]*(inv(facts[n-k])*inv(facts[k])%MOD)%MOD;
    }
}