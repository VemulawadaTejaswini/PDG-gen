import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long n = sc.nextLong();

        System.out.println(euler(n, primeFactorize(n)));
    }

    private static List<Map<Long, Integer>> primeFactorize(long n) {
        List<Map<Long, Integer>> res = new ArrayList<>();
        for (long a = 2; a*a <= n; a++) {
            if (n % a != 0) {
                continue;
            }
            int ex = 0;
            while (n % a == 0) {
                ex++;
                n /= a;
            }
            res.add(Collections.singletonMap(a, ex));
        }
        if (n != 1) {
            res.add(Collections.singletonMap(n, 1));
        }
        return res;
    }

    private static long euler(final long n, final List<Map<Long, Integer>> pfs) {
        long res = n;
        for (Map<Long, Integer> pf : pfs) {
            for (Map.Entry<Long, Integer> entry : pf.entrySet()) {
                res *= entry.getKey()-1;
                res /= entry.getKey();
            }
        }
        return res;
    }

    // 1 - 1/2 = 1/2
    // 1 - 1/3 = 2/3
    // 1 - 1/4 = 3/4
}

