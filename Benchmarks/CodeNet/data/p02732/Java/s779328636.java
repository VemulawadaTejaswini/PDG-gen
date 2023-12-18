import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    int count[] = new int[n + 1];
    Combination[] combinations = new Combination[n + 1];
    for (int i = 0; i < n; i++) {
      int ai = Integer.parseInt(sc.next());
      a[i] = ai;
      count[ai]++;
    }
    for (int i = 1; i < n + 1; i++) {
      int countI = count[i];
      if (countI == 0) {
        continue;
      }
      Combination c = new Combination();
      combinations[i] = c;
      if (countI == 1) {
        continue;
      }
      c.full = (long) countI * (countI - 1) / 2;
      if (countI == 2) {
        continue;
      }
      c.matchK = ((long) countI - 1) * (countI - 2) / 2;
    }
    long total = Arrays.stream(combinations)
      .filter(Objects::nonNull)
      .mapToLong(c -> c.full)
      .sum();
    for (int i = 0; i < n; i++) {
      int ak = a[i];
      Combination c = combinations[ak];
      pw.println(total - (c.full - c.matchK));
    }
  }

  static class Combination {

    long full;
    long matchK;
  }
}
