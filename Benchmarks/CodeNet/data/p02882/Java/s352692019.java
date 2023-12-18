import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble()/2;

    double a1 = 2 * x / b;

    System.out.println(90.000000-Math.toDegrees(Math.atan(a1/b)));

  }

}
