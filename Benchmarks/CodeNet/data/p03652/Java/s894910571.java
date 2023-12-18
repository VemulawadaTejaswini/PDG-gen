import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] a = new int[N][M];
    for (int i = 0; i < N; i++) for (int j = 0; j < M; j++) a[i][j] = scanner.nextInt() - 1;

    boolean[] available = new boolean[M];
    Arrays.fill(available, true);

    int min = N;
    for (int i = 0; i < M - 1; i++) {
      Result res = solve(N, M, a, available);
      min = Math.min(min, res.num);
      available[res.sport] = false;
    }
    System.out.println(min);
  }

  private static Result solve(int N, int M, int[][] a, boolean[] available) {
    int[] count = new int[M];
    int max = 0;
    int sport = -1;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        int k = a[i][j];
        if (available[k]) {
          count[k]++;
          if (count[k] > max) {
            max = count[k];
            sport = k;
          }
          break;
        }
      }
    }
    return new Result(sport, max);
  }

  private static class Result {
    private final int sport;
    private final int num;

    private Result(int sport, int num) {
      this.sport = sport;
      this.num = num;
    }
  }
}
