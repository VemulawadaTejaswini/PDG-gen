import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int N = sc.nextInt(), M = sc.nextInt();
        City[] cities = new City[M];
        for (int i = 0; i < M; i++) {
            cities[i] = (new City(i, sc.nextInt(), sc.nextInt()));
        }
        Arrays.sort(cities, Comparator.comparingInt(city -> city.year));
        String[] ans = new String[M];
        int[] count = new int[N + 1];
        for (int i = 0; i < M; i++) {
            count[cities[i].pref]++;
            ans[cities[i].order] = String.format("%06d", cities[i].pref) + String.format("%06d", count[cities[i].pref]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(ans[i]).append("\n");
        }
        System.out.print(sb);
    }

    class City {

        int order, pref, year;

        public City(int order, int pref, int year) {
            this.order = order;
            this.pref = pref;
            this.year = year;
        }
    }
}