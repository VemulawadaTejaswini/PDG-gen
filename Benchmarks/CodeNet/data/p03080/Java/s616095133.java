import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      String s = scanner.next();
      int a = count(s, 'R', n);
      int b = count(s, 'B', n);
      if (a > b) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } finally {
      scanner.close();
    }
  }

  private static int count(String s, char c, int n) {
    int result = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == c) result++;
    }
    return result;
  }
}
