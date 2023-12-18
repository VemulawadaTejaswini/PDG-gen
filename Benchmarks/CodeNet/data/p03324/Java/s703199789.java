import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int D = scanner.nextInt();
    int N = scanner.nextInt();
    int res = 1;
    for (int i = 0; i < D; i++) {
      res *= 100;
    }
    System.out.println(res * N);
  }
}
