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
    LinkedList<Integer> deque = new LinkedList<Integer>();
    deque.addFirst(1);
    while(deque.size() > 0) {
      int u = deque.poll();
      int v2 = (u + 1) % k;
      int v1 = (10 * u) % k;
      if(dist[v1] == Integer.MAX_VALUE) {
        dist[v1] = dist[u];
        deque.addFirst(v1);
      }
      if(dist[v2] == Integer.MAX_VALUE) {
        dist[v2] = dist[u] + 1;
        deque.addLast(v2); 
      }
    }
    System.out.println(dist[0] + 1);
  }
}