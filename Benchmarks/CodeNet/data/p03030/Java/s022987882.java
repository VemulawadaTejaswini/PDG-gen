import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        List<Restaurant> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Restaurant(sc.next(), Integer.parseInt(sc.next())));
        }

        List<Restaurant> listInOrder = list.stream()
                                           .sorted(Comparator.comparing(Restaurant::getCity).reversed()
                                                             .thenComparing(Restaurant::getPoint).reversed())
                                           .collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (listInOrder.get(i).equals(list.get(j))) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}

public class Restaurant {
    private String city;
    private int point;

    public Restaurant(String city, int point) {
        this.city = city;
        this.point = point;
    }

    public String getCity() {
        return this.city;
    }

    public int getPoint() {
        return this.point;
    }

}
