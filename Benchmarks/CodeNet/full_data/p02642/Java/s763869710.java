import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] a = new int[N];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }

        // 3 8 11 16 24

        Arrays.sort(a);

        for (int i = 1; i < N; i++) {
            if (a[i-1]  == a[i]) {
                a[i-1] = -1;
                a[i] = -1;
            }
        }


        int[] newA = IntStream.of(a).filter(e -> e != -1).toArray();

        final Map<Long, Integer> map = new HashMap<>();
        L: for (int i = 0; i < newA.length; i++) {
            for (final Map<Long, Integer> pf: primeFactorize(newA[i])) {
                for (final Long key : pf.keySet()) {
                    if (map.containsKey(key)) {
                        continue L;
                    }
                }
                map.putAll(pf);
            }
        }
        System.out.println(map.size());
    }

    private static List<Map<Long, Integer>> primeFactorize(long n) {
        final List<Map<Long, Integer>> res = new ArrayList<>();

        for (long i = 2; i * i <= n; i++) {
            if (n % i != 0) {
                continue;
            }
            // n が i で割り切れると分かったときには、割れる限り割り続ける

            // 指数
            int ex = 0;
            // 割れる限り割り続ける
            while (n % i == 0) {
                ex++;
                n /= i;
            }

            res.add(Collections.singletonMap(i, ex));
        }

        // 最後に残った数について
        if (n != 1) {
            res.add(Collections.singletonMap(n, 1));
        }

        return res;
    }
}
