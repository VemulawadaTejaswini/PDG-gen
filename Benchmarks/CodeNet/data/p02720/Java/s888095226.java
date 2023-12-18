import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int k = Integer.parseInt(sc.next());
    int i = 0;
    int count = 0;
    while (count != k) {
      i++;
      if (isOk(i)) {
        System.out.println(i);
        count++;
      }
    }
    pw.println(i);
  }

  static boolean isOk(int i) {
    if (i <= 12) {
      return true;
    }
    int first = i - (i / 10 * 10);
    int second = (i - (i / 100 * 100) - first) / 10;
    if (Math.abs(first - second) > 1) {
      return false;
    }
    return isOk(i / 10);
  }
}
