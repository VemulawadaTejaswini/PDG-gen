import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long x = scanner.nextInt();
    long[] a = new long[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    long c1 = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        c1 += Math.max(0, a[i] - x);
      } else {
        long c = 0;
        if (i - 1 >= 0) c = Math.max(c, a[i] + Math.min(a[i - 1], x) - x);
        if (i + 1 < N) c = Math.max(c, a[i] + Math.min(a[i + 1], x) - x);
        c1 += c;
      }
    }
    long c2 = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 1) {
        c2 += Math.max(0, a[i] - x);
      } else {
        long c = 0;
        if (i - 1 >= 0) c = Math.max(c, a[i] + Math.min(a[i - 1], x) - x);
        if (i + 1 < N) c = Math.max(c, a[i] + Math.min(a[i + 1], x) - x);
        c2 += c;
      }
    }
    System.out.println(Math.min(c1, c2));
  }
}
