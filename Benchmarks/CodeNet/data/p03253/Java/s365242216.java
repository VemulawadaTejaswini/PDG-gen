import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.close();
        int mod = 1000000007;
        Map<Integer,Integer> map = prime_factor(m);
        MOD.COMinit(200000);

        long res=1;
        
        for(Integer count: map.values()){
            res*=MOD.nCkMod2(n-1+count, count);
            res%=mod;
        }
        System.out.println(res);

    }

    public static Map<Integer,Integer> prime_factor(int l){

        Map<Integer,Integer> map = new HashMap<>();

        int count;
        for(int i=2;i*i<=l;i++){
            if(l%i==0){
                count = 0;
                while(l%i==0){
                    count++;
                    l/=i;
                }
                map.put(i,count);
            }
        }
        if(l!=1)map.put(l,1);
        return map;
    }
}class MOD {
    static long[] fac,inv,finv;
    static int mod = 1000000007;

    public static long getPowMod(long a, long x,long mod){
        long res = 1;
        while(x > 0){
            if((x&1)==1){
                res = (res*a)%mod;
            }
            x>>=1;
            a = (a*a)%mod;
        }
        return res;
    }
    public static long getFactorialMod(long n,long mod){
        if(n==0){
            return 1;
        }else{
            return (n*getFactorialMod(n-1, mod))%mod;
        }
    }

    public static long nCkMod(long n,long k,long mod){
        if(n < k){
            return 0;
        }else{
            long nMod = getFactorialMod(n, mod);
            long kinvMod = getPowMod(getFactorialMod(k, mod), mod-2, mod);
            long n_kinvMod = getPowMod(getFactorialMod(n-k, mod), mod-2, mod);
            long x = (nMod*kinvMod)%mod;
            return (x*n_kinvMod)%mod;
        }
    }

    public static void COMinit(int max){
        fac = new long[max];
        inv = new long[max];
        finv = new long[max];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i=2;i<max;i++){
            fac[i] = fac[i-1]*i%mod;
            inv[i] = mod-inv[mod%i]*(mod/i)%mod;
            finv[i] = finv[i-1]*inv[i]%mod;
        }
    }
    public static long nCkMod2(int n,int k){
        if(n < k)return 0;
        return fac[n]*(finv[k]*finv[n-k]%mod)%mod;
    }
}
