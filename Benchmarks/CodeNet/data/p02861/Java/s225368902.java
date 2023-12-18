import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = scanner.nextInt();
      y[i] = scanner.nextInt();
    }

    int[] order = new int[N];
    for (int i = 0; i < N; i++) order[i] = i;

    double sum = 0;
    do {
      sum += distance(N, x, y, order);
    } while (next(order));
    for (int i = 1; i <= N; i++) {
      sum /= i;
    }
    System.out.println(sum);
  }

  private static double distance(int N, int[] x, int[] y, int[] order) {
    double sum = 0;
    int lastx = x[order[0]];
    int lasty = y[order[0]];
    for (int i = 1; i < N; i++) {
      sum += Math.sqrt((x[order[i]] - lastx) * (x[order[i]] - lastx) + (y[order[i]] - lasty) * (y[order[i]] - lasty));
    }
    return sum;
  }

  public static boolean next(int[] p) {
    final int n = p.length;

    int i = n - 1;
    while (i > 0 && p[i - 1] >= p[i]) i--;
    if (i <= 0) return false;

    int j = n - 1;
    while (j >= i && p[j] <= p[i - 1]) j--;

    swap(p, i - 1, j);

    j = n - 1;
    while (i < j) swap(p, i++, j--);

    return true;
  }

  private static void swap(int[] a, int i, int j) {
    int tmp = a[j];
    a[j] = a[i];
    a[i] = tmp;
  }
}
