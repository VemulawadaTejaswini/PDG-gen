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
    String s = sc.next();
    Set<String> company = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      company.add(String.valueOf(s.charAt(i)));
    }
    pw.println(company.size() >= 2 ? "Yes" : "No");
  }
}
