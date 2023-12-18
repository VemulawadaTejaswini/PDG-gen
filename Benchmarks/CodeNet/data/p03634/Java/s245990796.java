import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<HashMap<Integer, Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new HashMap<>());
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    int c = sc.nextInt();
		    graph.get(a).put(b, c);
		    graph.get(b).put(a, c);
		}
		int q = sc.nextInt();
		int k = sc.nextInt() - 1;
		PriorityQueue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(k, 0));
		long[] costs = new long[n];
		Arrays.fill(costs, Long.MAX_VALUE);
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (costs[p.idx] <= p.value) {
		        continue;
		    }
		    costs[p.idx] = p.value;
		    for (Map.Entry<Integer, Integer> entry : graph.get(p.idx).entrySet()) {
		        queue.add(new Path(entry.getKey(), entry.getValue() + p.value));
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    sb.append(costs[a] + costs[b]).append("\n");
		}
		System.out.print(sb);
   }
    
    
    static class Path implements Comparable<Path> {
        int idx;
        long value;
        
        public Path (int idx, long value) {
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
    }
}

