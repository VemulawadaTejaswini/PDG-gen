import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (h == 0 && w == 0) {
                break;
            }
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < h * w; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w - 1; j++) {
                    if (sc.nextInt() == 0) {
                        int a = i * w + j;
                        int b = a + 1;
                        graph.get(a).add(b);
                        graph.get(b).add(a);
                    }
                }
                if (i == h - 1) {
                    break;
                }
                for (int j = 0; j < w; j++) {
                    if (sc.nextInt() == 0) {
                        int a = i * w + j;
                        int b = a + w;
                        graph.get(a).add(b);
                        graph.get(b).add(a);
                    }
                }
            }
            int[] costs = new int[h * w];
            Arrays.fill(costs, Integer.MAX_VALUE);
            PriorityQueue<Path> queue = new PriorityQueue<>();
            queue.add(new Path(0, 1));
            while (queue.size() > 0) {
                Path p = queue.poll();
                if (costs[p.idx] <= p.value) {
                    continue;
                }
                costs[p.idx] = p.value;
                for (int x : graph.get(p.idx)) {
                    queue.add(new Path(x, p.value + 1));
                }
            }
            if (costs[h * w - 1] == Integer.MAX_VALUE) {
                sb.append(0);
            } else {
                sb.append(costs[h * w - 1]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
    
    static class Path implements Comparable<Path> {
        int idx;
        int value;
        
        public Path(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
}

