import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int t = Integer.parseInt(sc.next());
    int num = n / x + 1;
    if (n % x == 0) {
      num--;
    }
    pw.println(num * t);
  }
}
