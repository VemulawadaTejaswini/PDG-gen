import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);
  int N;
  int[][] AB;

  void input() {
    N = sc.nextInt();
    AB = new int[N][];
    for (int i = 0; i < N; i++) {
      AB[i] = new int[] {sc.nextInt(), sc.nextInt()};
    }
  }

  void solve() {
    Arrays.sort(AB, (int[] a, int[] b) -> -((a[0] + a[1]) - (b[0] + b[1])));
    long v = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        v += AB[i][0];
      } else {
        v -= AB[i][1];
      }
    }
    System.out.println(v);
  }

  void start() {
    input();
    solve();
  }

  public static void main(String[] args) throws Exception {
    new Main().start();
  }
}
