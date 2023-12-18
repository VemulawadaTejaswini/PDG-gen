import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
    Arrays.sort(a);
    int r = upperBound(a, a[n - 1] / 2);
    if (r + 1 < n - 1 && Math.abs(a[r + 1] * 2 - a[n - 1]) < Math.abs(a[r] * 2 - a[n - 1])) r = a[r + 1];
    else r = a[r];
    System.out.printf("%d %d\n", a[n - 1], r);
  }

  public static int upperBound(int[] a, int k) {
    int left = -1;
    int right = a.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (a[mid] <= k) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
