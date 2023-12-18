import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();
    sc.close();

    double answer = 0.0;
    double rangle = 0.0;

    double wh = x / (a * a); 
    double dh = b - wh;

    if (dh <= wh) {

      rangle = Math.atan2(dh * 2, a);
      answer = rangle * 180.0 / Math.PI;

    } else {

      double ab = a * b;
      double x2 = 2 * x;
      double a2 = x2 / ab;
      rangle = Math.atan2(a2, b);
      answer = rangle * 180.0 / Math.PI;
      answer = 90 - answer;

    }

    System.out.println(answer);

  }

}