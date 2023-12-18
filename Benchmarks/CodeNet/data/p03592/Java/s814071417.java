import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int K = scanner.nextInt();
    if (possible(N, M, K)) System.out.println("Yes");
    else System.out.println("No");
  }

  private static boolean possible(int N, int M, int K) {
    for (int x = 0; x <= N; x++) {
      for (int y = 0; y <= M; y++) {
        if (x * M + y * N - 2 * x * y == K) return true;
      }
    }
    return false;
  }
}
