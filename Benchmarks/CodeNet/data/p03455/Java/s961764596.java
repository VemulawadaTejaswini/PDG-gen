import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    new Main().execute(a, b);
  }

  public void execute(int a, int b) {

    System.out.println(a * b % 2 == 0 ? "Even" : "Odd");

  }
}
