import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
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
        CADDi_C solver = new CADDi_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class CADDi_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            long p = in.nextLong();
            long copy = p;
            Map<Long, Long> prime = new HashMap<Long, Long>();

            long cnt = 0;
            long ans = 1;
            while (p % 2 == 0) {
                cnt++;
                p /= 2;
            }
            if (cnt / n != 0) {
                ans *= 2 * (cnt / n);
            }

            long i = 3;
            cnt = 0;
            while (p != 1) {
                if (p % i == 0) {
                    cnt++;
                    p /= i;
                } else {
                    if (cnt / n != 0) {
                        ans *= i * (cnt / n);
                    }
                    i += 2;
                    cnt = 0;
                }
            }
            if (cnt / n != 0) {
                ans *= i * (cnt / n);
            }
            out.print(ans);

        }

    }
}

