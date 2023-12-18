import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int T = scanner.nextInt();
    int prev = -1;
    long sum = 0;
    for (int i = 0; i < N; i++) {
      int t = scanner.nextInt();
      if (prev >= 0) {
        sum += Math.min(T, t - prev);
      }
      prev = t;
    }
    sum += T;
    System.out.println(sum);
  }
}
