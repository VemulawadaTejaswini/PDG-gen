import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  private static void solve(int n, int m, long[] a) {
    Map<Integer, Long> current = new HashMap<>();
    Map<Integer, Long> next = new HashMap<>();
    current.put(0, 0L);
    for (int i = 0; i < n; i++) {
      next.clear();
      for (int usedTickets : current.keySet()) {
        long price = current.get(usedTickets);
        next.merge(usedTickets, price + a[i], Math::min);
        int newTickets = 1;
        while (usedTickets + newTickets <= m) {
          long newPrice = a[i] / (long) Math.pow(2.0, newTickets);
          next.merge(usedTickets + newTickets, price + newPrice, Math::min);
          if (newPrice == 0) break;
          newTickets++;
        }
      }
      current.clear();
      current.putAll(next);
    }
    long min = Long.MAX_VALUE;
    for (Long val : current.values()) min = Math.min(min, val);
    System.out.println(min);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nums = sc.nextLine().split(" ");
    int n = Integer.parseInt(nums[0]);
    int m = Integer.parseInt(nums[1]);
    long[] a = new long[n];
    String[] as = sc.nextLine().split(" ");
    for (int i = 0; i < n; i++) a[i] = Integer.parseInt(as[i]);
    sc.close();
    solve(n, m, a);
  }
}
