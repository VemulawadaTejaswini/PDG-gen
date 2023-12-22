import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    Map<String, AtomicInteger> answers = new LinkedHashMap<>();
    answers.put("AC", new AtomicInteger(0));
    answers.put("WA", new AtomicInteger(0));
    answers.put("TLE", new AtomicInteger(0));
    answers.put("RE", new AtomicInteger(0));
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      answers.get(s).incrementAndGet();
    }
    answers.entrySet().forEach(
      e -> {
        pw.println(e.getKey() + " x " + e.getValue());
      }
    );
  }
}
