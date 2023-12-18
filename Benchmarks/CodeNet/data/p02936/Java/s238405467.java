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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int Q = in.nextInt();
            List<D.Node> nodes = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                D.Node node = new D.Node();
                nodes.add(node);
            }
            for (int i = 0; i < N - 1; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                nodes.get(a - 1).nodes.add(nodes.get(b - 1));
            }
            int[] x = new int[N];
            for (int i = 0; i < Q; i++) {
                int p = in.nextInt();
                x[p - 1] += in.nextInt();
            }
            for (int i = 0; i < Q; i++) {
                if (x[i] > 0) {
                    nodes.get(i).addPoint(x[i]);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (D.Node node : nodes) {
                sb.append(node.point).append(' ');
            }
            out.println(sb.substring(0, sb.length() - 1));
        }

        private static class Node {
            int point;
            List<D.Node> nodes = new ArrayList<>();

            private void addPoint(int x) {
                point += x;
                for (D.Node node : nodes) {
                    node.addPoint(x);
                }
            }

        }

    }
}

