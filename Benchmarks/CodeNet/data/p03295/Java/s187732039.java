import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;

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
        IslandsWar solver = new IslandsWar();
        solver.solve(1, in, out);
        out.close();
    }

    static class IslandsWar {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            //昇順
            PriorityQueue<Integer> left = new PriorityQueue<>(m, Integer::compare);
            PriorityQueue<Integer> right = new PriorityQueue<>(m, Integer::compare);
            for (int i = 0; i < m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                left.add(a);
                right.add(b);
            }

            long result = 0;
            int rv = 0;
            while (!right.isEmpty()) {
                rv = right.poll();
                if (left.isEmpty()) {
                    break;
                }
                int lv = left.poll();
                if (lv < rv) {
                    while (lv < rv && !left.isEmpty()) {
                        lv = left.poll();
                    }
                    if (lv >= rv) {
                        left.add(lv);
                    }
                    result++;
                } else if (lv == rv) {
                    while (lv == rv && !left.isEmpty() && !right.isEmpty()) {
                        lv = left.poll();
                        rv = right.poll();
                    }
                    result++;
                } else {
                    // left が大きい
                    while (rv < lv && !right.isEmpty()) {
                        rv = right.poll();
                    }
                    if (rv >= lv) {
                        right.add(rv);
                    }
                    result++;
                }
            }
            out.println(result);
        }

    }
}

