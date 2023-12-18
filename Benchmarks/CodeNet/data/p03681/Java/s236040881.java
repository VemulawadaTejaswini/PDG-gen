import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long ans = 1;
    if (N == M) {
      for (int i = N; i > 0; i--) {
        ans *= i;
        ans = ans % 1000000007;
      }
      ans *= ans;
      ans *= 2;
      ans = ans % 1000000007;
    } else if (Math.abs(N - M) == 1) {
      for (int i = N; i > 0; i--) {
        ans *= i;
        ans = ans % 1000000007;
      }
      for (int i = M; i > 0; i--) {
        ans *= i;
        ans = ans % 1000000007;
      }
    } else {
      ans = 0;
    }
    System.out.println(ans);
  }
}