import java.util.*;

public class Main {
    static final long MOD = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ar = new long[n];
        long arMax = 0;
        for(int i = 0; i < n; ++i) {
            ar[i] = sc.nextLong();
            arMax = Math.max(arMax, ar[i]);
        }
        
        Map<Long, Long> lcmPrimes = new HashMap<>();
        for(long i = 2; i <= arMax; ++i) lcmPrimes.put(i, 0L);
        for(int i = 0; i < n; ++i) {
            Map<Long, Long> p = primeFactorize(ar[i]);
            for(Map.Entry<Long, Long> e : p.entrySet()) {
                long key = e.getKey();
                long ev = e.getValue();
                long lv = lcmPrimes.get(key);
                lcmPrimes.put(key, Math.max(ev, lv));
            }
        }
        
        long lcm = 1L;
        for(Map.Entry<Long, Long> e : lcmPrimes.entrySet()) {
            long x = e.getKey();
            long y = e.getValue();
            lcm = lcm * pow(x, y) % MOD;
        }
        
        long ans = 0L;
        for(long v : ar) {
            long tmp = lcm * inv(v) % MOD;
            ans = (ans + tmp) % MOD;
        }
        System.out.println(ans);
    }
    
    static Map<Long, Long> primeFactorize(long n) {
        Map<Long, Long> primes = new HashMap<>();
        for(long d = 2L, ub = n; d * d <= ub; ++d) {
            long cnt = 0L;
            while(n % d == 0L) {
                ++cnt;
                n /= d;
            }
            primes.put(d, cnt);
        }
        
        if(n > 1L) primes.put(n, 1L);
        return primes;
    }
    
    static long pow(long x, long y) {
        if(y == 0L) return 1L;
        if(y == 1L) return x;
        
        long tmp = pow(x, y / 2);
        if(y % 2L == 0L) return tmp * tmp % MOD;
        else return x * tmp % MOD * tmp % MOD;
    }
    
    static long inv(long x) {
        return pow(x, MOD - 2);
    }
}
