import java.util.*;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double pai = Math.PI;
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double h = sc.nextDouble();
    double m = sc.nextDouble();
    // 時針は分針にも影響されることに注意
    double cosC = Math.cos(Math.abs(30*(h+m/60) - 6*m) / 180 * pai);
    double ansPow = b*b + a*a - 2*a*b*cosC;
    System.out.println(Math.pow(ansPow, 0.5));
  }
}
