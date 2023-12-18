import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());

    if (2*N <  K) {
      System.out.println(0);
      return;
    }

    int ans = 0;
    if (K % 2 == 0) {
      int ans1 = N / K;
      int ans2 = 2 * N / K - ans1;
      ans = ans1 * ans1 * ans1 + ans2 * ans2 * ans2;
    } else {
      int ans1 = N / K;
      ans = ans1 * ans1 * ans1;
    }
    System.out.println(ans);
  }
}