import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int W = Integer.valueOf(input.next());
      int H = Integer.valueOf(input.next());
      int x = Integer.valueOf(input.next());
      int y = Integer.valueOf(input.next());
      int r = Integer.valueOf(input.next());

      if (x + r > W || x - r < 0) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
  }
}
