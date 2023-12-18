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
        Fouradjacent solver = new Fouradjacent();
        solver.solve(1, in, out);
        out.close();
    }

    static class Fouradjacent {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int is_two = 0;
            int is_four = 0;
            int is_one = 1;
            for (int i = 0; i < n; i++) {
                long a = in.nextLong();
                HashMap<Long, Long> e = primeFactorize(a);
                if (!e.containsKey(2L)) {
                    is_one++;
                } else {
                    if (e.get(2L) > 1) {
                        is_four++;
                    } else {
                        is_two++;
                    }
                }
            }
            if (n % 2 == 0) {
                int zan = n - (is_four * 2);
                if (zan <= 0) {
                    out.print("Yes");
                    return;
                }
                if (zan <= is_two) {
                    out.print("Yes");
                    return;
                }
            } else {
                int zan = (n - 1) - (is_four * 2);
                if (zan <= 0) {
                    out.print("Yes");
                    return;
                }
                zan++;
                if (zan <= is_two) {
                    out.print("Yes");
                    return;
                }
            }
            out.print("No");
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

