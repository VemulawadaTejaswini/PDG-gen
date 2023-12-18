import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        City[] all = new City[M];
        ArrayList<ArrayList<City>> cities = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            cities.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int P = sc.nextInt();
            int Y = sc.nextInt();
            all[i] = new City(Y, P);
            cities.get(P).add(all[i]);
        }
        for (int i = 0; i <= N; i++) {
            Collections.sort(cities.get(i));
            for (int j = 0; j < cities.get(i).size(); j++) {
                cities.get(i).get(j).order = j + 1;
            }
        }
        for (City c : all) {
            System.out.printf("%06d%06d\n", c.pref, c.order);
        }
    }

    static class City implements Comparable<City> {
        int year;
        int pref;
        int order;

        public City(int year, int pref) {
            this.year = year;
            this.pref = pref;
        }

        @Override
        public int compareTo(City o) {
            return Integer.compare(this.year, o.year);
        }
    }
}
