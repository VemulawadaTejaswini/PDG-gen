import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      h[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 1; i <= N; i++) {
      int d = h[i] - h[i - 1];
      if (d > 0) {
        ans += d;
      }
    }
    System.out.println(ans);
  }
}
