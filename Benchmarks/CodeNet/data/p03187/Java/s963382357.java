import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int L = Integer.parseInt(sc.next());
    int N = Integer.parseInt(sc.next());
    int X[] = new int[N];
    int rX[] = new int[N];
    long Sum[] = new long[N + 1];
    long rSum[] = new long[N + 1];
    Sum[0] = 0;
    rSum[0] = 0;

    for (int i = 0; i < N; i++) {
      X[i] = Integer.parseInt(sc.next());
      Sum[i + 1] = Sum[i] + X[i];
      rX[i] = L - X[i];
      rSum[i + 1] = rSum[i] + rX[i];
    }

    long ans = 0;

    for (int i = 0; i < N; i++) {
      int last = (N - i) / 2 + i;
      if (last - i == N - 1 - last) {
        ans = Math.max(ans, (last - i) * 2 * L + X[last] + (Sum[last] - Sum[i]) * 2 - (Sum[N] - Sum[last + 1]) * 2);
        ans = Math.max(ans,
            (last - i) * 2 * L + rX[last] + (rSum[last] - rSum[i]) * 2 - (rSum[N] - rSum[last + 1]) * 2);
      } else {
        ans = Math.max(ans,
            ((last - i) * 2 - 1) * L - X[last] + (Sum[last] - Sum[i]) * 2 - (Sum[N] - Sum[last + 1]) * 2);
        ans = Math.max(ans,
            ((last - i) * 2 - 1) * L - rX[last] + (rSum[last] - rSum[i]) * 2 - (rSum[N] - rSum[last + 1]) * 2);
      }

    }

    System.out.println(ans);
  }
}