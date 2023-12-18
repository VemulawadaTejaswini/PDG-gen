import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long A = in.nextLong();
            long B = in.nextLong();
            long max = gcd(A, B);
            List<Long> list = new ArrayList<>(Collections.singletonList(1L));
            for (long i = 2; i <= max; i++) {
                if (max % i == 0) {
                    if (!list.contains(i)) {
                        list.add(i);
                    }
                    max /= i--;
                }
            }
            out.println(list.size());
        }

        long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

    }
}

