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
		PriorityQueue<Road> queue = new PriorityQueue<>();
		for (int i = 1; i < n; i++) {
		    queue.add(new Road(cities[i].x - cities[i - 1].x, cities[i], cities[i - 1]));
		}
		Arrays.sort(cities, new Comparator<City>() {
		    public int compare(City c1, City c2) {
		        return c1.y - c2.y;
		    }
		});
		for (int i = 1; i < n; i++) {
		    queue.add(new Road(cities[i].y - cities[i - 1].y, cities[i], cities[i - 1]));
		}
		UnionFindTree uft = new UnionFindTree(n);
		long total = 0;
		while (queue.size() > 0) {
		    Road r = queue.poll();
		    if (!uft.same(r.from.id, r.to.id)) {
		        uft.unite(r.from.id, r.to.id);
		        total += r.cost;
		    }
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
           } else {
               return parents[x] = find(parents[x]);
           }
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
   
   static class Road implements Comparable<Road> {
       int cost;
       City from;
       City to;
       
       public Road (int cost, City from, City to) {
           this.cost = cost;
           this.from = from;
           this.to = to;
       }
       
       public int compareTo(Road another) {
           return cost - another.cost;
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
}


