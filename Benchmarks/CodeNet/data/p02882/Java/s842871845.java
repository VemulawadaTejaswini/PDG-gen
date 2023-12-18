import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();
    double s = x/a;

    if(s <= (a*b)/2){
      double a1 = 2*s/b;
      double result1 = Math.atan(b/a1);
      System.out.println(Math.toDegrees(result1));
    }else{
      double result2 = Math.atan(2*(a*b-s)/(a*a));
      System.out.println(Math.toDegrees(result2));
    }
  }
}
