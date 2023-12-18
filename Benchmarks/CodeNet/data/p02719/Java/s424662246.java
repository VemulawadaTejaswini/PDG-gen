import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    BigInteger n = new BigInteger(sc.next());
    BigInteger k = new BigInteger(sc.next());
    BigInteger mod = n.mod(k);
    pw.println(
      mod.min(mod.add(k.negate()).abs())
    );
  }
}
