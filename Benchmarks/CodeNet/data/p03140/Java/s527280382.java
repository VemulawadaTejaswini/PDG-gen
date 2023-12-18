import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] a = scanner.next().toCharArray();
    char[] b = scanner.next().toCharArray();
    char[] c = scanner.next().toCharArray();

    int cnt = 0;
    for (int i = 0; i < N; i++) {
      cnt += countDiff(a[i], b[i], c[i]);
    }
    System.out.println(cnt);
  }

  private static int countDiff(char a, char b, char c) {
    if (a > b) return countDiff(b, a, c);
    if (b > c) return countDiff(a, c, b);
    if (a != b) {
      if (b != c) return 2;
      return 1;
    }
    return b != c ? 1 : 0;
  }
}
