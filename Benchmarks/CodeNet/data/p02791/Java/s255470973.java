import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < N; ++i) {
      P[i] = sc.nextInt();
    }
    sc.close();

    int ans = 0;
    for (int i = 0; i < N; ++i) {
      if (P[i] <= P[0]) {
        int cnt = 0;
        for (int j = 0; j <= i; ++j) {
          if (P[i] > P[j]) {
            break;
          } else {
            ++cnt;
          }
        }
        if (cnt > i) {
          ++ans;
        }
      }
    }
    System.out.println(ans);
  }
}
