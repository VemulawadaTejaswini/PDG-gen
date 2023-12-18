import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int[] h = new int[N];
    int hmax = 0;
    for (int i = 0; i < N; i++) {
      h[i] = scanner.nextInt();
      hmax = Math.max(hmax, h[i]);
    }

    long left = -1;
    long right = (hmax - 1) / B + 1;
    while (right - left > 1) {
      long mid = (left + right) / 2;
      if (possible(A, B, h, mid)) {
        right = mid;
      } else {
        left = mid;
      }
    }
    System.out.println(right);
  }

  private static boolean possible(int A, int B, int[] harray, long pmax) {
    long p = 0;
    for (int h : harray) {
      if (h <= pmax * B) continue;
      long pi = (h - pmax * B - 1) / (A - B) + 1;
      p += pi;
      if (p > pmax) return false;
    }
    return true;
  }
}
