import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    PriorityQueue pq = new PriorityQueue<Long>(Collections.reverseOrder());
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      pq.add(a);
    }
    for(int i = 0; i < m; i++) {
      long t = (long)pq.poll();
      t /= 2;
      pq.add(t);
    }
    long ans = 0;
    while(pq.size() > 0) {
      long t = (long)pq.poll();
      ans += t;
    }
    System.out.println(ans);
  }
}