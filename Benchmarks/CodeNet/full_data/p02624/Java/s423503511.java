import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        boolean[] prime = new boolean[N+1];
        Arrays.fill(prime, true);
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i * i <= N; i++) {
            if (!prime[i]) {
                continue;
            }
            for (int j = 2; i * j <= N; j++) {
                prime[i*j] = false;
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (prime[i]) {
                primes.add(i);
            }
        }
        int[] dp = new int[N+1];
        Arrays.fill(dp, -1);
        dp[1] = 1;
        int len = primes.size();
        for (int i = 2; i <= N; i++) {
            if (prime[i]) {
                dp[i] = 2;
                continue;
            }
            for (int j = 0; j < len; j++) {
                if (i % primes.get(j) != 0) {
                    continue;
                }
                int x = primes.get(j);
                int current = i;
                int count = 0;
                int t = 1;
                while (current % x == 0) {
                    count += 1;
                    current /= x;
                    t *= x;
                }
                if (count == 1) {
                    dp[i] = dp[x] * dp[i/x];
                } else {
                    dp[i] = (dp[t/x] + 1)*dp[i/t];
                }
                break;
            }
        }

        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += (long) i * (long) dp[i];
        }
        System.out.println(ans);
    }
}
