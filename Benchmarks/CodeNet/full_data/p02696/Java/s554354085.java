import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long n = Long.parseLong(sc.next());
    if (b == 1) {
      pw.println(0);
      return;
    }
    long maxX = Math.min(b - 1, n);
    double ad = (double) a;
    double bd = (double) b;
    pw.println(calc(ad, bd, maxX));
  }

  static long calc(double ad, double bd, long x) {
    return (long) Math.floor(ad * x / bd) - (long) ad * (long) Math.floor(x / bd);
  }
}
