import java.util.Scanner;
import java.util.Arrays;

public class Main {

  static class Restaurant implements Comparable<Restaurant> {
    public int id;
    public String city;
    public int rating;

    public Restaurant(int id, String city, int rating) {
      this.id = id;
      this.city = city;
      this.rating = rating;
    }

    @Override
    public int compareTo(Restaurant r) {
      if (city.equals(r.city)) {
        if (rating == r.rating)
          return 0;
        else if (rating < r.rating)
          return 1;
        else (rating > r.rating)
          return -1;
      }
      return city.compareTo(r.city);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Restaurant[] rs = new Restaurant[n];

    for (int i = 0; i < n; ++i) {
      String s = sc.next();
      int p = sc.nextInt();
      rs[i] = new Restaurant(i + 1, s, p);
    }

    Arrays.sort(rs);

    for (Restaurant r : rs)
      System.out.println(r.id);
  }
}
