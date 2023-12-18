import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      int x = scanner.nextInt();
      int[] a = new int[n];

      for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
      Arrays.sort(a);
      
      int ans = 0;
      for (int i = 0; i < n; i++) {
        if (i == n - 1) {
          if (a[i] == x) ans++;
        } else {
          if (a[i] <= x) {
            ans++;
            x -= a[i];
          }
        }
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}
