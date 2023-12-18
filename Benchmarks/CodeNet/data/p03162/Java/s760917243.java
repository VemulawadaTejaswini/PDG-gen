import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    int[] a = new int[n+1];
    int[] b = new int[n+1];
    int[] c = new int[n+1];
    for (int i = 1; i <= n; i++) {
      a[i] = in.nextInt();
      b[i] = in.nextInt();
      c[i] = in.nextInt();
    }
    final Solver solve = new Solver();
    System.out.println(solve.solve(a, b, c));
  }
}

class Solver {
  public int solve(int[] a, int[] b, int[] c) {
    int n = a.length;
    int[] dp = new int[n];
    int id = a[1] < b[1] ? 2 : (a[1] < c[1] ? 3 : 1);
    dp[1] = Math.max(a[1], Math.max(b[1], c[1]));
    for (int i = 2; i < n; i++) {
      if (id == 1) {
        dp[i] = Math.max(b[i], c[i]) + dp[i-1];
        id = b[i] < c[i] ? 3 : 2;
      } else if (id == 2) {
        dp[i] = Math.max(a[i], c[i]) + dp[i-1];
        id = a[i] < c[i] ? 3 : 1;
      } else {
        dp[i] = Math.max(a[i], b[i]) + dp[i-1];
        id = a[i] < b[i] ? 2 : 1;
      }
    }
    return dp[n-1];
  }
}
