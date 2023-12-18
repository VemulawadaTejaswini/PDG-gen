import java.util.*;

public class Main {
    private static final long MOD = 1_000_000_007;

    private Map<String, Long> map = new HashMap<>();

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        System.out.println(f(n, m));
    }

    private long f(int n, int m) {
        String key = n + ":" + m;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        if (n == 1 || m == 1) {
            return 1;
        }

        long cnt = 0;
        for (int i = 1; i * i <= m; i++) {
            if (m % i == 0) {
                long tmp = (f(n / 2, i) * f((n + 1) / 2, m / i) % MOD);
                if (i * i != m) {
                    tmp += (f(n / 2, m / i) * f((n + 1) / 2, i) % MOD);
                }

                cnt += tmp;
                cnt %= MOD;
            }
        }

        map.put(key, cnt);

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
