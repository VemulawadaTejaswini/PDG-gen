import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int L = 1 << N;

    int ga = fromGrey(A, N);
    int gb = fromGrey(B, N);
    if ((gb + 1) % L != ga && (ga + 1) % L != gb) {
      System.out.println("NO");
      return;
    }

    int delta = 1;
    if ((ga + 1) % L == gb) delta = -1;

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < L; i++) {
      int g = ga + i * delta;
      if (g >= L) g -= L;
      if (g < 0) g += L;

      sb.append(toGrey(g)).append(' ');
    }
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }

  private static int fromGrey(int g, int N) {
    int n = 0;
    int c = 0;
    for (int j = N - 1; j >= 0; j--) {
      int b = (g >> j) & 1;
      c = c ^ b;
      n += c << j;
    }
    return n;
  }

  private static int toGrey(int n) {
    return n ^ (n >> 1);
  }
}
