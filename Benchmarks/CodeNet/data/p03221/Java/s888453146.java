import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static class City {
        public int prefecture;
        public int year;
        public int id = 0;

        public City(int prefecture, int year) {
            this.prefecture = prefecture;
            this.year = year;
        }

        public String getIdString() {
            return String.format("%06d%06d", prefecture, id);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<City> cityList = IntStream.range(scanner.nextInt() * 0, scanner.nextInt())
                .mapToObj(i -> new City(scanner.nextInt(), scanner.nextInt()))
                .collect(Collectors.toList());

        List<City> cityListCopy = new ArrayList<>(cityList);
        cityListCopy.sort(Comparator.comparingInt((City city) -> city.prefecture).thenComparingInt(city -> city.year));
        int i = 1, prefecture = 0;
        for (City city : cityListCopy) {
            city.id = prefecture == city.prefecture ? ++i : (i = 1);
            prefecture = city.prefecture;
        }

        cityList.forEach(city -> System.out.println(city.getIdString()));
    }
}