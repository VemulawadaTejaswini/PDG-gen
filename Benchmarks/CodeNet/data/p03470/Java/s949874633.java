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
  int[] a;

  public Main() {
    n = ini();
    a = vi(n);
  }
  
  int solve() {
    int[] cnt = new int[101];
    for (int i = 0; i < n; i++) {
      cnt[a[i]]++;
    }
    int ans = 0;
    for (int i = 1; i <= 100; i++) {
      if (cnt[i] != 0) ans++;
    }
    return ans;
  }

  int calc(int left, int right) {
    int ans = 0;
    for (int i = left; i <= right; i++) {
      ans += i;
    }
    return ans;
  }

  void show(int ans) {
    System.out.println(ans);
  }
}


