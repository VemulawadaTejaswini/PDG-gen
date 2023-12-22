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
    int n = Integer.parseInt(sc.next());
    BigInteger ans = BigInteger.valueOf(1);
    BigInteger border = BigInteger.valueOf(10).pow(18);
    try {
      for (int i = 0; i < n; i++) {
        ans = ans.multiply(BigInteger.valueOf(Integer.parseInt(sc.next())));
        if (ans.compareTo(border) > 0) {
          pw.println(-1);
          return;
        }
      }
      pw.println(ans);
    } catch (RuntimeException e) {
      pw.println(-1);
    }
  }
}
