import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int w = scan.nextInt(),
        h = scan.nextInt(),
        x = scan.nextInt(),
        y = scan.nextInt(),
        r = scan.nextInt();
    if ((r <= x && x <= w - r) && (r <= y && y <= h - r)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
