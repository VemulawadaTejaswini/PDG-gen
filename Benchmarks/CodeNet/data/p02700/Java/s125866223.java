import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int h1 = scan.nextInt();
    int a1 = scan.nextInt();
    int h2 = scan.nextInt();
    int a2 = scan.nextInt();

    int i = 0;

    while (h1 > 0 && h2 > 0) {
      if (i == 0) {
        h2 -= a1;
        i = 1;
      }
      else {
        h1 -= a2;
        i = 0;
      }
    }

    System.out.println(h1 > 0 ? "Yes" : "No");
  }
}
