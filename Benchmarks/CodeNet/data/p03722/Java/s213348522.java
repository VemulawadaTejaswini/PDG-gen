
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        int n = sc.nextInt(), m = sc.nextInt();
        Edge[] es = new Edge[m];
        for (int i = 0; i < m; i++) {
            es[i] = new Edge(sc.nextInt() - 1, sc.nextInt() - 1, -sc.nextInt());
        }

        Optional<Long> ans = bellmanFord(n, es, 0, n - 1);

        out.println(ans.map(x -> "" + (-x)).orElse("inf"));

        out.flush();
    }

    Optional<Long> bellmanFord(int n, Edge[] es, int src, int dst) {
        long[] d = new long[n];
        long INF = 1L << 60;

        Arrays.fill(d, INF);
        d[src] = 0;

        int[] to = new int[n];
        Arrays.fill(to, -1);
        to[src] = src;

        for (int i = 0; i < n - 1; i++) {
            for (Edge e : es) {
                if (d[e.t] > d[e.f] + e.c) {
                    d[e.t] = d[e.f] + e.c;
                    to[e.t] = e.f;
                }
            }
        }

        for (Edge e : es) {
            if (d[e.t] > d[e.f] + e.c && to[e.t] == e.f) {
                return Optional.empty();
            }
        }
        return d[dst] != INF ? Optional.of(d[dst]) : Optional.empty();
    }



    class Edge {
        int f, t;
        long c;
        Edge(int f, int t, long c) {
            this.f = f;
            this.t = t;
            this.c = c;
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}