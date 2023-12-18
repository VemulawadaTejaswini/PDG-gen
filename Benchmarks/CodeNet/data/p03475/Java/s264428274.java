import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] c = new int[N];
    int[] s = new int[N];
    int[] f = new int[N];

    for (int i = 0; i < N - 1; i++) {
      c[i] = scanner.nextInt();
      s[i] = scanner.nextInt();
      f[i] = scanner.nextInt();
    }

    for (int i = 0; i < N; i++) {
      int t = s[i] + c[i];
      for (int j = i + 1; j < N - 1; j++) {
        t = Math.max(t, s[j]);
        t = ((t - 1) / f[j] + 1) * f[j];
        t += c[j];
      }
      System.out.println(t);
    }
  }
}
