
import java.util.*;

public class Main {

  long INF = Long.MAX_VALUE;
  long[][] dp;

  public static void main(String[] args) {
    new Main().solve();
  }

  void solve() {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    System.out.println(N*A < B ? N*A: B);
  }
}
