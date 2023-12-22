import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double h = sc.nextDouble();
    double m = sc.nextDouble();
    double time = h + m/60;
    double da = 30 * time;
    double db = 360 * time;
    double d = db- da;
    double c2 = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(d));
    double c = Math.sqrt(c2);
    System.out.println(c);
  }
}