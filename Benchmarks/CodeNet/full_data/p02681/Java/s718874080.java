import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
  public static void main(final String[] args) {
      final int INF = 1001001001;
      final Scanner sc = new Scanner(System.in);
      int n, m, x;
      n = sc.nextInt();
      m = sc.nextInt();
      x = sc.nextInt();
      final int a[][] = new int[n][m];
      final int c[] = new int[n];
      for (int i = 0; i < n; i++) {
          c[i] = sc.nextInt();
          for (int j = 0; j < m; j++) {
              a[i][j] = sc.nextInt();
          }
      }
      sc.close();
      int ans = INF;
      for (int i = 0; i < (1 << n); i++) {
          int cost = 0;
          final int[] skill = new int[m];
          // Arrays.fill(skill, 0);
          for (int j = 0; j < n; j++) {
              if ((i >> j & 1)==1) {
                  cost += c[j];
                  for (int k = 0; k < m; k++) {
                      skill[k] += a[j][k];
                  }
              }
          }
          boolean ok = true;
          for (final int j : skill) {
            if(skill[j]<x){
                ok = false;
                break;
            }
        }
        if (ok) ans = Math.min(ans, cost);
    }
    //System.out.println(A+B+C+K);
    if (ans == INF) {
      System.out.println(-1);
    } else {
      System.out.println(ans);
    }
  }
}