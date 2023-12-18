import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    int[] cnt = new int[11];
    cnt[ni()]++;
    cnt[ni()]++;
    cnt[ni()]++;
    System.out.println(cnt[5] == 2 && cnt[7] == 1 ? "YES" : "NO");
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}