import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECoinsRespawn solver = new ECoinsRespawn();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECoinsRespawn {
        static long[] dist;
        static int[] from;
        static ArrayList<ECoinsRespawn.Edge> edges;
        static int n;
        static int m;
        static int p;

        static long bellmanFord(int src) {
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;
            from = new int[n];
            Arrays.fill(from, -1);
            for (int i = 0; i < n - 1; i++) {
                for (ECoinsRespawn.Edge e : edges) {
                    if (dist[e.u] + e.w < dist[e.v]) {
                        dist[e.v] = dist[e.u] + e.w;
                        from[e.v] = e.u;
                    }
                }
            }
            long tmp = dist[n - 1];
            for (int i = 0; i < n - 1; i++) {
                for (ECoinsRespawn.Edge e : edges) {
                    if (dist[e.u] + e.w < dist[e.v]) {
                        dist[e.v] = dist[e.u] + e.w;
                        from[e.v] = e.u;
                    }
                }
            }
            if (tmp != dist[n - 1]) {
                return Integer.MIN_VALUE;
            } else {
                return tmp;
            }
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            n = sc.nextInt();
            m = sc.nextInt();
            p = sc.nextInt();
            dist = new long[n];
            edges = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                edges.add(new ECoinsRespawn.Edge(sc.nextInt() - 1, sc.nextInt() - 1, p - sc.nextInt()));
            }
            long ans = bellmanFord(0);
            if (ans == Integer.MIN_VALUE) {
                out.println("-1");
            } else {
                out.println(Math.max(0, -ans));
            }
        }

        static class Edge {
            int u;
            int v;
            long w;

            Edge(int a, int b, long c) {
                u = a;
                v = b;
                w = c;
            }

        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

