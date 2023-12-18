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
  int l;

  public Main() {
    n = ini();
    l = ini();
  }
  
  int solve() {
    int left = l;
    int right = l + n - 1;

    if (0 < left) {
      return calc(left + 1, right);
    } else if (right < 0) {
      return calc(left, right - 1);
    } else {
      return calc(left, right);
    }
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


