import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ai = Integer.parseInt(sc.next());
    int bi = Integer.parseInt(sc.next());
    int xi = Integer.parseInt(sc.next());

    double a = (double) ai;
    double b = (double) bi;
    double x = (double) xi;
    
    double theta = 0;
    double ans = 0;
    
    // over half
    if (x >= a*a*b*0.5d) {
      theta = Math.atan( (a*a*a)/(a*a*b*2.0d-x*2.0d) );
      ans = 90.0d - Math.toDegrees(theta);
    } else { // under half
      theta = Math.atan( (x*2.0d)/(a*b*b) );
      ans = 90.0d - Math.toDegrees(theta);
    }
    
    System.out.println(ans);
  }
}
