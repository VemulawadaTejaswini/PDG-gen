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
    for (int i = x; ; i++) {
      if (isPrime(i)) {
        pw.println(i);
        return;
      }
    }
  }

  static boolean isPrime(int i) {
    if (i == 1) {
      return false;
    }
    if (i == 2) {
      return true;
    }
    for (int j = 2; j < i / 2 + 1; j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }
}
