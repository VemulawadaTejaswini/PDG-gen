import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    ArrayList<Circle> c = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] p = br.readLine().split("\\s+");
      c.add(new Circle(Double.parseDouble(p[0]),Double.parseDouble(p[1]),0));
      c.add(new Circle(Double.parseDouble(p[2]),Double.parseDouble(p[3]),0));
      n = Integer.parseInt(br.readLine());
      for (int i=0;i<n;i++) {
        p = br.readLine().split("\\s+");
        c.add(new Circle(Double.parseDouble(p[0]),Double.parseDouble(p[1]),Double.parseDouble(p[2])));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    Circle s = c.remove(0);
    Circle t = c.get(0);
    double time = 0;
    while (true) {
      int j = 0;
      Circle u = t;
      double m = t.dist(s);
      for (int i=1;i<c.size();i++) {
        double d = c.get(i).dist(s);
        if (m == d && c.get(j).dist(t) > c.get(i).dist(t)) j = i;
        if (m > d) {
          j = i;
          m = d;
        }
      }
      time += m-Math.min(m,s.r+c.get(j).r);
      if (j == 0) break;
      s = c.remove(j);
    }
    System.out.printf("%.12f\n",time);
  }
  private class Circle {
    private double x,y,r;
    Circle(double x,double y,double r) {
      this.x = x;
      this.y = y;
      this.r = r;
    }
    private double dist(Circle c) {
      return Math.sqrt((x-c.x)*(x-c.x)+(y-c.y)*(y-c.y));
    }
    private double dist(Circle s,Circle t) {
      double a = t.y-s.y;
      double b = -t.x+s.x;
      if (a == 0 && b == 0) return dist(s);
      double c = s.y*t.x-s.x*t.y;
      return Math.abs(a*x+b*y+c)/Math.sqrt(a*a+b*b);
    }
  }
}