import java.util.*;

class Problem {
  int n;
  int a = 0;
  int b = 0;
  final int START_DISTANCE_FROM_ORIGIN = 2;

  public Problem(int n) {
    this.n = n;
  }

  public void solve() {
    for (int i = 1; i * i <= n; i++) if (n % i == 0) update(i);
  }

  private void update(int i) {
    a = i;
    b = n / i;
  }

  public void show() {
    System.out.println(a + b - START_DISTANCE_FROM_ORIGIN);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Problem p = new Problem(n);
    p.solve();
    p.show();
  }
}