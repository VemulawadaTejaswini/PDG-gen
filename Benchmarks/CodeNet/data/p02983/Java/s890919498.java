import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int l = Integer.parseInt(sc.next());
    int r = Integer.parseInt(sc.next());
    long min = Long.MAX_VALUE;
    long secondMin = Long.MIN_VALUE;
    for (int i = l; i <= r; i++) {
      int mod = i % 2019;
      if (mod < min) {
        secondMin = min;
        min = mod;
      } else if (mod < secondMin) {
        secondMin = mod;
      }
    }
    pw.println(min * secondMin);
  }
}
