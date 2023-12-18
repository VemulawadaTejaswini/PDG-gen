import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Collections;

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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int h = in.nextInt();
            final int w = in.nextInt();
            final int d = in.nextInt();

            Set<Integer> container = new HashSet<>();
            Map<Integer, Integer> x = new HashMap<>();
            Map<Integer, Integer> y = new HashMap<>();
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int n = in.nextInt();
                    container.add(n);
                    y.put(n, i);
                    x.put(n, j);
                }
            }

            Map<Integer, Integer> dist = new HashMap<>();
            while (container.size() > 0) {
                int n = Collections.max(container);
                int cd = 0;
                int next = n - d;
                int nX = x.get(n);
                int nY = y.get(n);
                while (container.contains(next)) {
                    int nextX = x.get(next);
                    int nextY = y.get(next);
                    dist.put(n, cd);
                    container.remove(n);
                    cd += Math.abs(nX - nextX) + Math.abs(nY - nextY);
                    n = next;
                    nX = nextX;
                    nY = nextY;
                    next -= d;
                }
                dist.put(n, cd);
                container.remove(n);
            }

            final int q = in.nextInt();
            int[] lr = new int[q * 2];
            for (int i = 0; i < q; i++) {
                lr[i * 2] = in.nextInt();
                lr[i * 2 + 1] = in.nextInt();
            }

            for (int i = 0; i < q; i++) {
                out.println(dist.get(lr[i * 2]) - dist.get(lr[i * 2 + 1]));
            }
        }

    }
}

