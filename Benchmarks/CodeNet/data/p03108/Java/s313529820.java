import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
            int N = in.nextInt();
            int M = in.nextInt();
            int edge[][] = new int[M][2];
            int a[] = new int[M + 1];

            for (int i = 0; i <= M - 1; i++) {
                edge[M - 1 - i][0] = in.nextInt();
                edge[M - 1 - i][1] = in.nextInt();
            }

            UnionFind u = new UnionFind(N);
            int ans = (N * (N - 1)) / 2;
            a[0] = ans;

            for (int i = 0; i <= M - 1; i++) {
                int id1 = edge[i][0] - 1;
                int id2 = edge[i][1] - 1;
                if (!u.same(id1, id2)) {
                    ans -= u.size(id1) * u.size(id2);
                }
                a[i + 1] = ans;
                u.union(id1, id2);
            }

            for (int i = 0; i <= M - 1; i++) {
                out.println(a[M - 1 - i]);
            }
        }

    }

    static class UnionFind {
        public static int[] par;
        public static int[] size;
        public static int g;

        UnionFind(int youso) {
            this.g = youso;
            this.par = new int[youso];
            this.size = new int[youso];
            for (int i = 0; i <= g - 1; i++) {
                par[i] = i;
            }
            for (int i = 0; i <= g - 1; i++) {
                size[i] = 1;
            }
        }

        public static int find(int node) {
            if (par[node] == node) {
                return node;
            }
            return par[node] = find(par[node]);
        }

        public static void union(int node1, int node2) {
            int root1 = find(node1);
            int root2 = find(node2);
            if (node1 == node2) {
                return;
            }
            g--;
            if (size[node1] < size[node2]) {
                int temp = root1;
                root1 = root2;
                root2 = temp;
            }
            size[root1] += size[root2];
            par[root2] = root1;
        }

        public static int size(int node) {
            return size[find(node)];
        }

        public static boolean same(int node1, int node2) {
            return find(node1) == find(node2);
        }

    }
}


