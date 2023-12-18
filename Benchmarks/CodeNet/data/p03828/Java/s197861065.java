import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FactorsFactorial solver = new FactorsFactorial();
        solver.solve(1, in, out);
        out.close();
    }

    static class FactorsFactorial {
        public static long MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long result = 1;
            HashMap<Long, Long> map = new HashMap<>();
            for (int i = 2; i <= n; i++) {
                HashMap<Long, Long> p = primeFactorize(i);
                for (long key : p.keySet()) {
                    map.put(key, map.getOrDefault(key, 0L) + p.get(key));
                }
            }
            for (long key : map.keySet()) {
                result *= (map.get(key) + 1);
                result %= MOD;
            }
            out.println(result);
        }

        static HashMap<Long, Long> primeFactorize(long x) {
            HashMap<Long, Long> result = new HashMap<>();
            for (long i = 2; i * i <= x; i++) {
                if (x % i != 0) {
                    continue;
                }
                long ex = 0;
                while (x % i == 0) {
                    ex++;
                    x /= i;
                }
                result.put(i, ex);
            }
            if (x != 1) {
                result.put(x, 1L);
            }
            return result;
        }

    }
}

