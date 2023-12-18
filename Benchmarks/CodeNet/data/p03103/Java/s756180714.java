import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    SortedSet<Shop> shops = new TreeSet<>();
    for (int i = 0; i < n; i++) {
      int value = sc.nextInt();
      int limit = sc.nextInt();
      shops.add(new Shop(value, limit));
    }
    long cost = 0;
    for (Shop shop : shops) {
      if (m == 0) break;
      if (m >= shop.limit) {
        cost += shop.value * shop.limit;
        m -= shop.limit;
      } else {
        cost += shop.value * m;
        m = 0;
      }
    }
    System.out.println(cost);
  }

  static class Shop implements Comparable<Shop> {
    private long value;
    private long limit;

    public Shop(int value, int limit) {
      this.value = value;
      this.limit = limit;
    }

    @Override
    public int compareTo(Shop shop) {
      return (int) (this.value - shop.value);
    }
  }
}