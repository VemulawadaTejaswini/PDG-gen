import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    Set<String> oddExpectation = new HashSet<>(Arrays.asList("R", "U", "D"));
    Set<String> evenExpectation = new HashSet<>(Arrays.asList("L", "U", "D"));
    String s = sc.next();
    char[] sArray = s.toCharArray();
    boolean isYes = true;
    for (int i = 0; i < sArray.length; i++) {
      String c = String.valueOf(sArray[i]);
      if ((i + 1) % 2 == 0) {
        if (!evenExpectation.contains(c)) {
          isYes = false;
          break;
        }
      } else {
        if (!oddExpectation.contains(c)) {
          isYes = false;
          break;
        }
      }
    }
    pw.println(isYes ? "Yes" : "No");
  }
}
