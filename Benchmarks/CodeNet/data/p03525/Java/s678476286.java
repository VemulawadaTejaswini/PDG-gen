import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] D = new int[N + 1];
    for (int i = 1; i <= N; i++) D[i] = scanner.nextInt();
    Arrays.sort(D);
    for (int i = 0; i <= N; i++) {
      if (i + 2 <= N && D[i] == D[i + 1] && D[i] == D[i + 2]) {
        System.out.println(0);
        return;
      }
    }

    for (int i = 2; i <= N; i += 2) D[i] = 24 - D[i];
    Arrays.sort(D);

    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= N; i++) min = Math.min(min, D[i] - D[i - 1]);
    min = Math.min(min, 24 - D[N]);
    System.out.println(min);
  }
}
