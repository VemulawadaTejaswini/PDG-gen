import java.util.*;

public class Main {
	static ArrayList<Route>[] lists;
	static HashSet<Pair> all;
	static HashSet<Pair> exist;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		lists = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			lists[i] = new ArrayList<Route>();
		}
		all = new HashSet<Pair>();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			lists[a - 1].add(new Route(b - 1, c));
			lists[b - 1].add(new Route(a - 1, c));
			all.add(new Pair(a, b));
		}
		Minimum[] master = new Minimum[n];
		for (int i = 0; i < n; i++) {
			master[i] = new Minimum(Integer.MAX_VALUE);
		}
		exist = new HashSet<Pair>();
		for (int i = 0; i < n; i++) {
			Minimum[] ans = (Minimum[])(master.clone());
			check(i, 0, new HashSet<Pair>(), ans);
			for (Minimum min : ans) {
				if (min.set != null) {
					exist.addAll(min.set);
				}
			}
		}
		System.out.println(all.size() - exist.size());
	}
	
	static void check(int dest, int cost, HashSet<Pair> set, Minimum[] arr) {
		if (arr[dest].cost < cost) {
			return;
		}
		arr[dest].cost = cost;
		arr[dest].set = set;
		for (Route r : lists[dest]) {
			HashSet<Pair> tmp = (HashSet<Pair>)set.clone();
			tmp.add(new Pair(dest, r.dest));
			check(r.dest, cost + r.cost, tmp, arr);
		}
	}
	
	static class Minimum {
		int cost;
		HashSet<Pair> set;
		
		public Minimum(int cost, HashSet<Pair> set) {
			this.cost = cost;
			this.set = set;
		}
		
		public Minimum(int cost) {
			this(cost, null);
		}
	}
	
	static class Pair {
		int a;
		int b;
		public Pair(int x, int y) {
			a = Math.min(x, y);
			b = Math.max(x, y);
		}
		
		public int hashCode() {
			return a * 100 + b;
		}
		
		public boolean equals(Object o) {
			Pair p = (Pair) o;
			return p.a == a && p.b == b;
		}
	}
	
	static class Route {
		int dest;
		int cost;
		public Route (int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
		}
	}
}
