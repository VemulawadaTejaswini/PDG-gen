import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    if (X == 3 || X == 5 || X == 7) {
      System.out.println("YES");
      return;
    }
    System.out.println("NO");
  }
}
