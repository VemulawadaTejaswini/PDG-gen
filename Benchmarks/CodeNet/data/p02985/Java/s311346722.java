import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EVirusTree2 solver = new EVirusTree2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EVirusTree2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int k = in.nextInt();
            Graph g = new Graph(n);
            boolean[] used = new boolean[n];
            Arrays.fill(used, false);
            ModInt res;
            ModComb mc = new ModComb(200000);

            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                g.addUnDirectedEdge(new Edge(a, b, 0));
            }

            used[0] = true;
            Queue<Integer> q = new ArrayDeque<>();
            q.add(0);
            res = new ModInt(k);
            while (!q.isEmpty()) {
                int cnt = 0;
                int nxt = q.poll();
                ArrayList<Edge> adj = g.getAdj()[nxt];
                for (Edge e : adj) {
                    if (!used[e.getTo()]) {
                        used[e.getTo()] = true;
                        q.add(e.getTo());
                        cnt++;
                    }
                }
                res = res.mul(mc.combFac(k - 1 - adj.size() + cnt, cnt).mul(mc.getFac(cnt)));
            }
            out.println(res.getVal());


        }

    }

    static class Edge {
        int from;
        int to;
        long cost;

        public Edge(int to) {
            this.to = to;
        }

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public int getTo() {
            return to;
        }

        public Edge inv() {
            return new Edge(to, from, cost);
        }

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }

    static class ModComb {
        private int size;
        private ModInt[] fac;
        private ModInt[] inv;

        public ModComb(int n) {
            size = n;
            fac = new ModInt[n + 1];
            inv = new ModInt[n + 1];
            makeFac();
        }

        private void makeFac() {
            for (int i = 0; i <= size; i++) {
                if (i == 0) {
                    fac[i] = new ModInt(1);
                } else {
                    fac[i] = fac[i - 1].mul(i);
                }
                inv[i] = fac[i].inv();
            }
        }

        public ModInt combFac(int n, int k) {
            if (n < k) {
                return new ModInt(0);
            }
            return fac[n].mul(inv[k].getVal()).mul(inv[n - k].getVal());
        }

        public ModInt getFac(int n) {
            return fac[n];
        }

    }

    static class Graph {
        int n;
        ArrayList<Edge>[] adj;
        long[] vertexCost;

        public Graph(int size) {
            n = size;
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            vertexCost = new long[n];
        }

        public void addEdge(Edge e) {
            adj[e.from].add(e);
        }

        public void addUnDirectedEdge(Edge e) {
            addEdge(e);
            addEdge(e.inv());
        }

        public ArrayList<Edge>[] getAdj() {
            return adj;
        }

    }

    static class ModInt {
        long val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (i + MOD) % MOD;
        }

        public ModInt mul(long l) {
            return new ModInt(this.val * l);
        }

        public ModInt mul(ModInt m) {
            return new ModInt(this.val * m.getVal());
        }

        public ModInt inv() {
            return this.pow(MOD - 2);
        }

        public ModInt pow(long l) {
            ModInt res = new ModInt(1);
            ModInt v = new ModInt(this.val);
            while (l > 0) {
                if (l % 2 != 0) {
                    res = res.mul(v.val);
                }
                v = v.mul(v.val);
                l /= 2;
            }
            return res;
        }

        public long getVal() {
            return val;
        }

        public String toString() {
            return "ModInt{" +
                    "val=" + val +
                    ", MOD=" + MOD +
                    '}';
        }

    }
}

