import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    private static class Edge {
        int from;
        int to;
        long cost;

        private Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    public static long dijkstra(Map<Integer, List<Edge>> allEdges, int start, int end, int nodeNum) {
        long[] d = new long[nodeNum + 1];
        Arrays.fill(d, -1);
        PriorityQueue<Edge> heap = new PriorityQueue<>(Comparator.comparingLong(a -> d[a.from] + a.cost));
        d[start] = 0;
        List<Edge> edges = allEdges.get(start);
        heap.addAll(edges);
        while (d[end] < 0) {
            Edge nearest = heap.poll();
            if (d[nearest.to] >= 0) {
                continue;
            }
            d[nearest.to] = d[nearest.from] + nearest.cost;
            if (!allEdges.containsKey(nearest.to)) {
                continue;
            }
            edges = allEdges.get(nearest.to);
            for (int i = 0; i < edges.size(); i++) {
                Edge edge = edges.get(i);
                if (d[edge.to] < 0) {
                    heap.add(edge);
                }
            }
        }
        return d[end];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        long[] c = new long[n - 1];
        Map<Integer, List<Edge>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextLong();
            List<Edge> l1 = map.get(a[i]);
            l1.add(new Edge(a[i], b[i], c[i]));
            map.put(a[i], l1);
            List<Edge> l2 = map.get(b[i]);
            l2.add(new Edge(b[i], a[i], c[i]));
            map.put(b[i], l2);
        }
        int q = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[q];
        int[] y = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        long[] d = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            d[i] = dijkstra(map, k, i, n);
        }
        for (int i = 0; i < q; i++) {
            System.out.println(d[x[i]] + d[y[i]]);
        }
    }

}


