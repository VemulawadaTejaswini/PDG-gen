import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long M = scanner.nextInt();
    long V = scanner.nextInt();
    int P = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    Arrays.sort(A);
    reverse(A);
    long[] cum = new long[N];
    for (int i = 1; i < N; i++) cum[i] = cum[i - 1] + A[i - 1];

    int left = 0;
    int right = N;
    while (right - left > 1) {
      int mid = (right + left) / 2;
      if (A[mid] <= A[P - 1]) {
        right = mid;
      } else {
        left = mid;
      }
    }

    int count = 0;
    for (int i = 0; i < N; i++) {
      if (A[i] >= A[right]) {
        count++;
        continue;
      }
      if (A[i] + M < A[right]) break;
      long cap = M * right + M * (N - i);
      cap += (i - right) * (A[i] + M) - (cum[i] - cum[right]);
      if (cap >= M * V) count++;
    }
    System.out.println(count);
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
