import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    int[] cnt = new int[256];
    char[] str = sc.next().toCharArray();
    for (char c : str) {
      ++cnt[(int) c];
    }
    boolean flag = true;
    for (int i = 'a'; i <= 'z'; ++i) {
      flag &= cnt[i] % 2 == 0;
    }
    System.out.println(flag ? "Yes" : "No");
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}