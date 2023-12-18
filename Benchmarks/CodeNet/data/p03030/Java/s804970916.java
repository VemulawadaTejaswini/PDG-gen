import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Restaurant> restaurants = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            restaurants.add(new Restaurant(i, sc.next(), sc.nextInt()));
        }
        Comparator<Restaurant> restaurantComparator =
                Comparator.comparing(Restaurant::getCity)
                        .thenComparing(Restaurant::getPoint, Comparator.reverseOrder());

        restaurants.sort(restaurantComparator);

        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.index);
        }
    }

    class Restaurant {
        int index;
        String city;
        int point;

        String getCity() {
            return city;
        }

        int getPoint() {
            return point;
        }

        Restaurant(int index, String city, int point) {
            this.index = index;
            this.city = city;
            this.point = point;
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}