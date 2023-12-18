import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();
    long A = scanner.nextLong();
    long B = scanner.nextLong();

    long i = N / (A + B);
    long j = N % (A + B);
    System.out.println(i * A + Math.min(A, j));
  }
}
