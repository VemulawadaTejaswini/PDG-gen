import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class E {
    static class Edge implements Comparable<Edge> {
        final int A, B;
        final long cost;

        public Edge(int a, int b, long cost) {
            A = a;
            B = b;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Long.compare(cost, o.cost);
        }
    }

    private static class UnionFind {
        final int[] tree;

        private UnionFind(int size) {
            this.tree = new int[size];
            Arrays.fill(tree, -1);
        }

        public boolean union(int x, int y) {
            x = root(x);
            y = root(y);
            if (x == y)
                return false;
            if (tree[y] < tree[x]) {
                final int t = y;
                y = x;
                x = t;
            }
            tree[x] += tree[y];
            tree[y] = x;
            return true;
        }

        private int root(final int x) {
            return tree[x] < 0 ? x : (tree[x] = root(tree[x]));
        }
    }

    static class Group {
        final long value;
        final Group[] children;
        final int id;
        final boolean satisfied;

        public Group(long value, Group[] children, int id, boolean satisfied) {
            this.value = value;
            this.children = children;
            this.id = id;
            this.satisfied = satisfied;
        }

        ArrayList<Integer> members() {
            final ArrayList<Integer> ret = new ArrayList<>();
            final ArrayDeque<Group> que = new ArrayDeque<>();
            que.offerLast(this);
            while (!que.isEmpty()) {
                final Group g = que.pollFirst();
                if (g.id >= 0)
                    ret.add(g.id);
                else {
                    for (final Group child : g.children)
                        que.offerLast(child);
                }
            }
            return ret;
        }
    }

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final long[] X = new long[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextLong();
            sum += X[i];
        }
        final Edge[] es = new Edge[M];
        for (int i = 0; i < M; i++)
            es[i] = new Edge(sc.nextInt() - 1, sc.nextInt() - 1, sc.nextLong());
        Arrays.sort(es);
        final UnionFind uf = new UnionFind(N);
        final Group[] gs = new Group[N];
        for (int i = 0; i < N; i++)
            gs[i] = new Group(X[i], null, i, true);
        for (final Edge e : es)
            if (e.cost <= sum) {
                final int a = uf.root(e.A);
                final int b = uf.root(e.B);
                if (uf.union(e.A, e.B)) {
                    final long value = gs[a].value + gs[b].value;
                    gs[uf.root(e.A)] = new Group(value, new Group[]{gs[a], gs[a]}, -1, value >= e.cost);
                }
            }
        final ArrayDeque<Group> que = new ArrayDeque<>();
        for (int i = 0; i < N; i++)
            if (uf.root(i) == i)
                que.offerLast(gs[i]);
        final ArrayList<Group> survivers = new ArrayList<>();
        while (!que.isEmpty()) {
            final Group g = que.pollFirst();
            if (g.satisfied)
                survivers.add(g);
            else {
                for (final Group child : g.children)
                    que.offerLast(child);
            }
        }
        final int[] map = new int[N];
        for (int i = 0; i < survivers.size(); i++)
            for (final int j : survivers.get(i).members())
                map[j] = i;
        long ans = 0;
        for (final Edge e : es) {
            if (map[e.A] != map[e.B] || survivers.get(map[e.A]).value < e.cost)
                ans++;
        }
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String... args) {
        E.main();
    }
}
