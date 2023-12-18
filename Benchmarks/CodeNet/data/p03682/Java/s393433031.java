import java.util.*;

public class Main {
    public static void main(String[] args) {
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
        PriorityQueue<Path> queue = new PriorityQueue<>();
        for (int i = 1; i < n; i++) {
            queue.add(new Path(cities[i].idx, cities[i - 1].idx, cities[i].x - cities[i - 1].x));
        }
        Arrays.sort(cities, new Comparator<City>() {
            public int compare(City c1, City c2) {
                return c1.y - c2.y;
            }
        });
        for (int i = 1; i < n; i++) {
            queue.add(new Path(cities[i].idx, cities[i - 1].idx, cities[i].y - cities[i - 1].y));
        }
        long total = 0;
        UnionFindTree uft = new UnionFindTree(n);
        while (queue.size() > 0) {
            Path p = queue.poll();
            if (uft.same(p)) {
                continue;
            }
            total += p.cost;
            uft.unite(p);
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
        
        public boolean same (int x, int y) {
            return find(x) == find(y);
        }
        
        public boolean same (Path p) {
            return same(p.from, p.to);
        }
        
        public void unite(int x, int y) {
            int xx = find(x);
            int yy = find(y);
            if (xx == yy) {
                return;
            }
            parents[xx] = yy;
        }
        
        public void unite(Path p) {
            unite(p.from, p.to);
        }
    }
    
    static class Path implements Comparable<Path> {
        int from;
        int to;
        int cost;
        
        public Path (int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
        
        public int compareTo(Path another) {
            return cost - another.cost;
        }
    }
    
    static class City {
        int idx;
        int x;
        int y;
        
        public City(int idx, int x, int y) {
            this.idx = idx;
            this.x = x;
            this.y = y;
        }
    }
}