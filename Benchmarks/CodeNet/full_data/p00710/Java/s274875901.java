import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      int n = sc.nextInt();
      int r = sc.nextInt();

      if(n == 0 && r == 0) break;

      int[] ps = new int[r];
      int[] cs = new int[r];
      for(int i = 0; i < r; i++) {
        ps[i] = sc.nextInt();
        cs[i] = sc.nextInt();
      }

      int x = n;
      for(int i = r - 1; i >= 0; i--) {
        int a = n - ps[i] - cs[i] + 1;
        if(x <= a) continue;
        else if(x <= n - cs[i]) x += cs[i];
        else x -= ps[i] - 1;
      }

      System.out.println(x);
    }
  }

  private final Scanner sc = new Scanner(System.in);
}