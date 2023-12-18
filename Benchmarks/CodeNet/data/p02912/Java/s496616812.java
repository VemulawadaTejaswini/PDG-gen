import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  private static void solve(int n, int m, long[] a) {
    PriorityQueue<Long> pq = new PriorityQueue<>(n, new Comparator<Long>() {
      @Override
      public int compare(Long o1, Long o2) {
        return o2.compareTo(o1);
      }
    });
    for (long val : a) pq.add(val);
    for (int i = 0; i < m; i++) {
      long price = pq.poll();
      pq.add(price / 2L);
    }
    long sum = 0L;
    Iterator<Long> it = pq.iterator();
    while (it.hasNext()) sum += it.next();
    System.out.println(sum);
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
