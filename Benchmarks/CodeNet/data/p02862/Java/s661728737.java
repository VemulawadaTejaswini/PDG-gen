import java.util.*;

class Main{
    public static final int MOD = (int)1e9+7; 
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      if((x+y)%3==0 && (double)Math.max(x,y)/(double)Math.min(x,y)<=2){
        int k = (x+y)/3;
        x -= k;
        Mod_nCr mn = new Mod_nCr(MOD, (int)1e6);
        long ans = mn.nCr(k, x);
        System.out.println(ans);
      }else{
        System.out.println(0);
      }
    }
}

class Mod_nCr{
    int mod;
    long[] fact;
    long[] rfact;
     
    public Mod_nCr(int mod, int max){
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
     
    //
    public long nCr(int n, int r){
        return fact[n]*rfact[r]%mod * rfact[n-r]%mod;
    }
}