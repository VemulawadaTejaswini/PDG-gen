import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();

    double tant = 2 * (b- (x/(a*a)))/a;

    double y = a*tant;

    // System.out.println(x);
    // System.out.println(a*tant);
    // System.out.println(a*tant);

    double ans = Math.toDegrees(Math.atan(tant));

    if (a*Math.sin(ans) > b*Math.cos(ans)){
      System.out.println(Math.toDegrees(Math.atan(a*(b*b)/(2*x))));
    }else{
      System.out.println(Math.toDegrees(Math.atan(tant)));
    //System.out.println(Math.PI/4);
    }
  }
}
