import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
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
        Ki solver = new Ki();
        solver.solve(1, in, out);
        out.close();
    }

    static class Ki {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();

            List<List<Node>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            long[] cost = new long[n + 1];
            long[] result = new long[n + 1];

            for (int i = 1; i <= n - 1; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                (graph.get(a)).add(new Node(b));
                (graph.get(b)).add(new Node(a));
            }
            for (int i = 0; i < q; i++) {
                int p = in.nextInt();
                long x = in.nextLong();
                cost[p] = cost[p] + x;
            }

            for (int i = 1; i <= n; i++) {
                for (Node child : graph.get(i)) {
                    if (child.num <= i) {
                        continue;
                    }
                    cost[child.num] += cost[i];
                }
                out.print(cost[i] + " ");
            }
        }

        class Node {
            public final Integer num;

            Node(Integer num) {
                this.num = num;
            }

        }

    }
}

