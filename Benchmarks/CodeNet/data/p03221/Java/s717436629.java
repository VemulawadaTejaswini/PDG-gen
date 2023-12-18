import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        City[] cities = new City[m];
        for (int i = 0; i < m; i++) {
            cities[i] = new City(in.nextInt(), in.nextInt());
        }

        City[] citiesClone = cities.clone();
        Arrays.sort(citiesClone, (x, y) -> Integer.compare(x.prefecture, y.prefecture));
        Arrays.sort(citiesClone, (x, y) -> Integer.compare(x.year, y.year));

        Map<Integer, Integer> yearToNum = new HashMap<>();
        int cityNum = 1;
        int prev = 0;
        for (int i = 0; i < m; i++) {
            int currPref = citiesClone[i].prefecture;
            if (currPref == prev) {
                cityNum++;
            }
            else {
                cityNum = 1;
            }
            yearToNum.put(citiesClone[i].year, cityNum);
            prev = currPref;
        }

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < m; i++) {
            out.append(toID(Integer.toString(cities[i].prefecture)));
            out.append(toID(Integer.toString(yearToNum.get(cities[i].year))));
            out.append("\n");
        }

        System.out.println(out);
    }

    private static String toID(String s) {
        while (s.length() < 6) {
            s = "0" + s;
        }
        return s;
    }

    private static class City {
        private int prefecture;
        private int year;

        public City(int prefecture, int year) {
            this.prefecture = prefecture;
            this.year = year;
        }
    }

}
