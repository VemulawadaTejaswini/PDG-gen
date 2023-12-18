import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        ArrayList<Count> li = new ArrayList<Count>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] al = new int[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextInt();
        }
        combination comb = new combination(n);
        Arrays.sort(al);
        long ans = 0;
        for(int i = k-1; i < n; i++){
            ans += al[i] * comb.comb(i,k-1) % mod;
            ans %= mod;
        }
        for(int i = n-k; i >= 0; i--){
            ans -= al[i] * comb.comb(n-i-1,k-1) % mod;
            ans += mod;
            ans %= mod;
        }
        System.out.println(ans);
    }
    
    public static long nCk(long n,long k,long M) {
        long ret = 1;
        long min = Math.min(k, n-k);
        for(long i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(long i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return ret;
    }

    public static long pow(long a,long b,long M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1){
                ret = (ret * tmp) % M;
            }
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
    
}

class combination {
    final static long mod = (long)Math.pow(10,9)+ 7;
    private static long[] fact, ifact;
    public combination(int n){
        fact = new long[n+1];
        ifact = new long[n+1];
        fact[0] = 1;
        for (int i = 1; i <= n; ++i){
            fact[i] = fact[i-1]*i;
        }
        ifact[n] = pow(fact[n],this.mod-2);
        for (int i = n; i >= 1; --i){
            ifact[i-1] = ifact[i]*i;
        }
    }
    public static long comb(int n, int k){
        if (k < 0 || k > n) return 0;
        return fact[n] % mod * ifact[k] % mod * ifact[n-k] % mod;
    }
    public static long pow(long a,long b) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1){
                ret = (ret * tmp) % mod;
            }
            tmp = (tmp * tmp) % mod;
            b = b>>1;
        }
        return ret;
    }
}

class Count{
    int p,cnt;
    public Count(int p, int c){
        this.p = p;
        this.cnt = c;
    }
}

