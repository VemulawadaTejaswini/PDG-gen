import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] a = new int[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) a[i][j] = scanner.nextInt();

    System.out.println(solve(N, a));
  }

  public static long solve(int N, int[][] a) {
    long dist = 0;
    for (int i = 0; i < N; i++) dist += a[0][i];

    for (int i = 1; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        dist += a[i][j];
        for (int k = 0; k < i; k++) {
          int longest = linearTriangle(a[i][k], a[k][j], a[i][j]);
          if (longest < 0) return -1;
          dist -= longest;
        }
      }
    }
    return dist;
  }

  private static int linearTriangle(int a, int b, int c) {
    if (a > b) return linearTriangle(b, a, c);
    if (b > c) return linearTriangle(a, c, b);

    if (a + b < c) return -1;
    if (a + b == c) return c;
    return 0;
  }
}
