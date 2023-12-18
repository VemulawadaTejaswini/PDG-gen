import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a);
        
        Combination comb = new Combination((int)1e5*2, MOD);
        
        long ans = 0;
        for(int i=0; i<n-k+1; i++){
            long minc = comb.c(n-i-1, k-1);
            minc = (minc*a[i])%MOD;
            ans = ((ans+MOD)-minc)%MOD;
            
            long maxc = comb.c(i+(k-1), k-1);
            maxc = (maxc*a[i+(k-1)])%MOD;
            ans = (ans+maxc)%MOD;
        }
        
        System.out.println(ans);
        
    }
}

class Combination{
    int mod;
    long[] fact;
    long[] rfact;
    
    public Combination(int max, int mod){
        this.mod = mod;
        fact = new long[max];
        rfact = new long[max];
        fact[0] = 1;
        rfact[0] = 1;
        for(int i=1; i<max; i++){
            fact[i] = (fact[i-1]*i)%mod;
            rfact[i] = mod_inverse(fact[i], mod);
        }
    }
    
    public static long mod_pow(long x, long p, long m){
        long a = 1;
        while(p>0){
            if(p%2==1){
                a = a*x%m;
            }
            x = x*x%m;
            p /= 2;
        }
        return a;
    }
    
    public static long mod_inverse(long a, long m){
        return mod_pow(a, m-2, m);
    }
    
    public long p(int n, int r){
        if(r < 0 || n < r) return 0;
        return fact[n] * rfact[r]%mod;
    }
    
    public long c(int n, int r){
        if(r < 0 || n < r) return 0;
        return fact[n] * rfact[r]%mod * rfact[n-r]%mod;
    }
    
    public long h(int n, int r){
        if(n < 0 || r < 0) return 0;
        return r==0 ? 1 : c(n+r-1, r);
    }
}
