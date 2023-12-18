import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			points[i] = new Point(i, sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(points, new Comparator<Point>() {
		public int compare(Point p1, Point p2) {
			return p1.x - p2.x;
		}
		});
		ArrayList<Road> list = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			list.add(new Road(points[i - 1].idx, points[i].idx, points[i].x - points[i - 1].x));
		}
		Arrays.sort(points, new Comparator<Point>() {
		public int compare(Point p1, Point p2) {
			return p1.y - p2.y;
		}
		});
		for (int i = 1; i < n; i++) {
			list.add(new Road(points[i - 1].idx, points[i].idx, points[i].y - points[i - 1].y));
		}
		Collections.sort(list, new Comparator<Road>() {
		public int compare(Road r1, Road r2) {
			return r1.cost - r2.cost;
		}
		});
		UnionFindTree uft = new UnionFindTree(n);
		long total = 0;
		for (Road r : list) {
			if (uft.same(r.from, r.to)) {
				continue;
			}
			uft.unite(r.from, r.to);
			total += r.cost;
		}
		System.out.println(total);
	}
	
	static class UnionFindTree {
		int[] parents;
		
		public UnionFindTree(int size) {
			parents = new int[size];
			for (int i = 0; i < size; i++) {
				parents[i] = i;
			}
		}
		
		public int find(int x) {
			if (parents[x] == x) {
				return x;
			}
			int ans = find(parents[x]);
			parents[x] = ans;
			return ans;
		}
		
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		public void unite(int x, int y) {
			int xx = find(x);
			int yy = find(y);
			if (xx == yy) {
				return;
			}
			parents[xx] = yy;
		}
	}
	
	static class Road {
		int from;
		int to;
		int cost;
		public Road(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	
	static class Point {
		int idx;
		int x;
		int y;
		
		public Point(int idx, int x, int y) {
			this.idx = idx;
			this.x = x;
			this.y = y;
		}
	}
}
