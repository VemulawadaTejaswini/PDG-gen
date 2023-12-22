import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long n = Long.parseLong(sc.next());
    int x = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    long ans = x;
    AnswerCache[] aToAnsCache = new AnswerCache[m];
    int count = 1;
    int a = x;
    aToAnsCache[a] = new AnswerCache(a, count, ans);
    boolean loopDetected = false;
    for (long i = 2; i <= n; i++) {
      a = (int) (((long) a * a) % m);
      count++;
      if (a == 0) {
        break;
      }
      if (!loopDetected && aToAnsCache[a] != null) {
        loopDetected = true;
        AnswerCache cache = aToAnsCache[a];
        int loopLength = count - cache.count;
        long remain = n - i;
        long loopCount = remain / loopLength;
        ans += (ans - cache.ans) * loopCount;
        ans += a;
        i += loopCount * loopLength;
        continue;
      } else {
        aToAnsCache[a] = new AnswerCache(a, count, ans);
        ans += a;
      }
    }
    pw.println(ans);
  }

  static class AnswerCache {

    int a;
    int count;
    long ans;

    AnswerCache(int a, int count, long ans) {
      this.a = a;
      this.count = count;
      this.ans = ans;
    }

    @Override
    public String toString() {
      return "AnswerCache{" +
        "a=" + a +
        ", count=" + count +
        ", ans=" + ans +
        '}';
    }
  }
}
