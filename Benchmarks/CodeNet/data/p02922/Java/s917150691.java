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
    int t = 1;
    int count = 0;
    while (t < b) {
      count++;
      t = t - 1 + a;
    }
    pw.println(count);
  }
}
