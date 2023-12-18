import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    Map<StringCount, AtomicLong> count = new HashMap<>();
    for (int i = 0; i < n; i++) {
      StringCount string = toMap(sc.next());
      count.computeIfAbsent(string, k -> new AtomicLong()).incrementAndGet();
    }
    pw.println(
      count.entrySet().stream().mapToLong(e -> e.getValue().get()).filter(i -> i > 1).map(
        i -> i * (i - 1) / 2
      ).sum());
  }

  static StringCount toMap(String s) {
    int[] ans = new int[26];
    Map<Character, AtomicInteger> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int index = c - 97;
      ans[index] = ans[index] + 1;
    }
    return new StringCount(ans);
  }

  static class StringCount {

    int[] ans;

    StringCount(int[] ans) {
      this.ans = ans;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      StringCount that = (StringCount) o;
      return Arrays.equals(ans, that.ans);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(ans);
    }
  }
}
