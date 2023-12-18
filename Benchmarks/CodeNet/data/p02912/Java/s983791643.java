import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
      
        for (int i = 0; i < n; i++) {
          pq.add(sc.nextInt());
        }        
      
        for (int i = 0; i < m; i++) {
          int max = (int) pq.poll();
          max = max / 2;
          pq.add(max);
        }
      
        long sum = 0;
        for (int i = 0; i < n; i++) {
          sum += (int) pq.poll();
        }
      System.out.println(sum);
    }
}   