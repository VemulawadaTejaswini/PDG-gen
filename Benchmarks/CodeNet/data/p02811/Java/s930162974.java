import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    int K = scanner.nextInt();
    if (500 * X >= K) System.out.println("YES");
    else {
      System.out.println("NO");
    }
  }
}
