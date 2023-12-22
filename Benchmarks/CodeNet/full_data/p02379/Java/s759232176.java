import java.util.Scanner;
public class Main {
  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.pow(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2), .5);
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double x1 = s.nextDouble();
    double y1 = s.nextDouble();
    double x2 = s.nextDouble();
    double y2 = s.nextDouble();
    System.out.println(distance(x1, y1, x2, y2));
    s.close();
  }
}

