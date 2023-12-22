import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        ArrayList<HashMap<Integer, Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new HashMap<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (a != b && (!graph.get(a).containsKey(b) || graph.get(a).get(b) > d)) {
                graph.get(a).put(b, d);
                graph.get(b).put(a, d);
            }
            if (b != c && (!graph.get(b).containsKey(c) || graph.get(b).get(c) > d)) {
                graph.get(b).put(c, d);
                graph.get(c).put(b, d);
            }
            if (c != a && (!graph.get(c).containsKey(a) || graph.get(c).get(a) > d)) {
                graph.get(a).put(c, d);
                graph.get(c).put(a, d);
            }
        }
        PriorityQueue<Path> queue = new PriorityQueue<>();
        queue.add(new Path(s, 0));
        long[] costs = new long[n + 1];
        Arrays.fill(costs, Long.MAX_VALUE);
        while (queue.size() > 0) {
            Path p = queue.poll();
            if (costs[p.idx] <= p.value) {
                continue;
            }
            costs[p.idx] = p.value;
            for (Map.Entry<Integer, Integer> entry : graph.get(p.idx).entrySet()) {
                if (costs[entry.getKey()] > entry.getValue() + p.value) {
                    queue.add(new Path(entry.getKey(), entry.getValue() + p.value));
                }
            }
        }
        System.out.println(costs[t]);
    }
    
    static class Path implements Comparable<Path> {
        int idx;
        long value;
        
        public Path(int idx, long value) {
            this.idx = idx;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            if (value == another.value) {
                return 0;
            } else if (value < another.value) {
                return -1;
            } else {
                return 1;
            }
        }
        
        public String toString() {
            return "idx:" + idx + " value:" + value;
        }
    }
}

