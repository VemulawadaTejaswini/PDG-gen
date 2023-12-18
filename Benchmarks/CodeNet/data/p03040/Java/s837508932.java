import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    final long INF = 10000000000L;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      int q = Integer.parseInt(br.readLine());
      PriorityQueue<Long> l = new PriorityQueue<>(Comparator.reverseOrder()); l.offer(-INF);
      PriorityQueue<Long> r = new PriorityQueue<>(Comparator.naturalOrder()); r.offer(INF);
      long x = 0L; long y = 0L; long m = 0L;
      for (int k=0;k<q;k++) {
        String[] s = br.readLine().split("\\s+");
        int t = Integer.parseInt(s[0]);
        if (t == 2) {
          System.out.println(m+" "+(x+y));
        } else {
          y += Long.parseLong(s[2]);
          long a = Long.parseLong(s[1]);
          long lb = l.peek();
          long ub = r.peek();
          if (a < lb) {
            x += lb-a;
            r.offer(l.poll());
            l.offer(a); l.offer(a);
          } else if (ub < a) {
            x += a-ub;
            l.offer(r.poll());
            r.offer(a); r.offer(a);
          } else {
            l.offer(a); r.offer(a);
          }
          m = l.peek();
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}