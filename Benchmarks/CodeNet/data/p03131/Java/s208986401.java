import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long K = scanner.nextInt();
    long A = scanner.nextInt();
    long B = scanner.nextInt();

    if (A >= B - 1 || K < A) {
      System.out.println(K + 1);
      return;
    }
    K -= A - 1;
    System.out.println(A + K / 2 * (B - A) + (K % 2));
  }
}
