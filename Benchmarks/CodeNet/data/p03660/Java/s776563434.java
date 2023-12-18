import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    graph.get(a).add(b);
		    graph.get(b).add(a);
		}
		PriorityQueue<Path> queue = new PriorityQueue<>();
		int[] costs = new int[n];
		Arrays.fill(costs, Integer.MAX_VALUE);
		queue.add(new Path(0, 0));
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (costs[p.idx] <= p.value) {
		        continue;
		    }
		    costs[p.idx] = p.value;
		    for (int x : graph.get(p.idx)) {
		        if (costs[x] == Integer.MAX_VALUE) {
		            queue.add(new Path(x, p.value + 1));
		        }
		    }
		}
		int[] routes = new int[n];
		int idx = n - 1;
		int value = costs[n - 1];
		while (value >= 0) {
		    routes[idx] = value + 1;
		    for (int x : graph.get(idx)) {
		        if (costs[x] == value - 1) {
		            idx = x;
		            break;
		        }
		    }
		    value--;
		}
		int max = (routes[n - 1] + 1) / 2;
		value = 0;
		ArrayDeque<Path> deq = new ArrayDeque<>();
		deq.add(new Path(0, Integer.MIN_VALUE));
		while (deq.size() > 0) {
		    Path p = deq.poll();
		    if (routes[p.idx] <= n && routes[p.idx] > value) {
		        value = routes[p.idx];
		    } else if (routes[p.idx] != 0) {
		        continue;
		    } else {
		        routes[p.idx] = p.value;
		    }
		    int next;
		    if (routes[p.idx] <= max) {
		        next = Integer.MIN_VALUE;
		    } else {
		        next = Integer.MAX_VALUE;
		    }
		    for (int x : graph.get(p.idx)) {
		        deq.add(new Path(x, next));
		    }
		}
		int fCount = 0;
		int sCount = 0;
		for (int x : routes) {
		    if (x <= max) {
		        fCount++;
		    } else {
		        sCount++;
		    }
		}
		if (fCount > sCount) {
		    System.out.println("Fennec");
		} else {
		    System.out.println("Snuke");
		}
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

