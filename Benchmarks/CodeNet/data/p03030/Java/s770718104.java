import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Restaurant {
    String city;
    int point;
    int i;
    public Restaurant(String city, int point, int i) {
        this.city = city;
        this.point = point;
        this.i = i;
    }
}
class RestaurantComparator implements Comparator<Restaurant>{
    @Override
    public int compare(Restaurant o1, Restaurant o2) {
        if(o1.city.compareTo(o2.city) < 0 ) {
            return -1;
        } else if(o1.city.compareTo(o2.city) > 0) {
            return 1;
        } else {
            return Integer.compare(o2.point, o1.point);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Restaurant> list = new ArrayList<Restaurant>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String city = sc.next();
            int point = sc.nextInt();
            list.add(new Restaurant(city, point, i));
        }
        Collections.sort(list, new RestaurantComparator());
        for (Restaurant restaulant: list) {
            System.out.println(restaulant.i);
        }
    }
}