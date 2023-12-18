import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    int k = 0;
    Sushi[] sushi = new Sushi[0];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] s = br.readLine().split("\\s+");
      n = Integer.parseInt(s[0]);
      k = Integer.parseInt(s[1]);
      sushi = new Sushi[n];
      for (int i=0;i<n;i++) {
        s = br.readLine().split("\\s+");
        sushi[i] = new Sushi(Integer.parseInt(s[0]),Long.parseLong(s[1]));
      }
      Arrays.sort(sushi,Comparator.reverseOrder());
    } catch (IOException e) {
      e.printStackTrace();
    }
    PriorityQueue<Sushi> used = new PriorityQueue<>();
    PriorityQueue<Sushi> rem = new PriorityQueue<>
      ((s1,s2) -> -Long.compare(s1.priority,s2.priority));
    Map<Integer,Integer> map = new HashMap<>();
    long m = 0;
    long[] f = new long[n];
    for (int i=0;i<k;i++) {
      used.add(sushi[i]);
      if (map.containsKey(sushi[i].t)) {
        int x = map.get(sushi[i].t);
        map.put(sushi[i].t,x+1);
      } else {
        map.put(sushi[i].t,1);
      }
      m += sushi[i].d;
      f[i] = m + (long)map.size()*(long)map.size();
    }
    for (int i=k;i<n;i++) {
      rem.add(sushi[i]);
    }
    int c = 0;
    outside: while (used.size() > 0) {
      Sushi s = used.poll();
      if (map.get(s.t) > 1) {
        while (rem.size() > 0) {
          Sushi u = rem.poll();
          if (!map.containsKey(u.t)) {
            m += u.d - s.d;
            map.put(u.t,1);
            f[k+c] = m + (long)map.size()*(long)map.size();
            c++;
            continue outside;
          }
        }
      }
    }
    m = f[k-1];
    for (int i=k;i<n;i++) {
      m = f[i] > m ? f[i] : m;
    }
    System.out.println(m);
  }
  private class Sushi implements Comparable<Sushi> {
    private int t;
    private long d;
    private long priority;
    Sushi(int t,long d) {
      this.t = t;
      this.d = d;
      priority = d;
    }
    @Override
    public int compareTo(Sushi other) {
      return Long.compare(priority,other.priority);
    }
    @Override
    public int hashCode() {
      int prime = 31;
      int result = 1;
      result = prime * result + t;
      result = prime * result + (int)(d ^ (d >>> 32));
      return result;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      Sushi other = (Sushi)obj;
      return t == other.t && d == other.d;
    }
  }
}