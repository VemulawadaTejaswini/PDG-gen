import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CAlchemist solver = new CAlchemist();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAlchemist {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            PriorityQueue<Double> a = new PriorityQueue<>(n);
            for (int i = 0; i < n; i++) {
                a.add(in.nextDouble());
            }
            while (a.size() > 1) {
                double x = a.poll();
                double y = a.poll();
                a.add((x + y) / 2);
            }
            out.println(a.poll());
        }

    }
}

