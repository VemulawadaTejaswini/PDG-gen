import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    long a = 0;
    long b = 0;
    PriorityQueue<Monster> pq = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] s = br.readLine().split("\\s+");
      n = Integer.parseInt(s[0]);
      a = Long.parseLong(s[1]);
      b = Long.parseLong(s[2]);
      final long t = b;
      pq = new PriorityQueue<>(Comparator.comparingLong(m -> -m.h-t*m.k));
      for (int i=0;i<n;i++) {
        long h = Long.parseLong(br.readLine());
        pq.offer(new Monster(h,0L));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    long k = 0L;
    while (pq.size() > 0) {
      Monster m = pq.poll();
      m.reset(m.h-(k-m.k)*b,k);
      if (m.h <= 0L) {
        break;
      } else if (m.h <= b) {
        k++;
        break;
      } else if (m.h <= a) {
        k++;
        continue;
      } else {
        long s = m.h/a;
        k += s;
        m.reset(m.h%a,k);
        pq.offer(m);
      }
    }
    System.out.println(k);
  }
  private class Monster {
    private long h;
    private long k;
    Monster(long h,long k) {
      this.h = h;
      this.k = k;
    }
    private void reset(long h,long k) {
      this.h = h;
      this.k = k;
    }
  }
}