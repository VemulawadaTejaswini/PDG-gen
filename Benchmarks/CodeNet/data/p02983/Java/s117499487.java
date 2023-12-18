import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int l = Integer.parseInt(sc.next());
    int r = Integer.parseInt(sc.next());
    SortedSet<Integer> mods = new TreeSet<>();
    int min = Integer.MAX_VALUE;
    for (int i = l; i <= r; i++) {
      int mod = i % 2019;
      if (mod == 0) {
        pw.println(0);
        return;
      }
      int calc = mods.stream().mapToInt(m -> (m * mod) % 2019).min().orElse(Integer.MAX_VALUE);
      min = Math.min(calc, min);
      mods.add(mod);
    }
    pw.println(min);
  }
}
