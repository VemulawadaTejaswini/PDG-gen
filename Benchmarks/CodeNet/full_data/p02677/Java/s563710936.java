import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int A = sc.nextInt();
    final int B = sc.nextInt();
    final int H = sc.nextInt();
    final int M = sc.nextInt();
    sc.close();
    final double theta_h = 12/360;
    final double theta_m = 60/360;
    final double rad_h = Math.toRadians(H*theta_h);
    final double rad_m = Math.toRadians(M*theta_m);
    final double h_y = A*Math.sin(rad_h);
    final double h_x = A*Math.cos(rad_h);
    final double m_x = B*Math.sin(rad_m);
    final double m_y = B*Math.cos(rad_m);
    double expr_y = Math.pow(m_y-h_y,2.0);
    double expr_x = Math.pow(m_x-h_x,2.0);
    double ans = Math.sqrt(expr_x + expr_y);
    //System.out.println("H("+h_x+","+h_y+"), "+"M("+m_x+","+m_y+"), ");
    //System.out.println("x:"+expr_x+", y:"+expr_y);
    System.out.println(ans);
  }
}