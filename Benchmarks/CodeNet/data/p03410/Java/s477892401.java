import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];

    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) b[i] = scanner.nextInt();
    Arrays.sort(b);

    int res = 0;

    for (int k = 0; k < 28; k++) {
      int count = 0;
      for (int i = 0; i < N; i++) {
        final int t = 1 << k;
        for (int tt = t; tt <= 400_000; tt += t * 2) {
          int left = find(b, tt - a[i]);
          int right = find(b, tt + t - a[i]);
          count += right - left;
        }
      }
      if (count % 2 == 1) res += 1 << k;
    }

    System.out.println(res);
  }

  private static int find(int[] b, int t) {
    int left = -1;
    int right = b.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (b[mid] < t) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
