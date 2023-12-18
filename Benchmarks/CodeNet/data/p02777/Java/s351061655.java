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
    String t = sc.next();
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    String u = sc.next();
    if (u.equals(s)) {
      pw.println((a - 1) + " " + b);
    } else {
      pw.println(a + " " + (b - 1));
    }
  }
}
