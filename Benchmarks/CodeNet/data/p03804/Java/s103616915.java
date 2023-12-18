import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    char[][] a = new char[n][n];
    char[][] b = new char[m][m];

    for (int i = 0; i < n; i++) {
      String k = sc.next();
      for (int j = 0; j < n; j++) {
        a[i][j] = k.charAt(j);
      }
    }

    for (int i = 0; i < m; i++) {
      String k = sc.next();
      for (int j = 0; j < m; j++) {
        b[i][j] = k.charAt(j);
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        if (a[i][j] == b[i][j]) {
          System.out.println("Yes");
          return;
        }
      }
    }

    System.out.println("No");

  }
}
