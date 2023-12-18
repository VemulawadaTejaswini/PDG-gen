import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        long mod = 1000000007;
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            max = Math.max(max, A[i]);
        }
        List<Long> primes = primes(1000000);

        Map<Long, Long>[] list = new Map[N];
        for (int i = 0; i < N; i++) {
            list[i] = prime_factor(primes, A[i]);
        }
        Map<Long, Long> lcm = new HashMap<>();
        for (long x : primes) {
            long max_count = 0;
            for (int i = 0; i < N; i++) {
                max_count = Math.max(max_count, list[i].getOrDefault(x, 0L));
            }
            lcm.put(x, max_count);
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            long b = 1;
            Map<Long, Long> factorize = list[i];
            for (long prime : lcm.keySet()) {
                b *= pow(prime, lcm.get(prime) - factorize.getOrDefault(prime, 0L), mod);
            }
            ans += b;
            ans %= mod;
        }
        System.out.println(ans);
    }
    private long pow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 1) {
            long x = base * pow(base, exp-1, mod);
            x %= mod;
            return x;
        }
        long x = pow(base, exp/2, mod);
        x = x * x;
        x %= mod;
        return x;
    }
    private Map<Long, Long> prime_factor(List<Long> primes, long N) {
        long current = N;
        Map<Long, Long> map = new HashMap<>();
        for (long x : primes) {
            if (current == 0) {
                break;
            }
            long count = 0;
            while(current % x == 0) {
                current /= x;
                count += 1;
            }
            map.put(x, count);
        }
        return map;
    }
    private List<Long> primes(int N) {
        boolean[] primes = new boolean[N+1];
        Arrays.fill(primes, true);
        for (int i = 2; i * i < N; i++) {
            if (!primes[i]) {
                continue;
            }
            primes[i] = true;
            for (int j = 2; i * j <= N; j++) {
                primes[i * j] = false;
            }
        }
        List<Long> list = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (primes[i]) {
                list.add(Long.valueOf(i));
            }
        }
        return list;
    }
}
