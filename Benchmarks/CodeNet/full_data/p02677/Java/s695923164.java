import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();
    double d = 0;
    int x = 6*m;
    double y = 0.5*m + 30*h;
    double z = Math.abs(x-y);
    // System.out.println(z);
    if(z<=180){
      d = z;
    }else{
      d= 360-z;
    }
    double rad = Math.toRadians(z);
    double A = a*a;
    double B = b*b;
    double C = 2*a*b*Math.cos(rad);
    System.out.println(Math.sqrt(A+B-C));
  }
}
