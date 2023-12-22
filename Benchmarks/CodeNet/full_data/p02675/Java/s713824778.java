import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String n = sc.next();
    int n1 = Integer.valueOf(String.valueOf(n.charAt(n.length() - 1)));
    if (n1 == 3) {
      pw.println("bon");
    } else if (n1 == 0 || n1 == 1 || n1 == 6 || n1 == 8) {
      pw.println("pon");
    } else {
      pw.println("hon");
    }
  }
}
