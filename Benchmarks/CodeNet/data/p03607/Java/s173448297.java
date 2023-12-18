import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.show(main.solve());
  }

  int n;
  long a[];
  int ans;
  
  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      a = new long[n];
      for (int i = 0; i < n; i++) a[i] = sc.nextLong();
      Arrays.sort(a);
    } finally {
      sc.close();
    }
  }
  
  int solve() {
    int cnt = 1;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (i == n - 1 || a[i] != a[i+1]) {
        if (cnt % 2 == 1) ans++;
        cnt = 1;
      } else {
        cnt++;
      }
    }
    return ans;
  }

  void show(int ans) {
    System.out.println(ans);
  }
}
