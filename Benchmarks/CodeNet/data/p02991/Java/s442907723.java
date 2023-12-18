import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
        }
        int start = sc.nextInt() - 1;
        int end = sc.nextInt() - 1;
        PriorityQueue<Path> queue = new PriorityQueue<>();
        queue.add(new Path(start, 0, 0));
        int[][] costs = new int[3][n];
        for (int[] arr : costs) {
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
        while (queue.size() > 0) {
            Path p = queue.poll();
            if (costs[p.mod][p.idx] <= p.value) {
                continue;
            }
            costs[p.mod][p.idx] = p.value;
            for (int x : graph.get(p.idx)) {
                queue.add(new Path(x, (p.mod + 1) % 3, p.value + 1));
            }
        }
        if (costs[0][end] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(costs[0][end] / 3);
        }
    }
    
    static class Path implements Comparable<Path> {
        int idx;
        int mod;
        int value;
        public Path(int idx, int mod, int value) {
            this.idx = idx;
            this.mod = mod;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
}