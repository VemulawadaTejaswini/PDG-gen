import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();

            ArrayList<Long> a = new ArrayList<>();
            ArrayList<Long> b = new ArrayList<>();
            ArrayList<Long> c = new ArrayList<>();

            ArrayList<Long> d = new ArrayList<>();
            ArrayList<Long> e = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a.add(in.nextLong());
            }
            for (int i = 0; i < n; i++) {
                b.add(in.nextLong());
            }
            for (int i = 0; i < n; i++) {
                c.add(in.nextLong());
            }

            Collections.sort(a);
            Collections.sort(b);
            Collections.sort(c);

            long ans = 0;
            for (int i = 0; i < n; i++) {
                long lowerResult = ~Collections.binarySearch(a, b.get(i), (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
                long upperResult = ~Collections.binarySearch(c, b.get(i), (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
                ans += lowerResult * (n - upperResult);
            }

            out.print(ans);
        }

    }
}

