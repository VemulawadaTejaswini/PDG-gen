import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 0;

    while (true) {
      a = sc.nextInt();
      b = sc.nextInt();

      if (a == 0 && b == 0) {
        break;
      }

      if (a > b) {
        int temp = a;
        a = b;
        b = temp;
      }
      System.out.println(String.format("%d %d", a, b));
    }
  }
}