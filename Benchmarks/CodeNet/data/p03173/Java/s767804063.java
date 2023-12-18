import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    sc.close();

    long ans = fN(a, 0, N - 1);
    System.out.println(ans);
  }

  private static long fN(int[] a, int l, int r) {
    if (l == r) return 0;
    long min = Long.MAX_VALUE;
    long sum = a[r];
    for (int i = l; i < r; i++) {
      long b = fN(a, l, i) + fN(a, i + 1, r);
      min = Long.min(min, b);
      sum += a[i];
    }
    return sum + min;
  }
}