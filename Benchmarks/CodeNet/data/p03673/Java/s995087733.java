import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayDeque;

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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            ArrayDeque<Integer> deq = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    deq.offerLast(a[i]);
                } else {
                    deq.offerFirst(a[i]);
                }
            }

            if (n % 2 == 0) {
                for (Object x : deq.toArray()) out.print(x + " ");
            } else {
                for (int i = 0; i < n; ++i) {
                    out.print(deq.getLast() + " ");
                    deq.removeLast();
                }
            }
        }

    }
}

