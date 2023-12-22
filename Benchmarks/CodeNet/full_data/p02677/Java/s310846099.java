import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int H = scan.nextInt();
    int M = scan.nextInt();
    int h = (double)H*30;
    int m = (double)M*6;
    double ans = Math.sqrt(A*A + B*B - 2*A*B*Math.cos(Math.toRadians(Math.abs(h-m))));
    System.out.println(ans);
  }
}