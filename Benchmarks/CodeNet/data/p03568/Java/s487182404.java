import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
  }

  int n;
  int a[];

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      a = new int[n];
      for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    } finally {
      sc.close();
    }
  }

  void solve() {
    int b = total();
    int c = odd();
    System.out.println(b - c);
  }

  int total() {
    return (int)Math.pow(3, n);
  }

  int odd() {
    int ans = 1;
    for (int i = 0; i < n; i++) ans *= calc(a[i]);
    return ans;
  }

  int calc(int i) {
    if (i % 2 == 0) return 2;
    return 1;
  }
}
