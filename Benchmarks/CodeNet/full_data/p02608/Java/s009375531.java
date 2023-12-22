import java.util.*;

public class Main {

  private static void solve(int N) {
    for (int i = 1; i <= N; i++) {
      int res = 0;
      for (int x = 1; x <= i; x++) {
        for (int y = 1; y <= i; y++) {
          for (int z = 1; z <= i; z++) {
            if (isValid(x, y, z, i)) {
              res++;
            }
          }
        }
      }
      System.out.println(res);
    }
  }

  private static boolean isValid(int x, int y, int z, int i) {
    return x * x + y * y + z * z + x * y + y * z + z * x == i;
  }

  public static void main(String[] args) {
    int N = scanner.nextInt();
    solve(N);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
