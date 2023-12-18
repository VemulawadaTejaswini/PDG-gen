import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int[] c = new int[scanner.nextInt()];
        int m = scanner.nextInt();
        City[] cities = new City[m];
        for (int i = 0; i < m; i++)
            cities[i] = new City(scanner.nextInt(), scanner.nextInt(), i);
        Arrays.stream(cities)
                .collect(Collectors.groupingBy(city -> city.p))
                .values().forEach(cityList -> cityList.stream()
                        .sorted(Comparator.comparingInt(city -> city.y))
                        .forEach(city -> city.o = ++c[city.p - 1]));
        for (City city : cities)
            System.out.println(String.format("%06d%06d", city.p, city.o));
    }

    static class City {
        int p, y, o = 1, i;

        City(int p, int y, int i) {
            this.p = p;
            this.y = y;
            this.i = i;
        }
    }
}