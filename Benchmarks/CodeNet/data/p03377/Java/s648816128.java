import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int x = scan.nextInt();

    if (x == a || x > a && x <= a + b) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}