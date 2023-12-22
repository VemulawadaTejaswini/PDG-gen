import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		int cheap = sc.nextInt();
		int expensive = sc.nextInt();
		PriorityQueue<Path> queue = new PriorityQueue<>();
		boolean[] isOut = new boolean[n];
		for (int i = 0; i < k; i++) {
		    int x = sc.nextInt() - 1;
		    queue.add(new Path(x, 0));
		    isOut[x] = true;
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    graph.get(a).add(b);
		    graph.get(b).add(a);
		}
		boolean[] dangerous = new boolean[n];
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (dangerous[p.idx]) {
		        continue;
		    }
		    dangerous[p.idx] = true;
		    if (p.value >= s) {
		        continue;
		    }
		    for (int x : graph.get(p.idx)) {
		        if (!dangerous[x]) {
		            queue.add(new Path(x, p.value + 1));
		        }
		    }
		}
		long[] costs = new long[n];
		Arrays.fill(costs, Long.MAX_VALUE);
		queue.add(new Path(0, 0));
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (costs[p.idx] <= p.value || isOut[p.idx]) {
		        continue;
		    }
		    costs[p.idx] = p.value;
		    for (int x : graph.get(p.idx)) {
		        if (isOut[x] || costs[x] != Long.MAX_VALUE) {
		            continue;
		        }
		        long next = p.value;
		        if (dangerous[p.idx]) {
		            next += expensive;
		        } else {
		            next += cheap;
		        }
		        queue.add(new Path(x, next));
		    }
		}
		long ans = costs[n - 1];
		if (dangerous[0]) {
		    ans -= expensive;
		} else {
		    ans -= cheap;
		}
		System.out.println(ans);
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

