import java.util.*;

class Problem {
  long n;
  long a = 0;
  long b = 0;
  final long START_DISTANCE_FROM_ORIGIN = 2;

  public Problem(long n) {
    this.n = n;
  }

  public void solve() {
    for (long i = 1; i * i <= n; i++) if (n % i == 0) update(i);
  }

  private void update(long i) {
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
    long n = sc.nextLong();

    Problem p = new Problem(n);
    p.solve();
    p.show();
  }
}