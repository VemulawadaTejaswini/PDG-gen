
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int n;

    private static Queue<City> queue = new PriorityQueue<City>();

    private static List<City> cityList = new ArrayList<City>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        int s = Integer.parseInt(scan.next());

        List<List<Load>> loadList = new ArrayList<List<Load>>();
        for (int i = 0; i < n; i++) {
            loadList.add(new ArrayList<Load>());
        }

        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(scan.next());
            int v = Integer.parseInt(scan.next());
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            u--;
            v--;
            loadList.get(u).add(new Load(u, v, a, b));
            loadList.get(v).add(new Load(v, u, a, b));
        }

        int[] c = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(scan.next());
            d[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (n - 1) * 50; j++) {
                cityList.add(new City(i, j, Long.MAX_VALUE));
            }
        }

        if (s > (n - 1) * 50) {
            s = (n - 1) * 50;
        }
        addCity(getCity(0, s), 0);
        while (!queue.isEmpty()) {
            City city = queue.poll();
            // 移動
            for (Load load : loadList.get(city.id)) {
                if (city.money >= load.a) {
                    addCity(getCity(load.to, city.money - load.a), city.time + load.b);
                }
            }
            // 両替
            if (city.money + c[city.id] <= (n - 1) * 50) {
                addCity(getCity(city.id, city.money + c[city.id]), city.time + d[city.id]);
            }
        }

        for (int i = 1; i < n; i++) {
            long ans = Long.MAX_VALUE;
            for (int j = 0; j <= (n - 1) * 50; j++) {
                City city = getCity(i, j);
                if (ans > city.time) {
                    ans = city.time;
                }
            }
            System.out.println(ans);
        }
    }

    private static City getCity(int id, int money) {
        return cityList.get(((n - 1) * 50 + 1) * id + money);
    }

    private static void addCity(City city, long time) {
        if (city.time <= time) {
            return;
        }
        city.time = time;
        queue.add(city);
    }

}

class Load {
    int from;
    int to;
    int a;
    int b;

    public Load(int from, int to, int a, int b) {
        this.from = from;
        this.to = to;
        this.a = a;
        this.b = b;
    }

}

class City implements Comparable<City> {
    int id;
    int money;
    long time;

    public City(int id, int money, long time) {
        this.id = id;
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(City other) {
        if (time > other.time) {
            return 1;
        } else if (time == other.time) {
            return 0;
        } else {
            return -1;
        }
    }

}
