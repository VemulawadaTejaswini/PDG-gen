import java.util.*;
import java.lang.Math;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int H = sc.nextInt();
    int M = sc.nextInt();
    double s;

    
    double sA = 30 * H + 0.5 * M;
    double sB = 6 * M;
    
    if(sA <= sB) {
     s = sB - sA;
    } else {
     s = sA - sB;
    }
    
    double ans2 = A*A + B*B - 2*A*B*Math.cos(Math.toRadians(s));
    System.out.println(Math.sqrt(ans2));
  }
}