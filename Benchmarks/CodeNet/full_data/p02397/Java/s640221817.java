import java.util.Scanner;

public class Main {

  /*
     input:
         3 2
         2 2
         5 3
         0 0
     output:
         2 3
         2 2
         3 5
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x, y;

    while (true) {
      x = scan.nextInt();
      y = scan.nextInt();
      if (x + y == 0) break;
      System.out.printf("%d %d\n", Math.min(x, y), Math.max(x, y));
    }
  }
}
