import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int sum = 0;
    int sum2 = 0;
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      sum += a[i];
      sum2 += a[i] * a[i];
    }
    System.out.println(sum2 - sum * sum / N);
  }
}
