import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    int res = 0;
    res += X / 500 * 1000;
    X -= X / 500 * 500;
    res += X / 5 * 5;
    System.out.println(res);
  }
}
