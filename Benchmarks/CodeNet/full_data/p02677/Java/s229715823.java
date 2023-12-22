/* C - :(Colon) */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int H = scan.nextInt();
    int M = scan.nextInt();
    double arg1 = 30 * H + 0.5 * M;
    double arg2 = 6 * M;
    double x1 = A * Math.cos(Math.toRadians(arg1));
    double y1 = A * Math.sin(Math.toRadians(arg1));
    double x2 = B * Math.cos(Math.toRadians(arg2));
    double y2 = B * Math.sin(Math.toRadians(arg2));
    System.out.println(Math.hypot(x2 - x1, y2 - y1));
  }
}
