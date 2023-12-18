import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int k = Integer.parseInt(sc.next());
    Queue<Long> lunlunQueue = new LinkedList<>();
    for (int i = 1; i < 10; i++) {
      lunlunQueue.add(Long.valueOf(i));
    }
    long ans = 0;
    for (int i = 0; i < k; i++) {
      ans = nextLunlunBfs(lunlunQueue);
    }
    pw.println(ans);
  }

  static Long nextLunlunBfs(Queue<Long> lunlunQueue) {
    Long next = lunlunQueue.poll();
    long digit1 = next % 10;
    if (digit1 > 0) {
      lunlunQueue.add(next * 10 + digit1 - 1);
    }
    lunlunQueue.add(next * 10 + digit1);
    if (digit1 < 9) {
      lunlunQueue.add(next * 10 + digit1 + 1);
    }
    return next;
  }
}
