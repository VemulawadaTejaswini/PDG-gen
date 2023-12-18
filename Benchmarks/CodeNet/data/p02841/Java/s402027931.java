import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    scanner.nextInt();
    int i1 = scanner.nextInt();
    scanner.nextInt();

    if (i != i1) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
