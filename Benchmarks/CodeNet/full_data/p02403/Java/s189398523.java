import java.util.Scanner;

public class Main {
  private static int x, y;
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    while (true) {
      x = stdIn.nextInt();
      y = stdIn.nextInt();
      if (x == 0 && y == 0) {
        break;
      }
      for (int i = 0;i < y; i++) {
        for (int j =0;j < x; j++) {
          System.out.print("#");
        }
        System.out.println("");
      }
      System.out.println("");
    }
  }
}