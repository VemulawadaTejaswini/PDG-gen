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
    int l = s.length();
    int count = 0;
    for (int i = 0; i < l / 2; i++) {
      if (s.charAt(i) != s.charAt(l - 1 - i)) {
        count++;
      }
    }
    pw.println(count);
  }
}
