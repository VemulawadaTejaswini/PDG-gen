import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i = 0; i < n; i++)
        pq.offer(sc.nextInt());
      for(int i = 1; i <= m; i++) {
        int b = sc.nextInt();
        int c = sc.nextInt();
        while(b-- > 0) {
          if(pq.peek() < c) {
            pq.poll();
            pq.offer(c);
          } else break;
        }
      }
      long sum = 0;
      while(!pq.isEmpty()) {
        sum += pq.poll();
      }
      System.out.println(sum);
  }
}