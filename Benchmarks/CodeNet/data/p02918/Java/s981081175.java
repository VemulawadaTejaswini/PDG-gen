import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    int diff = 0;
    int score = 0;
    for (int i = 0; i < N - 1; i++) {
      if (s[i] != s[i + 1]) diff++;
      else score++;
    }
    System.out.println(score + Math.min(diff, K * 2));
  }
}
