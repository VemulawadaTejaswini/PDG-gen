import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		City[] cities = new City[n];
		for (int i = 0; i < n; i++) {
			cities[i] = new City(i, sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(cities, new Comparator<City>() {
		public int compare(City c1, City c2) {
			return c1.x - c2.x;
        }
		});
		Road[] roads = new Road[(n - 1) * 2];
		for (int i = 0; i < n - 1; i++) {
			roads[i] = new Road(cities[i].id, cities[i + 1].id, cities[i + 1].x - cities[i].x);
		}
		Arrays.sort(cities, new Comparator<City>() {
		public int compare(City c1, City c2) {
			return c1.y - c2.y;
        }
		});
		for (int i = 0; i < n - 1; i++) {
			roads[n - 1 + i] = new Road(cities[i].id, cities[i + 1].id, cities[i + 1].y - cities[i].y);
		}
		Arrays.sort(roads, new Comparator<Road>() {
		public int compare(Road r1, Road r2) {
			return r1.cost - r2.cost;
        }
		});
		Tree t = new Tree(n);
		long sum = 0;
		for (Road r : roads) {
			if (t.find(r.src) != t.find(r.dst)) {
				sum += r.cost;
				t.unite(r.src, r.dst);
			}
		}
		System.out.println(sum);
	}
	
	static class Tree {
		int size;
		int[] parent;
		int[] rank;
		
		public Tree(int size) {
			this.size = size;
			parent = new int[size];
			rank = new int[size];
			for (int i = 0; i < size; i++) {
				parent[i] = i;
				rank[i] = 0;
			}
		}
		
		public int find(int idx) {
			if (parent[idx] == idx) {
				return idx;
			} else {
				parent[idx] = find(parent[idx]);
				return parent[idx];
			}
		}
		
		public void unite(int idx1, int idx2) {
			int p1 = find(idx1);
			int p2 = find(idx2);
			if (p1 == p2) {
				return;
			}
			if (rank[p1] < rank[p2]) {
				parent[p1] = p2;
			} else {
				parent[p2] = p1;
				if (rank[p1] == rank[p2]) {
					rank[p1]++;
				}
			}
		}
	}
			
	
	static class City {
		int id;
		int x;
		int y;
		
		public City(int id, int x, int y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}
	}
	
	static class Road {
		int src;
		int dst;
		int cost;
		
		public Road(int src, int dst, int cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}
	}
}
