import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        ModLcm ml = new ModLcm((int)1e6+6);
        
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            ml.lcm(a[i]);
        }
        
        int lcm = ml.getModLcm(MOD);
        //System.out.println(lcm);
        
        long ans = 0;
        for(int i=0; i<n; i++){
            long inv = ModLcm.mod_pow(a[i], MOD-2, MOD);
            ans += lcm * inv;
            ans %= MOD;
        }
        
        System.out.println(ans);
        
    }
    
}

class ModLcm{
    private int max;
    private int[] exponent;
    
    public ModLcm(int max){
        this.max = max;
        exponent = new int[max];
    }
    
    public void lcm(int n){
        while(n%2==0){
            int ex = 0;
            while(n%2==0){
                ex++;
                n /= 2;
            }
            exponent[2] = Math.max(exponent[2], ex);
        }
        for(int i=3; i*i<=n; i+=2){
            int ex = 0;
            while(n%i==0){
                ex++;
                n /= i;
            }
            exponent[i] = Math.max(exponent[i], ex);
        }
        if(n!=1){
            exponent[n] = Math.max(1, exponent[n]);
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
    
    public int getModLcm(int mod){
        long res = 1;
        for(int i=0; i<max; i++){
            if(exponent[i]==0){
                continue;
            }
            res *= mod_pow(i, exponent[i], mod);
            res %= mod;
        }
        return (int)res;
    }
}