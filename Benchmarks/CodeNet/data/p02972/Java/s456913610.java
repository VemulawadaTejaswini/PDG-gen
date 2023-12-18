import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N + 1];
    for (int i = 1; i <= N; i++) a[i] = scanner.nextInt();

    int[] b = new int[N + 1];
    for (int i = N; i >= 1; i--) {
      for (int j = 2; i * j <= N; j++) b[i] ^= b[i * j];
      b[i] ^= a[i];
    }
    StringBuilder sb = new StringBuilder();
    int count = 0;
    for (int i = 1; i <= N; i++) {
      if (b[i] == 1) {
        sb.append(i).append(' ');
        count++;
      }
    }
    System.out.println(count);
    if (sb.length() > 0) {
      sb.setLength(sb.length() - 1);
      System.out.println(sb);
    }
  }
}
