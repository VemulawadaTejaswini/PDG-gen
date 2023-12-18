import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<Restaurant> restaurants = new ArrayList<>();
    for (int i = 0; i < n ; i++) {
      Restaurant restaurant = new Restaurant(i+1, sc.next(),sc.nextInt());
      restaurants.add(restaurant);
    }

    restaurants.sort(Comparator.comparing(Restaurant::getScore).reversed());
    restaurants.sort(Comparator.comparing(Restaurant::getCity));

    restaurants.forEach(r -> System.out.println(r.id));

  }


  static class Restaurant {
    int id;
    String city;
    int score;

    public Restaurant (int id, String city, int score) {
      this.id = id;
      this.city = city;
      this.score = score;
    }

    public String getCity() {
      return city;
    }

    public int getScore() {
      return score;
    }

  }
}
