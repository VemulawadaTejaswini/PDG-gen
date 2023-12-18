import java.awt.Point;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    Point[] a = new Point[n];
    for (int i = 0; i < n; i++) {
      a[i] = new Point(s.nextInt(), s.nextInt());
    }

    double r = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        r += a[i].distance(a[j]);
        System.out.println(r * 2 / n);
      }
    }
  }
}
