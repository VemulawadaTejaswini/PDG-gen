import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long M = scanner.nextLong();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    Arrays.sort(a);
    long[] s = new long[N + 1];
    for (int i = 0; i < N; i++) s[i + 1] = s[i] + a[i];

    int left = a[0] * 2;
    int right = a[N - 1] * 2;
    while (right - left > 1) {
      int mid = (right + left) / 2;
      int k = 0;
      for (int i = 0; i < N; i++) {
        int t = Arrays.binarySearch(a, mid - a[i]);
        if (t < 0) t = -(t + 1);
        k += N - t;
      }
      if (k >= M) left = mid;
      else right = mid;
    }

    long total = 0;
    int k = 0;
    for (int i = 0; i < N; i++) {
      int t = Arrays.binarySearch(a, left - a[i]);
      if (t < 0) t = -(t + 1);
      k += N - t;
      total += s[N] - s[t];
      total += (long) a[i] * (N - t);
    }

    total += (M - k) * (long) left;
    System.out.println(total);
  }
}
