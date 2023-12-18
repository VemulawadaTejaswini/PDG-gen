import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X = sc.nextLong();
    long[] a = new long[51]; // バーガーの段数
    long[] p = new long[51]; // パティの枚数
    a[0] = 1;
    p[0] = 1;
    for (int i = 1; i <= 50; i++) {
      a[i] = 2 * a[i - 1] + 3;
      p[i] = 2 * p[i - 1] + 1;
    }
    System.out.println(f(N, X, a, p));
  }

  public static long f(int N, long X, long[] a, long[] p) {
    if (N == 0 && X == 1) {
      return 1;
    } else if (0 < N && X == 1) {
      return 0;
    } else if (1 < X && X < p[N]) {
      return f(N - 1, X - 1, a, p);
    } else if (X == p[N]) {
      return p[N - 1] + 1;
    } else if (p[N] < X && X < a[N]) {
      return f(N - 1, X - p[N], a, p) + p[N - 1] + 1;
    } else {
      return p[N];
    }
  }
}