import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->
      a.q != b.q ? a.q-b.q : a.p-b.p
    );
    for (int i = 0; i < N; i++) {
      int X = sc.nextInt();
      int L = sc.nextInt();
      pq.offer(new Pair(X-L, X+L));
    }
    
    int ans = 1;
    Pair last = pq.poll();
    while (!pq.isEmpty()) {
      Pair now = pq.poll();
      if (last.q <= now.p) {
        ans++;
        last = now;
      }
    }
    
    System.out.println(ans);
  }
  
  static class Pair {
    private final int p;
    private final int q;
    Pair(int p, int q) {
      this.p = p;
      this.q = q;
    }
  }
}