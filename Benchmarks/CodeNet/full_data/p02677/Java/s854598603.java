import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int A = sc.nextInt();
    final int B = sc.nextInt();
    final int H = sc.nextInt();
    final int M = sc.nextInt();
    sc.close();
    double rad = Math.toRadians((60*H + M)* 0.5 - M*6);
    double ans = Math.sqrt(Math.pow(A, 2.0) + Math.pow(B, 2.0) - 2*A*B*Math.cos(rad));
    System.out.println(ans);
  }
}