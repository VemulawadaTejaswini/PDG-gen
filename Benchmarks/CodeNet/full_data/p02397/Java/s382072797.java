import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true) {
      int x = in.nextInt();
      int y = in.nextInt();
      if (x == 0 && y == 0) break;
      if (x > y) {
        int t = x;
        x = y;
        y = t;
      }
      System.out.println(x + " " + y);
    }
  }
}