import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static long lunlunCountDp[][] = new long[100][10];

  static void resolve(InputStream is, PrintStream pw) {
    long[] lunlunCount = new long[100];
    for (int i = 0; i < 10; i++) {
      lunlunCountDp[0][i] = 1;
    }
    lunlunCount[0] = 9;
    for (int i = 1; i < 100; i++) {
      for (int j = 0; j < 10; j++) {
        if (j - 1 >= 0) {
          lunlunCountDp[i][j] += lunlunCountDp[i - 1][j - 1];
        }
        lunlunCountDp[i][j] += lunlunCountDp[i - 1][j];
        if (j + 1 < 10) {
          lunlunCountDp[i][j] += lunlunCountDp[i - 1][j + 1];
        }
        if (j != 0) {
          lunlunCount[i] += lunlunCountDp[i][j];
        }
      }
    }
    Scanner sc = new Scanner(is);
    long k = Integer.parseInt(sc.next());
    int skipKeta = 0;
    while (lunlunCount[skipKeta] <= k) {
      skipKeta++;
    }
    long remain;
    if (skipKeta > 0) {
      remain = k - lunlunCount[skipKeta - 1];
    } else {
      remain = k;
    }
    long count = 0;
    long i = Math.max(skipKeta * 10 - 1, 0);
    while (count < remain) {
      i++;
      if (isOk(i)) {
        count++;
      }
    }
    pw.println(i);
  }

  static boolean isOk(long i) {
    if (i <= 12) {
      return true;
    }
    long first = i - (i / 10 * 10);
    long second = (i - (i / 100 * 100) - first) / 10;
    if (Math.abs(first - second) > 1) {
      return false;
    }
    return isOk(i / 10);
  }
}
