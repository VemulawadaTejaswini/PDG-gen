import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double h = sc.nextDouble();
    double m = sc.nextDouble();
    double ans = 0;

    double hAng = (60 * h + m) / 2;
    double mAng = m * 6;
    double diff = Math.abs(hAng - mAng);

    ans = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(diff)));

    System.out.println(ans);
  }
}
