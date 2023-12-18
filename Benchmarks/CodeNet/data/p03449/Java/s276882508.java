import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  static int x,y,n;
  static int sum,ans;
  static int[][] a;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    a = new int[2][n];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    x = 0; y = 0;
    sum = 0;
    ans = Integer.MIN_VALUE;

    dfs(x,y);

    System.out.println(ans);

  }

  public static boolean dfs (int i, int j) {

    if (i < 0 || i >=n || j < 0 || j >= 2) {
      return false;
    }

    sum += a[j][i];

    if (i == n-1 && j == 1) {
      ans = Math.max(sum,ans);
      sum = 0;
    }

    if (dfs(i+1,j)) return true;

    if (dfs(i,j+1)) return true;

    return false;

  }

}
