import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] k = new int[m];
    int[][] s = new int[m][];
    int[] p = new int[m];

    for (int i = 0; i < m; i++) {
      k[i] = sc.nextInt();
      s[i] = new int[k[i]];
      for (int j = 0; j < k[i]; j++) {
        s[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < m; i++) {
      p[i] = sc.nextInt();
    }

    int ans = 0;

    for (int i = 0; i < Math.pow(2,n); i++) {
      boolean b = true;
      for (int j = 0; j < m; j++) {
        int count = 0;
        for (int v = 0; v < k[j]; v++) {
          if ((1&i >> s[j][v]-1) == 1) count++;
        }
        if (count % 2 != p[j]) b = false;
      }
      if (b) ans++;
    }

    System.out.println(ans);

  }

}
