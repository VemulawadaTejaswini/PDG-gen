import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < n; i++) {
		    int from = sc.nextInt() - 1;
		    int count = sc.nextInt();
		    for (int j = 0; j < count; j++) {
		        graph.get(from).add(sc.nextInt() - 1);
		    }
		}
		int[] costs = new int[n];
		Arrays.fill(costs, Integer.MAX_VALUE);
		PriorityQueue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(0, 0));
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
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    sb.append(i + 1).append(" ");
		    if (costs[i] == Integer.MAX_VALUE) {
		        sb.append(-1);
		    } else {
		        sb.append(costs[i]);
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

