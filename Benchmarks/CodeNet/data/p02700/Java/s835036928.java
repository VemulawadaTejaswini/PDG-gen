import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    while (true) {
      c -= b;
      if (c <= 0) {
        pw.println("Yes");
        return;
      }
      a -= d;
      if (a <= 0) {
        pw.println("No");
        return;
      }
    }
  }
}
