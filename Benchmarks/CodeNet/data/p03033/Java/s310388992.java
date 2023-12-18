import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] p = br.readLine().split("\\s+");
      int n = Integer.parseInt(p[0]);
      int q = Integer.parseInt(p[1]);
      Roadwork[] r = new Roadwork[2*n];
      for (int i=0;i<2*n;i+=2) {
        p = br.readLine().split("\\s+");
        int s = Integer.parseInt(p[0]);
        int t = Integer.parseInt(p[1]);
        int x = Integer.parseInt(p[2]);
        r[i] = new Roadwork(s-x,1,x,i/2);
        r[i+1] = new Roadwork(t-x,-1,x,i/2);
      }
      Arrays.sort(r,Comparator.comparingInt(w -> w.t));
      int idx = -1;
      TreeSet<Roadwork> undergo = new TreeSet<>(Comparator.comparingInt(w -> w.x));
      StringBuilder sb = new StringBuilder();
      for (int k=0;k<q;k++) {
        int d = Integer.parseInt(br.readLine());
        while (idx < 2*n-1 && r[idx+1].t <= d) {
          idx++;
          if (r[idx].f > 0) undergo.add(new Roadwork(0,0,r[idx].x,r[idx].i));
          if (r[idx].f < 0) undergo.remove(new Roadwork(0,0,r[idx].x,r[idx].i));
        }
        if (undergo.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(undergo.first().x).append("\n");
        }
      }
      System.out.print(sb);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  private class Roadwork {
    private int t,f,x,i;
    Roadwork(int t,int f,int x,int i) {
      this.t = t;
      this.f = f;
      this.x = x;
      this.i = i;
    }
    @Override
    public int hashCode() {
      int prime = 31;
      int result = 1;
      result = prime*result+t;
      result = prime*result+f;
      result = prime*result+x;
      result = prime*result+i;
      return result;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      Roadwork other = (Roadwork)obj;
      return t == other.t && f == other.f && x == other.x && i == other.i;
    }
  }
}