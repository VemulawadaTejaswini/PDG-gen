import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    int diff = 0;
    for (int i = 0; i < N - 1; i++) if (s[i] != s[i + 1]) diff++;
    System.out.println(N - 1 - diff + Math.min(diff, K * 2));
  }
}
