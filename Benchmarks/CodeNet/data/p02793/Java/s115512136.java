import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        HashMap<Integer, Integer> lcm = new HashMap<>();
        for(int i=0; i<n; i++){
            HashMap<Integer, Integer> p = prime_factor(a[i]);
            for(int key : p.keySet()){
                int x = lcm.getOrDefault(key, 0);
                int y = p.get(key);
                lcm.put(key, Math.max(x, y));
            }
        }
        
        
        long ans = 0;
        for(int i=0; i<n; i++){
            HashMap<Integer, Integer> p = prime_factor(a[i]);
            long b = 1;
            for(int key : lcm.keySet()){
                int x = lcm.get(key);
                int y = p.getOrDefault(key, 0);
                b *= mod_pow(key, x-y, MOD);
                b %= MOD;
            }
            ans += b;
            ans %= MOD;
        }
        
        System.out.println(ans);
        
    }
    
    public static HashMap<Integer, Integer> prime_factor(int n){
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i=2; i*i<=n; i++){
            while(n%i==0){
                res.put(i, res.getOrDefault(i, 0)+1);
                n /= i;
            }
        }
        if(n!=1){
            res.put(n, res.getOrDefault(n, 0)+1);
        }
        return res;
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
