import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        UnionFind road = new UnionFind(n);
        UnionFind rail = new UnionFind(n);
        for (int i = 0; i < k; i++) {
            road.unite(scanner.nextInt() - 1, scanner.nextInt() - 1);
        }
        for (int i = 0; i < l; i++) {
            rail.unite(scanner.nextInt() - 1, scanner.nextInt() - 1);
        }

        Point[] keys = new Point[n];
        Map<Point, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            keys[i] = new Point(road.root(i), rail.root(i));
            count.compute(keys[i], (key, value) -> value == null ? 1 : value + 1);
        }

        System.out.println(Arrays.stream(keys).map(count::get).map(String::valueOf).collect(Collectors.joining(" ")));
    }

    static class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int root(int n) {
            while (parent[n] != n) {
                n = parent[n] = parent[parent[n]];
            }
            return n;
        }

        public void unite(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                parent[x] = y;
            }
        }

        public boolean same(int x, int y) {
            return root(x) == root(y);
        }
    }
}