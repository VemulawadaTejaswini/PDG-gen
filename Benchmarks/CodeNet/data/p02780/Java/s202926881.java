import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] p = new int[N];
    for (int i = 0; i < N; i++) p[i] = sc.nextInt();
    sc.close();

    int[] s = new int[N + 1];
    for (int i = 0; i < N; i++) {
      int n = p[i] == 1 ? 1 : p[i] + 1;
      s[i + 1] = s[i] + n;
    }

    long max = 0;
    for (int i = K; i < N + 1; i++) {
      max = Math.max(max, s[i] - s[i - K]);
    }

    double ans = (double) max / 2;
    System.out.println(ans);
  }
}
