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
    {
      long base = (long) Math.pow(x, 1d / 5d);
      for (long b = base; b >= base - 1; b--) {
        long diff = x - (long) Math.pow(b, 5);
        for (long l = 0; ; l--) {
          long l5 = -(long) Math.pow(l, 5);
          if (diff == l5) {
            pw.println(b + " " + l);
            return;
          }
          if (diff < l5) {
            break;
          }
        }
      }
    }
    {
      long base = (long) Math.pow(x, 1d / 5d);
      for (long b = base - 1; b <= base + 1; b++) {
        long diff = (long) Math.pow(b, 5) - x;
        for (long l = 0; ; l++) {
          long l5 = (long) Math.pow(l, 5);
          if (diff == l5) {
            pw.println(b + " " + l);
            return;
          }
          if (diff < l5) {
            break;
          }
        }
      }
    }
    throw new RuntimeException();
  }

  static long f(long a, long b) {
    return (long) Math.pow(a, 5) - (long) Math.pow(b, 5);
  }
}
