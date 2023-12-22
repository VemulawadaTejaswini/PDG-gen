import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long x = Integer.parseInt(sc.next());
    for (long a = 0; ; a++) {
      long l5 = (long) Math.pow(a, 5);
      long idealB5 = l5 - x;
      if (idealB5 == 0) {
        pw.println(a + " " + 0);
      }
      if (idealB5 < 0) {
        long b = (long) Math.pow(-idealB5, 1d / 5d);
        if ((long) Math.pow(b, 5) == -idealB5) {
          pw.println(a + " " + -b);
          return;
        }
      } else {
        long b = (long) Math.pow(idealB5, 1d / 5d);
        if ((long) Math.pow(b, 5) == idealB5) {
          pw.println(a + " " + b);
          return;
        }
      }
    }
  }
}
