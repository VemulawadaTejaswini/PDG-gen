import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Q = sc.nextInt();
    int H = sc.nextInt();
    int S = sc.nextInt();
    int D = sc.nextInt();
    int N = sc.nextInt();
    int Sl = Math.min(Math.min(4*Q, 2*H), S);
    if (2*Sl > D) {
      System.out.println((long)N/2*D + (N%2 == 1 ? Sl : 0));
    } else {
      System.out.println((long)N*Sl);
    }
  }
}