import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int M = scanner.nextInt();
    int[] a = new int[A];
    int[] b = new int[B];
    int minA = 1_000_000;
    int minB = 1_000_000;
    for (int i = 0; i < A; i++) {
      a[i] = scanner.nextInt();
      minA = Math.min(minA, a[i]);
    }
    for (int i = 0; i < B; i++) {
      b[i] = scanner.nextInt();
      minB = Math.min(minB, b[i]);
    }
    int min = minA + minB;
    for (int i = 0; i < M; i++) {
      int x = scanner.nextInt() - 1;
      int y = scanner.nextInt() - 1;
      int c = scanner.nextInt();
      min = Math.min(min, Math.max(a[x] + b[y] - c, 0));
    }
    System.out.println(min);
  }
}
