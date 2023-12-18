import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            Map<Integer, Integer> map2 = primeFactorization(a[i]);
            for (Integer j : map2.keySet()) {
                map.put(j, Math.max(map.getOrDefault(j, 0), map2.get(j)));
            }
        }
        
        long x = 1;
        for (Integer i : map.keySet()) {
            int j = map.get(i);
            for(int k = 0; k < j; k++){
                x *= i;
                x %= MOD;
            }
        }
        
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += x * modinv(a[i], MOD);
            ans %= MOD;
        }
        
        System.out.println(ans);
    }
    
    static long modpow(long a, long n, long mod){
        
        long res = 1;
        while(n > 0){
            if((n & 1) == 1) res = res * a % mod;
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }
    
    static long modinv(long a, long mod){
        return modpow(a, mod - 2, mod);
    }
    
    static Map<Integer, Integer> primeFactorization(int n){
        
        Map<Integer, Integer> map = new HashMap<>();
        while(n%2 == 0){
            n /= 2;
            map.put(2, map.getOrDefault(2, 0) +1);
        }
        double sqrt = Math.sqrt(n);
        for(int i = 3; i <= sqrt; i += 2){
            while(n%i == 0){
                n /= i;
                map.put(i, map.getOrDefault(i, 0) +1);
            }
        }
        if(n > 1){
            map.put(n, map.getOrDefault(n, 0) +1);
        }
        return map;
    }
}