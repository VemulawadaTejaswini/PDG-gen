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
    long maxIndex = n;
    if (b == 1) {
      pw.println(0);
      return;
    }
    if (n % b == 0) {
      maxIndex--;
    }
    double ad = (double) a;
    double bd = (double) b;
    pw.println(
      (long) Math.floor(ad * maxIndex / bd) - a * (long) Math.floor(maxIndex / bd)
    );
  }
}
