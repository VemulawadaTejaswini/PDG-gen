import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int Q = sc.nextInt();
    for (int i = 0; i < Q; i++) {
      long A = sc.nextInt();
      long B = sc.nextInt();
      long C = (long) (Math.sqrt(A * B) - 1e-5);
      long ans = 0;
      if (C * (C + 1) < A * B) {
        ans += C - (A <= C ? 1 : 0);
        ans += C - (B <= C ? 1 : 0);
      } else {
        ans += C - 1 - (A < C ? 1 : 0);
        ans += C - 1 - (B < C ? 1 : 0);
        if (A != C && B != C) ++ans;
      }
      System.out.println(ans);
    }
  }

}
