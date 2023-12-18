import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      sum += a[i];
    }

    int cost1 = 0;
    for (int i = 0; i < N; i++) {
      int diff = a[i] - sum / N;
      cost1 += diff * diff;
    }
    int cost2 = 0;
    for (int i = 0; i < N; i++) {
      int diff = a[i] - sum / N - 1;
      cost2 += diff * diff;
    }

    System.out.println(Math.min(cost1, cost2));
  }
}
