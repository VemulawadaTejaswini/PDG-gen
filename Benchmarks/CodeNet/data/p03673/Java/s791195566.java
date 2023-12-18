import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
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
        pushpush solver = new pushpush();
        solver.solve(1, in, out);
        out.close();
    }

    static class pushpush {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            List<Long> list = new ArrayList<>();
            boolean is_odd = true;
            for (int i = 0; i < n; i++) {
                if (is_odd) {
                    list.add(a[i]);
                } else {
                    list.add(0, a[i]);
                }
                is_odd = !is_odd;
            }

            if (n % 2 == 0) {
                out.print(list.stream().map(Object::toString).collect(Collectors.joining(" ")));
            } else {
                Collections.reverse(list);
                out.print(list.stream().map(Object::toString).collect(Collectors.joining(" ")));
            }


        }

    }
}

