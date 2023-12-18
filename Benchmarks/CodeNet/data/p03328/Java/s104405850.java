import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println(sovle(a, b));
  }

  private static long sovle(int a, int b) {
    int res1 = 0;
    int res2 = 0;
    for (int i = 1; true; i++) {
      res1 += i;
      if (res1 > a) {
        break;
      }
    }
    for (int i = 1; true; i++) {
      res2 += i;
      if (res2 > b) {
        break;
      }
    }
    return res1 - a;
  }

}
