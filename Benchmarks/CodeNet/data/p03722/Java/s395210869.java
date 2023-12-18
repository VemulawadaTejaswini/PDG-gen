
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

        Optional<long[]> ans = bellmanFord(n, es, 0);

        out.println(ans.map(x -> "" + (-x[n - 1])).orElse("inf"));

        out.flush();
    }

    Optional<long[]> bellmanFord(int n, Edge[] es, int s) {
        long[] d = new long[n];
        long INF = 1L << 60;

        Arrays.fill(d, INF);
        d[s] = 0;

        for (int i = 0; i < n; i++) {
            for (Edge e : es) {
                if (d[e.t] > d[e.f] + e.c) {
                    d[e.t] = d[e.f] + e.c;
                }
            }
        }

        for (Edge e : es) {
            if (d[e.t] > d[e.f] + e.c) {
                return Optional.empty();
            }
        }
        return Optional.of(d);
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