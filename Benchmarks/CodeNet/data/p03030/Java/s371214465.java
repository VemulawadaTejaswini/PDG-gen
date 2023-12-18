import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Restaurant[] restaurants = new Restaurant[N];
    for (int i = 0; i < N; i++) {
      restaurants[i] = new Restaurant(i + 1, scanner.next(), scanner.nextInt());
    }
    Arrays.sort(restaurants, (r1, r2) -> {
      if (!r1.s.equals(r2.s)) return r1.s.compareTo(r2.s);
      return r2.p - r1.p;
    });
    for (int i = 0; i < N; i++) {
      System.out.println(restaurants[i].id);
    }
  }

  private static class Restaurant {
    private final int id;
    private final String s;
    private final int p;

    private Restaurant(int id, String s, int p) {
      this.id = id;
      this.s = s;
      this.p = p;
    }
  }
}
