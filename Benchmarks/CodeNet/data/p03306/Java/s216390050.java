import java.util.*;

class E {
    static class Edge {
        final V to;
        final int s;

        public Edge(V to, int s) {
            this.to = to;
            this.s = s;
        }
    }

    static class V extends ArrayList<Edge> {
        final int index;

        public V(int index) {
            this.index = index;
        }
    }

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final V[] vs = new V[n];
        Arrays.setAll(vs, V::new);
        for (int i = 0; i < m; i++) {
            final int u = sc.nextInt() - 1;
            final int v = sc.nextInt() - 1;
            final int s = sc.nextInt();
            vs[u].add(new Edge(vs[v], s));
            vs[v].add(new Edge(vs[u], s));
        }
        final int[] a = new int[n];
        int up = 1_000_000_000;
        int lo = 0;
        while (up - lo > 1) {
            final int x = (up + lo) / 2;
            if (check(a, vs, x))
                lo = x;
            else
                up = x;
        }
        System.out.println(lo);
    }

    public static boolean check(int[] a, V[] vs, int x) {
        Arrays.fill(a, 0);
        a[0] = x;
        final Deque<Integer> que = new ArrayDeque<>();
        que.offerLast(0);
        while (!que.isEmpty()) {
            final int v = que.pollFirst();
            for (final Edge e : vs[v]) {
                final int b = e.s - a[v];
                if (b <= 0)
                    return false;
                if (a[e.to.index] == 0) {
                    a[e.to.index] = b;
                    que.offerLast(e.to.index);
                } else if (a[e.to.index] != b)
                    return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String...args) {
        E.main();
    }
}
