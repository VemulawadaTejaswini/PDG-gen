import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    long c = 0;
    Sushi[] sushi = new Sushi[0];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] s = br.readLine().split("\\s+");
      n = Integer.parseInt(s[0]);
      c = Long.parseLong(s[1]);
      sushi = new Sushi[n+2];
      sushi[0] = new Sushi(0L,0L);
      sushi[n+1] = new Sushi(0L,0L);
      for (int i=0;i<n;i++) {
        s = br.readLine().split("\\s+");
        sushi[i+1] = new Sushi(Long.parseLong(s[0]),Integer.parseInt(s[1]));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    long m = 0;
    {
      long[] f = new long[n+2];
      long[] g = new long[n+2];
      for (int i=1;i<n+1;i++) {
        f[i] = f[i-1] + sushi[i].v;
      }
      for (int i=0;i<n+1;i++) {
        f[i] -= 2*sushi[i].x;
      }
      for (int i=1;i<n+1;i++) {
        g[i] = g[i-1];
        if (g[i] < f[i]) g[i] = f[i];
      }
      long s = 0;
      for (int i=n;i>0;i--) {
        s += sushi[i].v;
        long t = g[i-1] + s - (c-sushi[i].x);
        if (m < t) m = t;
      }
    }
    {
      long[] f = new long[n+2];
      long[] g = new long[n+2];
      for (int i=n;i>0;i--) {
        f[i] = f[i+1] + sushi[i].v;
      }
      for (int i=n+1;i>0;i--) {
        f[i] -= 2*(c-sushi[i].x);
      }
      for (int i=n;i>0;i--) {
        g[i] = g[i+1];
        if (g[i] < f[i]) g[i] = f[i];
      }
      long s = 0;
      for (int i=1;i<n+1;i++) {
        s += sushi[i].v;
        long t = g[i+1] + s - sushi[i].x;
        if (m < t) m = t;
      }
    }
    System.out.println(m);
  }
  private class Sushi {
    private long x;
    private long v;
    Sushi(long x,long v) {
      this.x = x;
      this.v = v;
    }
  }
}