import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int D = scanner.nextInt();
    int[][] x = new int[N][D];
    for (int i = 0; i < N; i++) for (int j = 0; j < D; j++) x[i][j] = scanner.nextInt();

    int count = 0;
    for (int i = 0; i < N - 1; i++) {
      for (int j = i + 1; j < N; j++) {
        long d = 0;
        for (int k = 0; k < D; k++) {
          d += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
        }
        int dd = (int) Math.sqrt(d);
        if (dd * dd == d) count++;
      }
    }
    System.out.println(count);
  }
}
