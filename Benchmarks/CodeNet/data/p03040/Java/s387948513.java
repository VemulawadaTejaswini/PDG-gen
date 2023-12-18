import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeSet;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    final int INF = 1000000001;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      int q = Integer.parseInt(br.readLine());
      TreeSet<Integer> l = new TreeSet<>(); l.add(-INF);
      TreeSet<Integer> r = new TreeSet<>(); r.add(INF);
      long x = 0L; long y = 0L;
      int m = 0;
      for (int k=0;k<q;k++) {
        String[] s = br.readLine().split("\\s+");
        int t = Integer.parseInt(s[0]);
        if (t == 2) {
          System.out.println(m+" "+(x+y));
        } else {
          int a = Integer.parseInt(s[1]);
          int b = Integer.parseInt(s[2]);
          y += (long)b;
          int lb = l.pollLast();
          int ub = r.pollFirst();
          if (a < lb) {
            x += (long)(lb-a);
            r.add(lb); r.add(ub);
            l.add(a); l.add(a);
          } else if (ub < a) {
            x += (long)(a-ub);
            l.add(lb); l.add(ub);
            r.add(a); r.add(a);
          } else {
            l.add(lb); r.add(ub);
            l.add(a); r.add(a);
          }
          m = l.pollLast(); l.add(m);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}