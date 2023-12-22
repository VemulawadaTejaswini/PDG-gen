import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int A = sc.nextInt();
    final int B = sc.nextInt();
    final int H = sc.nextInt();
    final int M = sc.nextInt();
    sc.close();
    double rad = Math.PI/30*(5*(H+M/60) - M);
    double ans = Math.sqrt(A*A+B*B-2*A*B*Math.cos(rad));
    System.out.println(ans);
  }
}