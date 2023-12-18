import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();
    int max = Math.max(Math.max(P, Q), R);
    int ans = P + Q + R - max;
    System.out.println(ans);
  }  
}