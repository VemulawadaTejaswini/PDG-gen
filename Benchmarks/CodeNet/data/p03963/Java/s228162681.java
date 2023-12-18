import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    long res = K;
    for (int i = 1; i < N; i++) res *= K - 1;
    System.out.println(res);
  }
}
