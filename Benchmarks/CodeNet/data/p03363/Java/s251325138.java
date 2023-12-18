import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static long A;
    static long B;
    static long C;
    static int[] map;
    static long[] cost;
    static final long MOD = 1000000007;
    static HashMap<Long, Integer> hash = new HashMap<>();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        map = new int[N + 1];
        cost = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            cost[i] = cost[i - 1] + scanner.nextInt();
        }

        for (int i = 0; i < N + 1; i++) {
            if (hash.containsKey(cost[i])) {
                hash.put(cost[i], hash.get(cost[i]) + 1);
            } else {
                hash.put(cost[i], 1);
            }

        }

        long ans = 0;

        Set<Long> keys = hash.keySet();
        for (int i = 0; i < keys.size(); i++) {
            Long key = keys.toArray(new Long[0])[i];

            if(hash.get(key) < 2)continue;
            ans += nCr(hash.get(key), 2, MOD);

        }

        System.out.println(ans);



//        System.out.println(ans);


    }


    static long nCr(long n, long r, long mod){
            long bunsi = 1;
            long bunbo = 1;
            bunsi = nbicri(n, mod);

            bunbo = nbicri(n - r, mod) * nbicri(r, mod) % mod;
            bunbo = gyaku(bunbo, mod);

            return bunsi * bunbo % mod;
        }
        static long nbicri(long n, long mod){
            long ans = 1;
            for (long i = 2; i <= n; i++) {
                ans = ans * i % mod;
            }
            return ans;
        }

        static long gyaku(long a, long mod){
            return powmod(a, mod - 2, mod);
        }

        static long powmod( long a, long n, long mod){ // (a^n) % mod

            if(n <= 0)return 1;
            if(n % 2 == 0){
                long temp = powmod(a, n / 2, mod);
                return temp * temp % mod;
            }else{
                long temp = powmod(a, n / 2, mod);
                return (temp * temp % mod) * a % mod;
            }
        }
}

