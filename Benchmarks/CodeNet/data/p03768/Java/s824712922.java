import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int m = in.nextInt();
            List<Integer> edges[] = new List[n];
            for (int i = 0; i < n; ++i) {
                edges[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; ++i) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                edges[a].add(b);
                edges[b].add(a);
            }
            int q = in.nextInt();
            int v[] = new int[q];
            int d[] = new int[q];
            int c[] = new int[q];
            for (int i = 0; i < q; ++i) {
                v[i] = in.nextInt() - 1;
                d[i] = in.nextInt();
                c[i] = in.nextInt();
            }
            int color[] = new int[n];
            int dist[] = new int[n];
            for (int i = q - 1; i >= 0; --i) {
                class Vertex {
                    int v, d, c;

                    Vertex(int v, int d, int c) {
                        this.v = v;
                        this.d = d;
                        this.c = c;
                    }
                }
                Queue<Vertex> queue = new ArrayDeque<>();
                queue.add(new Vertex(v[i], d[i], c[i]));
                while (queue.size() > 0) {
                    Vertex x = queue.poll();
                    if (dist[x.v] > x.d) continue;
                    dist[x.v] = x.d;
                    if (color[x.v] == 0) color[x.v] = x.c;
                    for (Integer k : edges[x.v]) {
                        queue.add(new Vertex(k, x.d - 1, x.c));
                    }
                }
            }
            for (int i = 0; i < n; ++i) {
                System.out.println(color[i]);
            }
        }
    }
}
