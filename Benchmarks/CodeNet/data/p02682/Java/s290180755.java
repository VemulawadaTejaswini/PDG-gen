import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int A = scanner.nextInt();
    final int B = scanner.nextInt();
    final int C = scanner.nextInt();
    final int K = scanner.nextInt();

    if (A >= K) {
      System.out.println(A);
      return;
    }

    if (A + B < K) {
      System.out.println(A - (K - (A + B)));
    } else {
      System.out.println(A);
    }
  }
}
