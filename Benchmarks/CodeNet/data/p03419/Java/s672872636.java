import java.util.*;

public class Main {
  private static long solve(int n, int m) {
    if (n == 1 && m == 1) {
      return 1;
    }
    if (n == 1 || m == 1) {
      return Math.max(n, m) - 2;
    }
    return (n - 2) * (m - 2);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    System.out.println(solve(n, m));
  }
}
