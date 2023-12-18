import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    poorImplement(is, pw);
  }

  static void poorImplement(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    BigInteger p = BigInteger.valueOf(Integer.parseInt(sc.next()));
    String s = sc.next();
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n + 1; j++) {
        BigInteger v = new BigInteger(s.substring(i, j));
        if (v.remainder(p).equals(BigInteger.ZERO)) {
          count++;
        }
      }
    }
    pw.println(count);
  }
}
