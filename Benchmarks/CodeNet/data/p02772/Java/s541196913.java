import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    boolean approved = true;
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(sc.next());
      approved = approved && isApproved(a);
      if (!approved) {
        break;
      }
    }
    pw.println(approved ? "APPROVED" : "DENIED");
  }

  static boolean isApproved(int a) {
    if (a % 2 == 1) {
      return true;
    }
    return a % 3 == 0 || a % 5 == 0;
  }
}
