import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] T = new int[N];
    for (int i = 0; i < N; i++) T[i] = scanner.nextInt();
    long sum = 0;
    for (int i = 0; i < N; i++) sum += T[i];
    int M = scanner.nextInt();
    int[] P = new int[M];
    int[] X = new int[M];
    for (int i = 0; i < M; i++) {
      P[i] = scanner.nextInt() - 1;
      X[i] = scanner.nextInt();
    }
    for (int i = 0; i < M; i++) System.out.println(sum - T[P[i]] + X[i]);
  }
}
