import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long S = scanner.nextLong();
    int x1 = 1_000_000_000;
    long y2 = (S - 1) / x1 + 1;
    long y1 = y2 * x1 - S;
    System.out.printf("%d %d %d %d %d %d\n", 0, 0, x1, y1, 1, y2);
  }
}
