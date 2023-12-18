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
            graph.get(sc.nextInt() - 1).add(sc.nextInt() - 1);
        }
        int start = sc.nextInt() - 1;
        int end = sc.nextInt() - 1;
        PriorityQueue<Path> queue = new PriorityQueue<>();
        queue.add(new Path(start, 0, 0));
        int[][] points = new int[3][n];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(points[i], Integer.MAX_VALUE);
        }
        while (queue.size() > 0) {
            Path p = queue.poll();
            if (points[p.count][p.idx] <= p.value) {
                continue;
            }
            points[p.count][p.idx] = p.value;
            for (int x : graph.get(p.idx)) {
                queue.add(new Path(x, p.value + 1, (p.count + 1) % 3));
            }
        }
        if (points[0][end] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(points[0][end] / 3);
        }
    }
    
    static class Path implements Comparable<Path> {
        int idx;
        int value;
        int count;
        
        public Path(int idx, int value, int count) {
            this.idx = idx;
            this.value = value;
            this.count = count;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
   
   
}