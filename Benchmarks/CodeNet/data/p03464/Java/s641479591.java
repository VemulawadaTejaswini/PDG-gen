import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();

    long left = 2, right = 3;
    for (int i = N - 1; i >= 0; i--) {
      left = ((left - 1) / A[i] + 1) * A[i];
      right = ((right - 1) / A[i] + 1) * A[i];
      if (left == right) {
        System.out.println(-1);
        return;
      }
    }
    System.out.printf("%d %d\n", left, right - 1);
  }
}
