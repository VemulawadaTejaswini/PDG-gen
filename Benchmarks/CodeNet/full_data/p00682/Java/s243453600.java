// How to derive the area of a polygon.
// https://imagingsolution.net/math/calc_n_point_area/

import java.awt.*;
import java.util.Scanner;

public class Main {
  private static double solve(int n, Point[] points) {
    double sum = 0;
    for (int i = 0; i < n; i++) {
      if (i == n - 1) {
        sum += points[i].getX() * points[0].getY() - points[0].getX() * points[i].getY();
      } else {
        sum += points[i].getX() * points[i + 1].getY() - points[i + 1].getX() * points[i].getY();
      }
    }
    return Math.abs(sum) / 2;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = 1;
    while (true) {
      int n = Integer.parseInt(sc.nextLine());
      if (n == 0) break;
      Point[] points = new Point[n];
      for (int i = 0; i < n; i++) {
        points[i] = new Point();
        String[] xy = sc.nextLine().split(" ");
        points[i].setLocation(Integer.parseInt(xy[0]), Integer.parseInt(xy[1]));
      }
      double sum = solve(n, points);
      System.out.println((t++) + " " + String.format("%.1f", sum));
      sc.nextLine();
    }
    sc.close();
  }
}

