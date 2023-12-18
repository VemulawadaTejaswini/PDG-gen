import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    int q = 0;
    PriorityQueue<Roadwork> pq = new PriorityQueue<>();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] s = br.readLine().split("\\s+");
      n = Integer.parseInt(s[0]);
      q = Integer.parseInt(s[1]);
      for (int i=0;i<n;i++) {
        s = br.readLine().split("\\s+");
        pq.offer(new Roadwork(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2])));
      }
      for (int k=0;k<q;k++) {
        PriorityQueue<Roadwork> tmp = new PriorityQueue<>();
        int d = Integer.parseInt(br.readLine());
        int x = -1;
        for (int i=0;i<n;i++) {
          Roadwork r = pq.poll();
          if (r.s <= r.x+d && r.x+d < r.t) {
            x = r.x;
            tmp.offer(r);
            break;
          } else if (r.x+d < r.s) {
            tmp.offer(r);
          }
        }
        System.out.println(x);
        if (pq.size() > tmp.size()) {
          while (!tmp.isEmpty()) pq.offer(tmp.poll());
        } else {
          while (!pq.isEmpty()) tmp.offer(pq.poll());
          pq = tmp;
        }
        n = pq.size();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  private class Roadwork implements Comparable<Roadwork> {
    private int s,t,x;
    Roadwork(int s,int t,int x) {
      this.s = s;
      this.t = t;
      this.x = x;
    }
    @Override
    public int compareTo(Roadwork other) {
      if (x == other.x) {
        if (t == other.t) return Integer.compare(s,other.s);
        return Integer.compare(t,other.t);
      }
      return Integer.compare(x,other.x);
    }
  }
}