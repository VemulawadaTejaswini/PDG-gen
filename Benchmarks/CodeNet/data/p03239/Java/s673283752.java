import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Main().solve();
  }

  public void solve() {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int T = sc.nextInt();

    int cmin = 0;
    int index = 0;
    for (int i = 1; i <= N; i++) {
      int c = sc.nextInt();
      int t = sc.nextInt();
      if (t <= T) {
        cmin = c;
        index = i;
      }
      break;
    }

    for (int i = index + 1; i <= N; i++) {
      int c = sc.nextInt();
      int t = sc.nextInt();
      if (t <= T) {
        cmin = Math.min(cmin, c);
      }
    }

    if (cmin != 0) {
      System.out.println(cmin);
    } else {
      System.out.println("TLE");
    }
  }
}
