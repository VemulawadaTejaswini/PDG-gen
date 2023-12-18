import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long inf = 0x7ffffffffffffffL;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt() - 1;
        int t = scanner.nextInt() - 1;
        long[] dist1 = new long[n];
        Arrays.fill(dist1, inf);
        dist1[s] = 0;
        long[] dist2 = new long[n];
        Arrays.fill(dist2, inf);
        dist2[t] = 0;
        TreeMap<Integer, Set<Edge>> edge1 = new TreeMap<>(Comparator.<Integer>comparingLong(i -> dist1[i]).thenComparing(Comparator.naturalOrder()));
        TreeMap<Integer, Set<Edge>> edge2 = new TreeMap<>(Comparator.<Integer>comparingLong(i -> dist2[i]).thenComparing(Comparator.naturalOrder()));
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edge1.computeIfAbsent(u, key -> new TreeSet<>(Comparator.comparingLong(edge -> edge.c))).add(new Edge(v, a));
            edge1.computeIfAbsent(v, key -> new TreeSet<>(Comparator.comparingLong(edge -> edge.c))).add(new Edge(u, a));
            edge2.computeIfAbsent(u, key -> new TreeSet<>(Comparator.comparingLong(edge -> edge.c))).add(new Edge(v, b));
            edge2.computeIfAbsent(v, key -> new TreeSet<>(Comparator.comparingLong(edge -> edge.c))).add(new Edge(u, b));
        }

        while (!edge1.isEmpty()) {
            Map.Entry<Integer, Set<Edge>> entry = edge1.firstEntry();
            for (Edge edge : edge1.remove(entry.getKey())) {
                if (dist1[edge.v] > dist1[entry.getKey()] + edge.c) {
                    Set<Edge> set = edge1.remove(edge.v);
                    dist1[edge.v] = dist1[entry.getKey()] + edge.c;
                    if (set != null) {
                        edge1.put(edge.v, set);
                    }
                }
            }
            Utils.println(entry, Arrays.toString(dist1), "\n" + edge1 + "\n");
        }

        while (!edge2.isEmpty()) {
            Map.Entry<Integer, Set<Edge>> entry = edge2.firstEntry();
            edge2.remove(entry.getKey());
            for (Edge edge : entry.getValue()) {
                if (dist2[edge.v] > dist2[entry.getKey()] + edge.c) {
                    Set<Edge> set = edge2.remove(edge.v);
                    dist2[edge.v] = dist2[entry.getKey()] + edge.c;
                    if (set != null) {
                        edge2.put(edge.v, set);
                    }
                }
            }
        }

        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.compute(dist1[i] + dist2[i], (key, value) -> value == null ? 1 : value + 1);
        }

        for (int i = 0; i < n; i++) {
            System.out.println((long)1e15 - map.firstKey());
            map.compute(dist1[i] + dist2[i], (key, value) -> value == 1 ? null : value - 1);
        }
    }

    static class Edge implements Comparable<Edge> {
        int v;
        long c;

        Edge(int v, long c) {
            this.v = v;
            this.c = c;
        }

        @Override
        public int compareTo(Edge o) {
            return Long.compare(c, o.c);
        }
    }
}