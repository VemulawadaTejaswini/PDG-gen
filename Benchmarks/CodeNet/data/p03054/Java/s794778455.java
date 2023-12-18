import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int N = scanner.nextInt();
    int sr = scanner.nextInt();
    int sc = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();

    if (solve(H, W, N, sr, sc, s, t)) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }

  private static boolean solve(int H, int W, int N, int sr, int sc, char[] s, char[] t) {
    int left = 0;
    int right = W + 1;
    for (int i = N - 1; i >= 0; i--) {
      if (i < N - 1) {
        if (t[i] == 'L') right = Math.min(right + 1, W + 1);
        else if (t[i] == 'R') left = Math.max(left - 1, 0);
      }
      if (s[i] == 'L') left = Math.max(left + 1, 1);
      else if (s[i] == 'R') right = Math.min(right - 1, W);
      if (left + 1 >= right) return true;
    }
    if (sc <= left || sc >= right) return true;

    int top = 0;
    int bottom = H + 1;
    for (int i = N - 1; i >= 0; i--) {
      if (i < N - 1) {
        if (t[i] == 'U') bottom = Math.min(bottom + 1, H + 1);
        else if (t[i] == 'D') top = Math.max(top - 1, 0);
      }
      if (s[i] == 'U') top = Math.max(top + 1, 1);
      else if (s[i] == 'D') bottom = Math.min(bottom - 1, H);
      if (top + 1 >= bottom) return true;
    }
    if (sr <= top || sr >= bottom) return true;

    return false;
  }
}
