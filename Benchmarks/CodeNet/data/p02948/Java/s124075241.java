import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int days = sc.nextInt();
      List<Integer> r =  map.get(days);
      if (r == null) {
        r = new ArrayList<>();
        map.put(days, r);
      }
      r.add(sc.nextInt());
    }
    
    int ans = 0;
    PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
    for (int i = 1; i <= M; i++) {
      List<Integer> list = map.get(i);
      if (list != null) {
        for (int v : list) {
          pq.offer(v);
        }
      }
      Integer v = pq.poll();
      if (v != null) {
        ans += v;
      }
    }
    
    System.out.println(ans);
  }
}
