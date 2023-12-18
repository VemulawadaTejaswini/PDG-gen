import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int ans = 0;
    if (B > C && A < D) {
      ans = Integer.min(B, D) - Integer.max(A, C);
    }
    System.out.println(ans);
  }
}