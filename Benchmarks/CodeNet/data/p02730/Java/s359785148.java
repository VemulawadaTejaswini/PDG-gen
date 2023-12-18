import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String s = sc.next();
    if (!isKaibun(s)) {
      pw.println("No");
      return;
    }
    if (!isKaibun(s.substring(0, (s.length() - 1) / 2))) {
      pw.println("No");
      return;
    }
    if (!isKaibun(s.substring((s.length() + 3 - 1) / 2))) {
      pw.println("No");
      return;
    }
    pw.println("Yes");
  }

  static boolean isKaibun(String s) {
    return s.equals(new StringBuilder((s)).reverse().toString());
  }
}
