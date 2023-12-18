import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();
    for (int i = 0; i < N; i++) {
      if (match(s, t, i)) {
        System.out.println(N + i);
        return;
      }
    }
    System.out.println(N * 2);
  }

  private static boolean match(char[] s, char[] t, int start) {
    for (int i = start; i < s.length; i++) {
      if (s[i] != t[i - start]) return false;
    }
    return true;
  }
}
