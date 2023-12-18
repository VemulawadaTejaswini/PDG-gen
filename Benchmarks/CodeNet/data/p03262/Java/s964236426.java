import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int X = scanner.nextInt();
    int[] x = new int[N + 1];
    for (int i = 0; i < N; i++) x[i] = scanner.nextInt();
    x[N] = X;
    Arrays.sort(x);

    int ans = x[1] - x[0];
    for (int i = 1; i < N; i++) {
      int n = x[i + 1] - x[i];
      ans = gcd(ans, n);
    }
    System.out.println(ans);
  }

  private static int gcd(int i, int j) {
    if (i > j) return gcd(j, i);
    if (i == 0) return j;
    int r = j % i;
    return gcd(r, i);
  }
}
