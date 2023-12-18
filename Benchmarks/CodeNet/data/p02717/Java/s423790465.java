import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    int z = Integer.parseInt(sc.next());
    pw.println(z + " " + x + " " + y);
  }
}
