import java.util.*;

public class Main {
    static ArrayList<Route>[] graph;
    static HashMap<Integer, Integer>[] arrivals;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList[n + 1];
        arrivals = new HashMap[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<Route>();
            arrivals[i] = new HashMap<Integer, Integer>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a].add(new Route(b, c));
            graph[b].add(new Route(a, c));
        }
        
        search(new Route(1, 0), 0);
        HashMap<Integer, Integer> map = arrivals[n];
        if (map.size() == 0) {
            System.out.println(-1);
            return;
        }
        int min = Integer.MAX_VALUE;
        for (int x : map.values()) {
            min = Math.min(min, x);
        }
       System.out.println(min);
    }
    
    static void search(Route r, int cost) {
        HashMap<Integer, Integer> map = arrivals[r.to];
        if (map.containsKey(r.company)) {
            if (cost >= map.get(r.company)) {
                return;
            }
        }
        map.put(r.company, cost);
        for (Route next : graph[r.to]) {
            if (next.company == r.company) {
                search(next, cost);
            } else {
                search(next, cost + 1);
            }
        }
    }
    
    static class Route {
        int to;
        int company;
        public Route (int to, int company) {
            this.to = to;
            this.company = company;
        }
    }
}
