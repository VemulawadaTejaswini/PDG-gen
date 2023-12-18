import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    String s = sc.next();

    os.println(search(s));

  }

  private static int search(String s) {

    s = s.replace("BC", "D");

    int n = s.length();

    int sum = 0;
    for (int j = 0; j < n; j++) {

      // for each, find A
      // found A
      if (s.charAt(j) != 'A') continue;

      int dCount = 0;
      int i = j;
      while (i < n) {
        if (s.charAt(i) == 'A') {
          i++;
        } else if (s.charAt(i) == 'D') {
          dCount++;
          i++;
        } else {
          break;
        }
      }
      sum += dCount;
    }
    return sum;
  }
}