import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Route>> graph = new ArrayList<>();
		ArrayList<HashMap<Integer, Integer>> costs = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
		    graph.add(new ArrayList<>());
		    costs.add(new HashMap<>());
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    graph.get(a).add(new Route(b, c));
		    graph.get(b).add(new Route(a, c));
		}
		PriorityQueue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(1, 0, 0));
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (costs.get(p.idx).containsKey(p.company)) {
		        continue;
		    }
		    costs.get(p.idx).put(p.company, p.value);
		    for (Route r : graph.get(p.idx)) {
		        int next = p.value;
		        if (r.company != p.company) {
		            next++;
		        }
		        if (!costs.get(r.idx).containsKey(r.company)) {
		            queue.add(new Path(r.idx, next, r.company));
		        }
		    }
		}
		if (costs.get(n).size() == 0) {
		    System.out.println(-1);
		} else {
		    int min = Integer.MAX_VALUE;
		    for (int x : costs.get(n).values()) {
		        min = Math.min(min, x);
		    }
		    System.out.println(min);
		}
    }
    
    static class Path implements Comparable<Path> {
        int idx;
        int value;
        int company;
        
        public Path(int idx, int value, int company) {
            this.idx = idx;
            this.value = value;
            this.company = company;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
    
    static class Route {
        int idx;
        int company;
        
        public Route(int idx, int company) {
            this.idx = idx;
            this.company = company;
        }
    }
}

