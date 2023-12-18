import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long X = scanner.nextLong();
    long Y = scanner.nextLong();
    System.out.println((int) ((Math.log(Y) - Math.log(X)) / Math.log(2)) + 1);
  }
}
