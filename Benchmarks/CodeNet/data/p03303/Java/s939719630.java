import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      String s = scanner.next();
      int n = scanner.nextInt();
      int m = (s.length() + n - 1) / n;
      String ans = "";
      for (int i = 0; i < m; i++) {
        ans = ans + s.charAt(i*n);
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}