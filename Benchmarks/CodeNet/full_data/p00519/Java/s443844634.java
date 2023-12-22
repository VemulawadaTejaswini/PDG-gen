import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] prices = new int[n + 1];
        int[] times = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prices[i] = sc.nextInt();
            times[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int[][] costs = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(costs[i], Integer.MAX_VALUE);
        }
        PriorityQueue<Path> queue = new PriorityQueue<>();
        queue.add(new Path(1, 1, 0));
        while (queue.size() > 0) {
            Path p = queue.poll();
            p.time--;
            if (costs[p.time][p.idx] <= p.value) {
                continue;
            }
            costs[p.time][p.idx] = p.value;
            for (int x : graph.get(p.idx)) {
                int nextCost = p.value + prices[p.idx];
                int nextTime = times[p.idx];
                if (nextTime > p.time && costs[nextTime - 1][x] > nextCost) {
                    queue.add(new Path(x, nextTime, nextCost));
                }
                if (p.time > 0 && costs[p.time - 1][x] > p.value) {
                    queue.add(new Path(x, p.time, p.value));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, costs[i][n]);
        }
        System.out.println(min);
    }
    
    static class Path implements Comparable<Path> {
        int idx;
        int time;
        int value;
        
        public Path(int idx, int time, int value) {
            this.idx = idx;
            this.time = time;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
        
        public String toString() {
            return idx + ":" + time + ":" + value;
        }
    }
}
