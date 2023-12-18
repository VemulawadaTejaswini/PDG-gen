import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int[] dist = new int[k];
    for(int i = 0; i < k; i++) {
      dist[i] = Integer.MAX_VALUE;
    }
    dist[1] = 0;
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(1);
    while(deque.size() > 0) {
      int u = deque.pollFirst();
      int v1 = (10 * u) % k;
      int v2 = (u + 1) % k;
      if(dist[v1] == Integer.MAX_VALUE) {
        deque.addFirst(v1);
      }
      if(v2 != v1) {
        if(dist[v2] == Integer.MAX_VALUE) {
          deque.addLast(v2); 
        }
      }

      dist[v1] = Math.min(dist[v1], dist[u]);
      dist[v2] = Math.min(dist[v2], dist[u] + 1);
    }
    System.out.println(dist[0] + 1);
  }
}