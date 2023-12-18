import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int x = scanner.nextInt();
    if (x == 1 || x == N * 2 - 1) System.out.println("No");
    else {
      System.out.println("Yes");
      int[] a = new int[N * 2 - 1];
      int c = 2;
      for (int i = 0; i < N - 2; i++) {
        if (c == x) c++;
        a[i] = c++;
      }
      a[N - 2] = 1;
      a[N - 1] = x;
      a[N] = N * 2 - 1;
      for (int i = N + 1; i < N * 2 - 1; i++) {
        if (c == x) c++;
        a[i] = c++;
      }

      StringBuilder sb = new StringBuilder();
      for (int i : a) sb.append(i).append('\n');
      System.out.print(sb.toString());
    }
  }

  private static int process(int[] a) {
    while (a.length > 1) {
      int[] b = new int[a.length - 2];
      for (int i = 1; i <= b.length; i++) {
        b[i - 1] = median(a[i - 1], a[i], a[i + 1]);
      }
      a = b;
    }
    return a[0];
  }

  private static int median(int a, int b, int c) {
    if (a > b) return median(b, a, c);
    if (b > c) return median(a, c, b);
    return b;
  }
}
