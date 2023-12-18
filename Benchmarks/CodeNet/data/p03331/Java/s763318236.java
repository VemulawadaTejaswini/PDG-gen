import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 1000;
    for (int a = 1; a < N; a++) {
      int A = a;
      int B = N-a;
      int tmp = 0;
      while (A > 0) {
        tmp += A%10;
        A /= 10;
      }
      while (B > 0) {
        tmp += B%10;
        B /= 10;
      }
      ans = Math.min(ans, tmp);
    }
    System.out.println(ans);
  }
}

