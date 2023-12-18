import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double L = scanner.nextInt();
    L /= 3;
    System.out.println(L * L * L);
  }
}
