import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (b == (a + 1)) {
      System.out.println("Borys");
      return;
    }

    while (true) {
      if (++a == (b - 1)) {
        System.out.println("Alice");
        return;
      }
      if ((a + 1) == ++b) {
        System.out.println("Borys");
        return;
      }
    }

  }
}