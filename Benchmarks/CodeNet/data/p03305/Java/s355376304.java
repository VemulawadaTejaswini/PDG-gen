import java.util.*;

public class Main {
    private static final long INF = 1145143643641919810L;
    private static final long INIT = 1000000000000000L;

    private class City {
        long cost = INF;
        boolean fix = false;
        List<Road> roads = new ArrayList<>();
    }

    private class Road {
        int src, dst, cost;

        public Road(int src, int dst, int cost) {
            this.src = src;
            this.dst = dst;
            this.cost = cost;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        City city[] = new City[n];
        City scity[] = new City[n];
        for (int i = 0; i < n; i++) {
            city[i] = new City();
            scity[i] = new City();
        }

        int u, v, a, b;
        for (int i = 0; i < m; i++) {
            u = sc.nextInt() - 1;
            v = sc.nextInt() - 1;
            a = sc.nextInt();
            b = sc.nextInt();
            city[u].roads.add(new Road(u, v, a));
            city[v].roads.add(new Road(v, u, a));
            scity[u].roads.add(new Road(u, v, b));
            scity[v].roads.add(new Road(v, u, b));
        }

        dij(s - 1, n, city);
        dij(t - 1, n, scity);

        long ans[] = new long[n];
        Arrays.fill(ans, INIT + 1);
        ans[n - 1] = city[n - 1].cost + scity[n - 1].cost;
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.min(ans[i + 1], city[i].cost + scity[i].cost);
        }

        for (int y = 0; y < n; y++) {
            System.out.println(INIT - ans[y]);
        }
    }

    private void dij(int start, int n, City city[]) {
        Queue<City> queue = new PriorityQueue<>((o1, o2) -> Long.compare(o1.cost, o2.cost));

        city[start].cost = 0;
        queue.add(city[start]);
        while (!queue.isEmpty()) {
            City c = queue.poll();
            if (c.fix) {
                continue;
            }

            c.fix = true;
            for (Iterator<Road> ite = c.roads.iterator(); ite.hasNext();) {
                Road r = ite.next();
                if (city[r.dst].fix) {
                    ite.remove();
                    continue;
                }

                city[r.dst].cost = Math.min(c.cost + r.cost, city[r.dst].cost);
                queue.add(city[r.dst]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
