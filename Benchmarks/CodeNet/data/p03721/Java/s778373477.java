import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  int n;
  long k;
  long a[];
  long b[];
  long ans;
  
  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      k = sc.nextLong();
      a = new long[n];
      b = new long[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextLong();
        b[i] = sc.nextLong();
      }
    } finally {
      sc.close();
    }
  }
  
  void solve() {
    for (int i = 0; i < n; i++) {
      k -= b[i];
      if (k <= 0) {
        ans = a[i];
        break;
      }
    }
  }

  void show() {
    System.out.println(ans);
  }
}
