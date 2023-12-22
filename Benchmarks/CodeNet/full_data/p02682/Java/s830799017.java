import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int remainK = k;

    int numA = Math.min(remainK, a);
    int ans = 0;
    ans += numA;
    remainK -= numA;
    if (remainK == 0) {
      pw.println(ans);
      return;
    }
    int numB = Math.min(remainK, b);
    remainK -= numB;
    if (remainK == 0) {
      pw.println(ans);
      return;
    }
    ans -= remainK;
    pw.println(ans);
  }
}
