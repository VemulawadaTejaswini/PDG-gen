import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDecayedBridges solver = new DDecayedBridges();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDecayedBridges {
        public static DDecayedBridges.E[] edges;
        public static DDecayedBridges.V[] vertices;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            vertices = new DDecayedBridges.V[N + 1];
            for (int i = 1; i <= N; i++) {
                vertices[i] = new DDecayedBridges.V(i);
            }

            edges = new DDecayedBridges.E[M];
            for (int i = 0; i < M; i++) {
                edges[i] = new DDecayedBridges.E(in.nextInt(), in.nextInt(), i);
            }


            long[] res = new long[M + 1];
            res[M] = N * (N - 1) / 2;

            for (int i = M - 1; i >= 0; i--) {
                DDecayedBridges.E edge = edges[i];
                DDecayedBridges.V v1 = edge.v1;
                DDecayedBridges.V v2 = edge.v2;
                long diff = v1.join(v2);
                res[i] = res[i + 1] - diff;
            }

            if (res[0] < 0) {
                //System.err.println("res[0] = " + res[0]);
                throw new RuntimeException("res[0] = " + res[0]);
            }

            for (int i = 1; i <= M; i++) {
                out.println(res[i]);
            }


        }

        public static class E {
            DDecayedBridges.V v1;
            DDecayedBridges.V v2;
            int number;

            public E(int v1, int v2, int number) {
                this.v1 = vertices[v1];
                this.v2 = vertices[v2];
                this.number = number;
            }

        }

        public static class V {
            int id;
            DDecayedBridges.V group;
            long nb;

            public V(int id) {
                this.id = id;
                this.nb = 1;
            }

            public long join(DDecayedBridges.V v2) {
                DDecayedBridges.V v1Group = findGroup(v2);
                DDecayedBridges.V v2Group = findGroup(this);
                if (v1Group == v2Group) {
                    return 0;
                }
                long res = v2Group.nb * v1Group.nb;
                v1Group.nb += v2Group.nb;
                v2Group.group = v1Group;
                return res;
            }

            private DDecayedBridges.V findGroup(DDecayedBridges.V v) {
                DDecayedBridges.V res = v;
                while (res.group != null) {
                    res = res.group;
                }
                return res;
            }

        }

    }
}

