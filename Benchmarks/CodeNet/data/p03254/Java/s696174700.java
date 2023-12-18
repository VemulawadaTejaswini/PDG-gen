import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int x = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }
    Arrays.sort(a);

    int count = 0;
    int sum = 0;
    for (int i = 0; i < N - 1; i++) {
      sum += a[i];
      if (sum <= x) count++;
    }
    sum += a[N - 1];
    if (sum == x) count++;
    System.out.println(count);
  }
}
