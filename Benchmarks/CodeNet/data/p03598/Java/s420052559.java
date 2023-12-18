import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int tot = 0;
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      tot += Math.min(x, Math.abs(K - x)) * 2;
    }
    System.out.println(tot);
  }
}
