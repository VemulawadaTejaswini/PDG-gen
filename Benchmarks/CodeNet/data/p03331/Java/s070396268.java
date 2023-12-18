import java.util.*;

class Reader {
  Scanner sc = new Scanner(System.in);

  public int ini() {
    return sc.nextInt();
  }

  public int[] vi(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    return a;
  }
}

public class Main extends Reader {
  public static void main(String[] args) {
    Main main = new Main();
    main.show(main.solve());
  }

  int n;

  public Main() {
    n = ini();
  }
  
  int solve() {
    int ans = 9999;
    for (int i = 1; i < n; i++) {
      int j = n - i;
      int cnt = digitsum(i) + digitsum(j);
      if (cnt < ans) ans = cnt;
    }
    return ans;
  }

  int digitsum(int n) {
    int ans = 0;
    while (n > 0) {
      ans += n % 10;
      n /= 10;
    }
    return ans;
  }

  void show(int ans) {
    System.out.println(ans);
  }
}
