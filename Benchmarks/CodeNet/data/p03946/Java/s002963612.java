import java.util.Scanner;

public class Main {
  static final int INF = 1100000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    int max_benefit = -1;
    int min_A = INF;
    int ans = 0;
    for (int i = 0; i < N; i++) {
      min_A = Math.min(min_A, A[i]);

      int benefit = A[i] - min_A;
      if (benefit == max_benefit) {
        ans++;
      } else if (benefit > max_benefit) {
        ans = 1;
        max_benefit = benefit;
      }
    }
    System.out.println(ans);
  }
}