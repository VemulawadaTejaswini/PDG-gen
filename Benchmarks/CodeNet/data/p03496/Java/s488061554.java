import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }

    List<int[]> operations = new ArrayList<>();
    while (true) {
      if (nonDecreasing(a)) break;
      for (int i = 0; i < N - 1; i++) {
        if (a[i] > a[i + 1]) {
          if (a[i] > 0 && a[i + 1] > 0) {
            a[i + 1] += a[i];
            operations.add(new int[]{i + 1, i + 2});
          } else if (a[i] < 0 && a[i + 1] < 0) {
            a[i] += a[i + 1];
            operations.add(new int[]{i + 2, i + 1});
          } else if (a[i] + a[i + 1] > 0) {
            a[i + 1] += a[i] * 2;
            operations.add(new int[]{i + 1, i + 2});
            operations.add(new int[]{i + 1, i + 2});
          } else {
            a[i] += a[i + 1] * 2;
            operations.add(new int[]{i + 2, i + 1});
            operations.add(new int[]{i + 2, i + 1});
          }
        }
      }
    }
    System.out.println(operations.size());
    for (int[] p : operations) System.out.printf("%d %d\n", p[0], p[1]);
  }

  private static boolean nonDecreasing(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) return false;
    }
    return true;
  }
}
