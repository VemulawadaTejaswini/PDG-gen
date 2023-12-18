import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();
    int x3 = x2 + y1 - y2;
    int y3 = y2 + x2 - x1;
    int x4 = x3 + y2 - y3;
    int y4 = y3 + y3 - y2;
    System.out.printf("%d %d %d %d\n", x3, y3, x4, y4);
  }
}
