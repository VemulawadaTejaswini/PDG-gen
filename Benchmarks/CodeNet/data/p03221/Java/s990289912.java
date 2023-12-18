import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        scanner.nextInt();
        int m = scanner.nextInt();
        List<City> cities = new ArrayList<>();
        for (int i = 0; i < m; i++)
            cities.add(new City(scanner.nextInt(), scanner.nextInt()));
        cities.stream()
                .collect(Collectors.groupingBy(city -> city.p, HashMap::new, Collectors.toCollection(() -> new TreeSet<>(Comparator.comparingInt(city -> city.y)))))
                .values()
                .forEach(cityList -> {
                    int i = 0;
                    for (City city : cityList)
                        city.o = ++i;
                });
        for (City city : cities)
            System.out.println(String.format("%06d%06d", city.p, city.o));
    }

    static class City {
        int p, y, o;

        City(int p, int y) {
            this.p = p;
            this.y = y;
        }
    }
}