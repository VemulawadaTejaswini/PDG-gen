import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int P = scanner.nextInt();
    int Q = scanner.nextInt();
    int R = scanner.nextInt();
    System.out.println(minTwo(P, Q, R));
  }

  private static int minTwo(int a, int b, int c) {
    if (a > b) return minTwo(b, a, c);
    if (b > c) return minTwo(a, c, b);
    return a + b;
  }
}
