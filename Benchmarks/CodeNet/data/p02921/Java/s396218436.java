import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    char[] forecast = sc.next().toCharArray();
    char[] real = sc.next().toCharArray();
    int count = 0;
    for (int i = 0; i < forecast.length; i++) {
      if (forecast[i] == real[i]) {
        count++;
      }
    }
    pw.println(count);
  }
}
