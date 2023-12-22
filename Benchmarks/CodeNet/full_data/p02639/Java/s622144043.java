import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  int[] a;
  int ans;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      a = new int[6];
      for (int i = 0; i < 5; i++) {
        int x = sc.nextInt();
        a[x]++;       
      }
    } finally {
      sc.close();
    }
  }
  
  void solve() {
    for (int i = 1; i <= 5; i++) if (a[i] == 0) ans = i;
  }

  void show() {
    System.out.println(ans);
  }
}
