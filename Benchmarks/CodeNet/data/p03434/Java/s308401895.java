import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
    Arrays.sort(a);
    int[] sums = new int[2];
    int c = 0;
    for (int i = n - 1; i >= 0; i--) {
      sums[c] += a[i];
      c = 1 - c;
    }
    System.out.println(sums[0] - sums[1]);
  }
}
