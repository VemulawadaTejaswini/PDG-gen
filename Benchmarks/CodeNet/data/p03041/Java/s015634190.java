import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    StringBuilder s = new StringBuilder(sc.next());
    s.setCharAt(k - 1, String.valueOf(s.charAt(k - 1)).toLowerCase(Locale.ENGLISH).charAt(0));
    pw.println(s.toString());
  }
}
