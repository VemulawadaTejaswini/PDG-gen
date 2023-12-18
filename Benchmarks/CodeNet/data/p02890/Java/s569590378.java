import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] freq = new int[N];
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt() - 1;
      freq[a]++;
    }
    Arrays.sort(freq);
    long[] cumsum = new long[N];
    cumsum[0] = freq[0];
    for (int i = 1; i < N; i++) {
      cumsum[i] = cumsum[i - 1] + freq[i];
    }

    long[] res = new long[N];
    for (int i = 0; i < N; i++) res[N - i - 1] = upperBound(freq, cumsum, i, N);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) sb.append(res[i]).append('\n');
    System.out.print(sb.toString());
  }

  public static long upperBound(int[] freq, long[] cumsum, int offset, int N) {
    long left = freq[offset];
    long right = cumsum[N - 1] + 1;
    while (right - left > 1) {
      long mid = (left + right) / 2;
      int idx = upperBound(freq, mid);
      if (cumsum[idx] >= (idx - offset + 1) * mid) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }

  public static int upperBound(int[] a, long k) {
    int left = -1;
    int right = a.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (a[mid] < k) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
