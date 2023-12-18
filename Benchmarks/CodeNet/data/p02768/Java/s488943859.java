import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        long sum = mod_pow(2, n, MOD);
        sum = (sum + MOD - 1)%MOD;
        
        long am = 1;
        long bm = 1;
        for(int i=1; i<=a; i++){
            am *= n-i+1;
            am %= MOD;
            am *= mod_pow(i, MOD-2, MOD);
            am %= MOD;
        }
        for(int i=1; i<=b; i++){
            bm *= n-i+1;
            bm %= MOD;
            bm *= mod_pow(i, MOD-2, MOD);
            bm %= MOD;
        }
        
        sum = ((sum+MOD-am)%MOD+MOD-bm)%MOD;
        
        System.out.println(sum);
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
}
