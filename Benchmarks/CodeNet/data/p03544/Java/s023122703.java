import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    System.out.println(luca(N));
  }

  private static long luca(int N) {
    N--;
    long a = 2;
    long b = 1;
    while (N > 0) {
      long c = a + b;
      a = b;
      b = c;
      N--;
    }
    return b;
  }
}
