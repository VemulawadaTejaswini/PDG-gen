import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] v = new int[N];
    for (int i = 0; i < N; i++) v[i] = scanner.nextInt();

    long max = 0;
    for (int l = 0; l <= K; l++) {
      int r = K - l;

      long lmax = max(v, l);

      reverse(v);
      long rmax = max(v, r);
      reverse(v);

      max = Math.max(max, lmax + rmax);
    }
    System.out.println(max);
  }

  private static long max(int[] arr, int n) {
    if (n == 0) return 0;
    long max = 0;
    for (int i = 0; i < (n + 1) / 2; i++) {
      long sum = 0;
      for (int j = 0; j < n - i; j++) {
        sum += arr[j];
      }
      int[] a = new int[n - i];
      System.arraycopy(arr, 0, a, 0, n - i);
      Arrays.sort(a);
      for (int j = 0; j < i; j++) sum -= a[j];
      max = Math.max(max, sum);
    }
    return max;
  }

  private static void reverse(int[] a) {
    int i = 0;
    int j = a.length - 1;
    while (i < j) {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
      i++;
      j--;
    }
  }
}
