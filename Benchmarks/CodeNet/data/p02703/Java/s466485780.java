
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static Queue<City> queue = new PriorityQueue<City>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        int s = Integer.parseInt(scan.next());
        // 最大銀貨数
        int maxMoney = 50 * m;
        if (s > maxMoney) {
            s = maxMoney;
        }

        // 都市作成,第一引数=都市名、第二引数=所持金
        List<List<City>> cityList = new ArrayList<List<City>>();
        for (int i = 0; i < n; i++) {
            List<City> list = new ArrayList<City>();
            for (int j = 0; j <= maxMoney; j++) {
                list.add(new City(i, j, Long.MAX_VALUE));
            }
            cityList.add(list);
        }

        List<List<Road>> roadList = new ArrayList<List<Road>>();
        for (int i = 0; i < n; i++) {
            roadList.add(new ArrayList<Road>());
        }
        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(scan.next());
            int v = Integer.parseInt(scan.next());
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            u--;
            v--;
            roadList.get(u).add(new Road(u, v, a, b));
            roadList.get(v).add(new Road(v, u, a, b));
        }

        int[] c = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(scan.next());
            d[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        addCity(cityList.get(0).get(s), 0);
        while (!queue.isEmpty()) {
            City curCity = queue.poll();
            // 移動
            for (Road road : roadList.get(curCity.id)) {
                if (curCity.money >= road.money) {
                    addCity(cityList.get(road.to).get(curCity.money - road.money), curCity.time + road.time);
                }
            }
            // 両替
            int afterExchangedMoney = curCity.money + c[curCity.id];
            afterExchangedMoney = Math.min(afterExchangedMoney, maxMoney);
            addCity(cityList.get(curCity.id).get(afterExchangedMoney), curCity.time + d[curCity.id]);
        }

        for (int i = 1; i < n; i++) {
            long ans = Long.MAX_VALUE;
            for (City city : cityList.get(i)) {
                ans = Math.min(ans, city.time);
            }
            System.out.println(ans);
        }
    }

    private static void addCity(City city, long time) {
        if (city.time > time) {
            city.time = time;
            queue.add(city);
        }
    }

    static class City implements Comparable<City> {
        int id;
        int money;
        long time;

        public City(int id, int money, long time) {
            this.id = id;
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(City o) {
            if (time < o.time) {
                return -1;
            } else if (time > o.time) {
                return 1;
            } else {
                return id - o.id;
            }
        }
    }

    static class Road {
        int from;
        int to;
        int money;
        int time;

        public Road(int from, int to, int money, int time) {
            this.from = from;
            this.to = to;
            this.money = money;
            this.time = time;
        }
    }
}
