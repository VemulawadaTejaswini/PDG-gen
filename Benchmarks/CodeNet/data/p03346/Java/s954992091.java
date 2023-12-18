import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Main().solve();
  }

  public void solve() {

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    ArrayList<Integer> P = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      P.add(input.nextInt());
    }

    ArrayList<Integer> I = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      I.add(P.indexOf(i));
    }

    int cnt = 0;
    int res = 0;
    for (int i = 0; i < n - 1; i++) {
      if (I.get(i) < I.get(i + 1)) {
        cnt++;
      } else {
        res = Math.max(res, cnt);
        cnt = 0;
      }
    }

    System.out.println(n - (res + 1));
  }
}
