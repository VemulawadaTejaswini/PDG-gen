import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int S = scanner.nextInt();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < K; i++) sb.append(S).append(' ');
    for (int i = K; i < N; i++) sb.append(1).append(' ');
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }
}
