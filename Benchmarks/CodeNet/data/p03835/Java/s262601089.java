import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int K = scanner.nextInt();
    int S = scanner.nextInt();

    int ans = 0;

    for (int h = 0; h <= K; h++) {
      for (int i = 0; i <= K; i++) {
        for (int j = 0; j <= K; j++) {
          if (h + i + j == S) ans++;
        }
      }
    }

    System.out.println(ans);
    scanner.close();
  }
}
