import java.util.*;

public class Main {
    private class City {
        int id;
        long x, y;

        public City(int id, long x, long y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }

    private class Road {
        int src, dst;
        long cost;

        public Road(int src, int dst, long cost) {
            this.src = src;
            this.dst = dst;
            this.cost = cost;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        City city[] = new City[n];
        int data[] = new int[n];
        for (int i = 0; i < n; i++) {
            city[i] = new City(i, sc.nextLong(), sc.nextLong());
            data[i] = i;
        }

        Queue<Road> queue = new PriorityQueue<>((o1, o2) -> Long.compare(o1.cost, o2.cost));
        Arrays.sort(city, (o1, o2) -> Long.compare(o1.x, o2.x));
        for (int i = 0; i < n - 1; i++) {
            queue.add(new Road(city[i].id, city[i + 1].id, city[i + 1].x - city[i].x));
        }
        Arrays.sort(city, (o1, o2) -> Long.compare(o1.y, o2.y));
        for (int i = 0; i < n - 1; i++) {
            queue.add(new Road(city[i].id, city[i + 1].id, city[i + 1].y - city[i].y));
        }

        long sum = 0;
        while (!queue.isEmpty()) {
            Road r = queue.poll();
            int src = r.src;
            int dst = r.dst;
            if (isSame(src, dst, data)) {
                continue;
            }

            link(src, dst, data);
            sum += r.cost;
        }

        System.out.println(sum);
    }

    public void link(int x, int y, int data[]) {
        data[root(x, data)] = root(y, data);
    }

    public boolean isSame(int x, int y, int data[]) {
        return root(x, data) == root(y, data);
    }

    public int root(int p, int data[]) {
        return (data[p] == p) ? p : (data[p] = root(data[p], data));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
