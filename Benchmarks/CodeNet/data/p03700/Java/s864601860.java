import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author acesine
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long a = in.nextLong(), b = in.nextLong();
            Queue<Long> h = new PriorityQueue<>(Comparator.reverseOrder());
            for (int i = 0; i < n; i++) {
                h.add(in.nextLong());
            }
            long carried = 0;
            long r = 0;
            while (h.size() > 0) {
                long top = h.poll();
                long base = 1;
                while (h.size() > 0 && h.peek() == top) {
                    h.poll();
                    base++;
                }
                if (carried >= top) break;
                if (h.size() > 0) {
                    long sec = h.peek();
                    long boom = (top - sec) % (a - b) == 0 ? (top - sec) / (a - b) : (top - sec) / (a - b) + 1;
                    carried += b * boom * base;
                    r += boom * base;
                    for (int i = 0; i < base; i++) h.add(top - (a - b) * boom);
                } else {
                    top -= carried;
                    long boom = top / (a + b * (base - 1));
                    boom *= base;
                    long rm = top % (a + b * (base - 1));
                    long up = rm % b == 0 ? rm / b : rm / b + 1;
                    //out.println(String.format("%d %d", up, base));
                    boom += Math.min(base, up);
                    r += boom;
                    break;
                }

            }
            out.println(r);
        }

    }
}

