import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] h = new int[N];
    int[] a = new int[N];
    for (int i = 0; i < N; i++) h[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    long[] bit = new long[N + 1];
    for (int i = 0; i < N; i++) {
      int hi = h[i] - 1;
      long max = 0;
      while (hi > 0) {
        max = Math.max(max, bit[hi]);
        hi -= hi & -hi;
      }
      max += a[i];
      hi = h[i];
      while (hi < bit.length) {
        bit[hi] = Math.max(bit[hi], max);
        hi += hi & -hi;
      }
    }

    long max = 0;
    for (int i = 0; i <= N; i++) if (bit[i] > max) max = bit[i];
    System.out.println(max);
  }
}
