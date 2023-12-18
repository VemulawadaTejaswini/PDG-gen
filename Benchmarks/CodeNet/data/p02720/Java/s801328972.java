import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    Queue q = new LinkedList<Long>();
    for(int i = 1; i < 10; i++) {
      q.add((long)i);
    }
    long ans = 0;
    for(int i = 0; i < k; i++) {
      long t = (long)q.poll();
      if(i == (k - 1)) {
        ans = t;
        break;
      }
      long d = (t % 10);
      long t1 = 10 * t + (d - 1);
      long t2 = 10 * t + d;
      long t3 = 10 * t + (d + 1);
      if(d == 0) {
        q.add(t2);
        q.add(t3);        
      } else if(d == 9) {
        q.add(t1);
        q.add(t2);
      } else {
        q.add(t1);
        q.add(t2);
        q.add(t3);
      } 
    }
    System.out.println(ans);
  }
}