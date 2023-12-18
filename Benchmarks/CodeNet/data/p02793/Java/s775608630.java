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
        List<Map<Long, Long>> list = new ArrayList<>();
        for(long i = 2; i <= arMax; ++i) lcmPrimes.put(i, 0L);
        for(int i = 0; i < n; ++i) {
            Map<Long, Long> p = primeFactorize(ar[i]);
            list.add(p);
            for(Map.Entry<Long, Long> e : p.entrySet()) {
                long key = e.getKey();
                long ev = e.getValue();
                long lv = lcmPrimes.get(key);
                lcmPrimes.put(key, Math.max(ev, lv));
            }
        }
        
        long ans = 0L;
        for(Map<Long, Long> map : list) {
            long tmp = 1L;
            for(Map.Entry<Long, Long> e : lcmPrimes.entrySet()) {
                long key = e.getKey();
                long ex = e.getValue();
                if(map.containsKey(key)) tmp = tmp * pow(key, ex - map.get(key)) % MOD;
                else tmp = tmp * pow(key, ex) % MOD;
            }
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
}
