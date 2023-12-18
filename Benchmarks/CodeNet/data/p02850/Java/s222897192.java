import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.util.OptionalInt;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            List<D.Node> nodes = new ArrayList<>();
            List<D.Edge> edges = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                nodes.add(new D.Node(i));
            }
            for (int i = 0; i < N - 1; i++) {
                int a = in.Int() - 1;
                int b = in.Int() - 1;

                D.Edge e = new D.Edge(a, b);
                edges.add(e);
                nodes.get(a).e.add(e);
                nodes.get(b).e.add(e);
            }
            for (int i = 0; i < N; i++) {
                D.Node n = nodes.get(i);
                int c = 1;
                for (D.Edge e : n.e) {
                    if (e.c > 0) continue;
                    while (n.cs.contains(c)) c++;
                    e.c = c;
                    n.cs.add(c);
                    nodes.get(n.no == e.a ? e.b : e.a).cs.add(c);
                }
            }
            out.println(edges.stream().mapToInt(e -> e.c).max().getAsInt());
            for (int i = 0; i < N - 1; i++) {
                D.Edge e = edges.get(i);
                out.println(e.c);
            }
        }

        static class Edge {
            int a;
            int b;
            int c = 0;

            Edge(int _a, int _b) {
                a = _a;
                b = _b;
            }

        }

        static class Node {
            int no;
            List<D.Edge> e = new ArrayList<>();
            Set<Integer> cs = new HashSet<>();

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

