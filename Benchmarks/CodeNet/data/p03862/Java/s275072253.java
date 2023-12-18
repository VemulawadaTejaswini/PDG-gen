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
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) count += Math.max(0, a[i] - x);
      else {
        int c = Math.max(0, a[i] + Math.min(a[i - 1], x) - x);
        if (i + 1 < N) c = Math.max(c, a[i] + Math.min(a[i + 1], x) - x);
        count += c;
      }
    }
    System.out.println(count);
  }
}
