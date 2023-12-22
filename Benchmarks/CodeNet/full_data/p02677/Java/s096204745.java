import java.util.*;

public class Main {
  static final double H_SPEED = 2*Math.PI/720;
  static final double M_SPEED = 2*Math.PI/60;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double h = sc.nextDouble();
    double m = sc.nextDouble();
    double res = Math.sqrt(a*a+b*b-2*a*b*Math.cos((60*h+m)*H_SPEED-m*M_SPEED));
    System.out.println(res);
    sc.close();
  }
}