import java.util.*;

/**
 * D Main
 *
 * @date 2020.08.22
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {
  Scanner sc;
  int[] stringItemsAsCharCode;

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);
    String s = this.sc.next();
    int length = s.length();
    this.stringItemsAsCharCode = new int[s.length()];
    for (int i = 0; i < length; i++) {
      this.stringItemsAsCharCode[i] = s.charAt(i);
    }
    for (int i = 0; i < length; i++) {
      for (int j = i + 2; j < length; j++) {
        if (this.isUnbalance(i, j)) {
          System.out.println(i + " " + j);
          return;
        }
      }
    }
    System.out.println("-1 -1");
  }

  public boolean isUnbalance(int from, int to) {
    int length = to - from + 1;
    int majority = (int) Math.ceil(length / 2.0);
    if (length < 1) {
      return false;
    }
    int[] partial = new int[length];
    for (int i = from; i <= to; i++) {
      partial[i - from] = this.stringItemsAsCharCode[i];
    }
    Arrays.sort(partial);
    int cnt = 1;
    for (int i = 1; i < partial.length; i++) {
      cnt = (partial[i - 1] == partial[i] ? cnt + 1 : 1);
      if (cnt >= majority) {
        return true;
      }
    }
    return false;
  }
}
