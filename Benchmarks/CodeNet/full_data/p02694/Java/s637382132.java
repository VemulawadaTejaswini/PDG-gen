import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long x = Long.parseLong(sc.next());
    long y = 100;
    int i = 0;
    while (!(y >= x)) {
      i++;
      y *= 1.01d;
    }
    pw.println(i);
  }
}
