import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    Bottle[] bottles = new Bottle[N];
    for (int i = 0; i < N; i++) bottles[i] = new Bottle(scanner.nextInt(), scanner.nextInt());
    Arrays.sort(bottles, Comparator.comparingInt(bottle -> bottle.price));

    long left = -1;
    long right = 100_000_000_000_000L;
    while (right - left > 1) {
      long mid = (left + right) / 2;
      long k = mid;
      int n = 0;
      for (int i = 0; i < N; i++) {
        if ((long) bottles[i].price * bottles[i].cap < k) {
          n += bottles[i].cap;
          k -= (long) bottles[i].price * bottles[i].cap;
        } else {
          n += k / bottles[i].price;
          break;
        }
      }
      if (n >= M) {
        right = mid;
      } else {
        left = mid;
      }
    }
    System.out.println(right);
  }

  private static class Bottle {
    private final int price;
    private final int cap;

    private Bottle(int price, int cap) {
      this.price = price;
      this.cap = cap;
    }
  }
}
