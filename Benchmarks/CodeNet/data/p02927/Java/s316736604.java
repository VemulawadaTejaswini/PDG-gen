import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int m = scanner.nextInt();
      int d = scanner.nextInt();

      int ans = 0;
      for (int i = 1; i <= m; i++) {
        for (int j = 0; j <= d; j++) {
          if (query(j, i)) ans++;
        }
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }

  private static boolean query(int d, int m) {
    int d1 = d % 10;
    int d10 = (d % 100) / 10;
    return d1 >= 2 && d10 >= 2 && d1 * d10 == m; 
  }
}
