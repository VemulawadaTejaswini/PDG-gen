import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc135/tasks/abc135_b
 */
public class ABC164 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int S = sc.nextInt();
    int W = sc.nextInt();
  	sc.close();
    
    if(S>W)
      System.out.println("safe");
    else 
      System.out.println("unsafe");
   }
}