import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a = in.nextFloat();
    double b = in.nextFloat();
    double x = in.nextFloat();
    if(a * a * b / 2 < x) {
      double t = (2 / a) * (b - (x / (a * a)));
      System.out.printf("%.10f", Math.toDegrees(Math.atan(t)));
      return;
    }
    double t = (a * b * b) / (2 * x);
    System.out.printf("%.10f", Math.toDegrees(Math.atan(t)));
  }
}
