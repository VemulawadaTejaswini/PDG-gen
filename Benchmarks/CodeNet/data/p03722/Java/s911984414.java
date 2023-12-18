import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.util.Deque;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int M = in.Int();
            List<F.Node> nodes = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                nodes.add(new F.Node(i));
            }
            for (int i = 0; i < M; i++) {
                int a = in.Int() - 1;
                int b = in.Int() - 1;
                int c = in.Int();
                nodes.get(a).to.add(new F.Edge(b, c));
            }
            nodes.get(0).c = 0;
            Deque<F.Node> que = new LinkedList<>();
            que.add(nodes.get(0));
            while (!que.isEmpty()) {
                F.Node node = que.poll();
                if (node.v > 1) {
                    if (node.co < node.c) {
                        out.println("inf");
                        return;
                    } else {
                        continue;
                    }
                }
                node.v++;
                for (F.Edge e : node.to) {
                    F.Node next = nodes.get(e.to);
                    next.co = next.c;
                    next.c = Math.max(next.c, e.cost + node.c);
                    que.add(next);
                }
            }
            out.println(nodes.get(N - 1).c);
        }

        static class Edge {
            int to;
            long cost;

            Edge(int _to, int _cost) {
                to = _to;
                cost = _cost;
            }

        }

        static class Node {
            int no;
            List<F.Edge> to = new ArrayList<>();
            long c = -1L << 60;
            long co = 0;
            int v = 0;

            Node(int _no) {
                no = _no;
            }

        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

