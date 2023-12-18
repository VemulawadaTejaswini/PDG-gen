import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int A = scanner.nextInt();
    final int B = scanner.nextInt();
    final int C = scanner.nextInt();
    final int K = scanner.nextInt();

    int sum = 0;
    for (int i = 1; i <= K; i++) {
      if (i <= A) {
        sum += 1;
      } else if (i > A + B) {
        sum -= 1;
      }
    }

    System.out.println(sum);
  }
}
