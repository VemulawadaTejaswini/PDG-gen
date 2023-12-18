import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        final int INF = (int) 1e9 + 1;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            List<Integer>[] G = new List[N];
            for (int i = 0; i < G.length; i++) {
                G[i] = new ArrayList<>();
            }
            UnionFind uf = new UnionFind(N);
            for (int i = 0; i < M; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                G[x].add(y);
                G[y].add(x);
                uf.unite(x, y);
            }
            if (uf.size() == 1) {
                out.println(0);
                return;
            }
            int need = (uf.size() - 1) << 1;
            if (need > N) {
                out.println("Impossible");
                return;
            }
            long ans = 0;
            int[] mi = new int[N];
            int[] idx = new int[N];
            Arrays.fill(mi, INF);
            for (int i = 0; i < N; i++) {
                if (mi[uf.find(i)] > a[i]) {
                    mi[uf.find(i)] = a[i];
                    idx[uf.find(i)] = i;
                }
            }
            for (int i = 0; i < N; i++) {
                if (mi[i] < INF) {
                    ans += mi[i];
                    a[idx[i]] = INF;
                    need--;
                }
            }
            Arrays.sort(a);
            for (int i = 0; i < need; i++) {
                ans += a[i];
            }
            out.println(ans);
        }

    }

    static class UnionFind {
        private int[] uni;
        private int size_;

        public UnionFind(int n) {
            this.uni = new int[n];
            Arrays.fill(this.uni, -1);
            this.size_ = n;
        }

        public int find(int v) {
            if (this.uni[v] < 0) {
                return v;
            } else {
                return this.uni[v] = this.find(this.uni[v]);
            }
        }

        public boolean unite(int a, int b) {
            a = this.find(a);
            b = this.find(b);
            if (a == b) {
                return false;
            }
            this.size_--;
            if (this.uni[a] > this.uni[b]) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            this.uni[a] += this.uni[b];
            this.uni[b] = a;
            return true;
        }

        public int size() {
            return this.size_;
        }

    }
}

