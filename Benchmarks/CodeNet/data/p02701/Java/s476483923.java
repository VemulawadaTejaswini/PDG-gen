import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    Set<String> ans = new HashSet<>();
    for (int i = 0; i < n; i++) {
      ans.add(sc.next());
    }
    pw.println(ans.size());
  }
}
