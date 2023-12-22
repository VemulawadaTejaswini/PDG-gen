import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long a = Long.parseLong(sc.next());
    BigDecimal d = new BigDecimal(sc.next());
    BigDecimal ans = d.multiply(BigDecimal.valueOf(a));
    pw.println(ans.longValue());
  }
}
