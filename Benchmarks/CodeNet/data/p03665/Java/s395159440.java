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
        Atg017A solver = new Atg017A();
        solver.solve(1, in, out);
        out.close();
    }

    static class Atg017A {
        int a;
        int p;
        int n;
        HashMap<String, Long> cache = new HashMap<String, Long>();

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            p = in.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            if (p != 0 && p != 1) {
                out.println("0");
                return;
            }
            long result = calc(0, false);
            out.println(result);
        }

        long calc(int index, boolean isOdd) {
            String key = index + "-" + (isOdd ? 1 : 0);
            Long result = cache.get(key);
            if (result != null) {
                return result;
            }
            if (index == n) {
                return ((p == 0 && !isOdd) || (p == 1 && isOdd)) ? 1 : 0;
            }
            boolean isOdd2;
            if ((a[index] % 2) == 1) {
                isOdd2 = !isOdd;
            } else {
                isOdd2 = isOdd;
            }
            long total = calc(index + 1, isOdd) + calc(index + 1, isOdd2);
            cache.put(key, total);
            return total;
        }

    }
}

