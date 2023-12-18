import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    int N = sc.nextInt();
    int num = 1;
    int ans = 0;
    while (num <= N) {
      int cnt = 0;
      for (int i = 1; i <= num; i += 2) {
        if (num % i == 0) cnt++;
      }
      if (cnt == 8) ans++;
      num++;
    }
    System.out.println(ans);
  }
}

