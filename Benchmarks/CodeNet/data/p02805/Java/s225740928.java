import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] x = new double[n];
    double[] y = new double[n];
    double minx = 1000;
    double maxx = 0;
    double miny = 1000;
    double maxy = 0;
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextDouble();
      y[i] = sc.nextDouble();
      minx = Math.min(minx, x[i]);
      maxx = Math.max(maxx, x[i]);
      miny = Math.min(miny, y[i]);
      maxy = Math.max(maxy, y[i]);
    }
    double ansx = minx;
    double ansy = miny;
    
    double leftx = minx;
    double rightx = maxx;

    for(int i = 0; i < 50; i++) {
      double lx = (double)(2 * leftx + rightx) / (double)3;
      double rx = (double)(leftx + 2 * rightx) / (double)3;
      double flx = 0;
      double frx = 0;
      double lxy = 0;
      double rxy = 0;
      double lefty = miny;
      double righty = maxy;
      for(int j = 0; j < 50; j++) {
        double ly = (double)(2 * lefty + righty) / (double)3;
        double ry = (double)(lefty + 2 * righty) / (double)3;
        double t1 = 0;
        double t2 = 0;
        for(int k = 0; k < n; k++) {
          t1 = Math.max(t1, (lx - x[k]) * (lx - x[k]) + (ly - y[k]) * (ly - y[k]));
          t2 = Math.max(t2, (lx - x[k]) * (lx - x[k]) + (ry - y[k]) * (ry - y[k]));
        }
        if(t1 <= t2) {
          righty = ry;
          flx = t2;
          lxy = ry;
        } else {
          lefty = ly;
          flx = t1;
          lxy = ly;
        }
      }
      lefty = miny;
      righty = maxy;
      for(int j = 0; j < 50; j++) {
        double ly = (double)(2 * lefty + righty) / (double)3;
        double ry = (double)(lefty + 2 * righty) / (double)3;
        double t1 = 0;
        double t2 = 0;
        for(int k = 0; k < n; k++) {
          t1 = Math.max(t1, (rx - x[k]) * (rx - x[k]) + (ly - y[k]) * (ly - y[k]));
          t2 = Math.max(t2, (rx - x[k]) * (rx - x[k]) + (ry - y[k]) * (ry - y[k]));
        }
        if(t1 <= t2) {
          righty = ry;
          frx = t2;
          rxy = ry;
        } else {
          lefty = ly;
          frx = t1;
          rxy = ly;
        }                
      }      
      if(flx <= frx) {
        rightx = rx;
        ansx = rx;
        ansy = rxy;
      } else {
        leftx = lx;
        ansx = lx;
        ansy = lxy;
      }
    }

    double ans = 0;
    
    for(int i = 0; i < n; i++) {
      double t = (ansx - x[i]) * (ansx - x[i]) + (ansy - y[i]) * (ansy - y[i]);
      t = Math.sqrt(t);
      ans = Math.max(ans, t);
    }

    System.out.println(ans);
  }
}