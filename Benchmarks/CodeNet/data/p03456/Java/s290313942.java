import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next() + sc.next();

    if (isSquareRoot(Integer.parseInt(s))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

  private static boolean isSquareRoot(int num) {

    int i = 1;

    while ((i * i) <= num) {

      if ((i * i) == num) {
        return true;
      }

      i++;

    }

    return false;
  }
}