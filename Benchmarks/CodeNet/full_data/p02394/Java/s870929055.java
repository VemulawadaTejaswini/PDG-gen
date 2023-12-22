import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int w = scanner.nextInt();
    int h = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int r = scanner.nextInt();

    if (0 <= x-r && 0 <= y-r && x+r <= w && y+r <= h) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}