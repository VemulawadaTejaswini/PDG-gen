import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int[][] br = new int[30][N];

    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) {
      int b = scanner.nextInt();
      for (int j = 0; j < 30; j++) {
        br[j][i] = b % (1 << (j + 1));
      }
    }

    int res = 0;

    for (int k = 0; k < 30; k++) {
      Arrays.sort(br[k]);
      
      int m = 1 << (k + 1);

      int t = 1 << k;
      long count = 0;
      for (int j = 1; j < 4; j += 2) {
        for (int i = 0; i < N; i++) {
          int ar = a[i] % m;
          int left = find(br[k], t * j - ar);
          int right = find(br[k], t * (j + 1) - ar);
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
