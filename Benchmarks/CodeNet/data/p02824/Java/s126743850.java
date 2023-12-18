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
      if (A[i] + M < A[right]) continue;
      long cap = 0;
      for (int j = right; j < i; j++) {
        cap += A[i] + M - A[j];
      }
      if (cap >= M * (V - N + i - right)) count++;
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
