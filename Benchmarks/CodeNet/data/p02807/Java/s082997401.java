import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e5+5;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = Long.parseLong(sc.next());
        }
        
        
        
        long nk = 1;
        for(int i=1; i<n; i++){
            nk *= i;
            nk %= MOD;
        }
        
        Gyak gd = new Gyak(MOD, MAX);
        long ans = 0;
        for(int i=0; i<n-1; i++){
            int r = n-i-1;
            long sum = 0;
            for(int j=i+1; j<n; j++){
                long tmp = gd.div(a[j]-a[i], r) * nk % MOD;
                ans += tmp;
                ans %= MOD;
            }
            
            //long tmp = gd.div(sum, r) * nk % MOD;
            //System.out.println(tmp);
            //ans += tmp;
            //ans %= MOD;
        }
        
        System.out.println(ans%MOD);
    }
}

class Gyak{
    int mod;
    long[] rfact;
    
    public Gyak(int mod, int max){
        this.mod = mod;
        rfact = new long[max];
        rfact[0] = 1;
        for(int i=1; i<max; i++){
            rfact[i] = mod_inverse(i, mod);
        }
    }
    
    //
    private long mod_pow(long x, long p, long m){
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
    
    private long mod_inverse(long a, long m){
        return mod_pow(a, m-2, m);
    }
    
    public long div(long x, int r){
        return x * rfact[r] % mod;
    }
}
