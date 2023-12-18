import java.util.*;

public class Main{
    
    static final int MOD = 1_000_000_007;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        long[] x = new long[n];
        long[] y = new long[m];
        
        for(int i=0; i<n; i++) x[i] = sc.nextLong();
        for(int i=0; i<m; i++) y[i] = sc.nextLong();
        
        System.out.println(calc(x) * calc(y) % MOD);
    }
    
    public static long calc(long[] z){
        long res = 0;
        for(int i=0; i<z.length; i++){
            res += (z.length-2*i-1)*z[i] % MOD;
        }
        return res;
    }
}
