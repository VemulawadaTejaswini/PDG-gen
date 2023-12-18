import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    SortedSet<Shop> shops = new TreeSet<>();
    for (int i = 0; i < n; i++) {
      long value = sc.nextLong();
      long limit = sc.nextLong();
      shops.add(new Shop(value, limit));
    }
    long cost = 0;
    for (Shop shop : shops) {
      if (m == 0) break;
      if (m >= shop.limit) {
        cost += shop.cost * shop.limit;
        m -= shop.limit;
      } else {
        cost += shop.cost * m;
        m = 0;
      }
    }
    System.out.println(cost);
  }

  static class Shop implements Comparable<Shop> {
    private long cost;
    private long limit;

    public Shop(long cost, long limit) {
      this.cost = cost;
      this.limit = limit;
    }

    @Override
    public int compareTo(Shop shop) {
      if (this.cost == shop.cost) {
        return 1;
      } else {
        return (int) (this.cost - shop.cost);
      }
    }
  }
}