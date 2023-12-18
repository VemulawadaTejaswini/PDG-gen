import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());

    int ans = 0, ans1 = 0, ans2 = 0;

    if (K % 2 == 0) {
      ans1 = N / K;
      ans2 = 2 * N / K - ans1;
    } else {
      ans1 = N / K;
    }
    ans = (int) (Math.pow(ans1, 3) + Math.pow(ans2, 3));
    System.out.println(ans);
  }
}
