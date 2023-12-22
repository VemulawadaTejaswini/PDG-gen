import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long n = sc.nextLong();

        final List<Map<Long, Integer>> pfs = primeFactorize(n);

        System.out.print(n + ":");
        for (Map<Long, Integer> pf : pfs) {
            for (Map.Entry<Long, Integer> entry : pf.entrySet()) {
                for (int i = 0; i < entry.getValue(); i++) {
                    System.out.print(" " + entry.getKey());
                }
            }
        }
        System.out.println();
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
}

