import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] t = new int[N + 1];
    int[] v = new int[N + 2];

    for (int i = 0; i < N; i++) t[i + 1] = scanner.nextInt() + t[i];
    for (int i = 0; i < N; i++) v[i + 1] = scanner.nextInt();

    double dist = 0.d;

    double y = 0.d;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= 2 * (t[i] - t[i - 1]); j++) {
        double f = v[i];
        f = Math.min(f, v[i - 1] + j / 2.d);
        f = Math.min(f, v[i + 1] + t[i] - t[i - 1] - j / 2.d);
        dist += (y + f) * 0.25d;
        y = f;
      }
    }

    System.out.println(dist);
  }
}
