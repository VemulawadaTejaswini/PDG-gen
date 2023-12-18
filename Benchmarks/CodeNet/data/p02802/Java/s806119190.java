import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    ResultCount count = new ResultCount();
    for (int i = 0; i < m; i++) {
      int p = Integer.parseInt(sc.next());
      Result s = Result.ofString(sc.next());
      count.add(p, s);
    }
    pw.print(count.acCount());
    pw.print(" ");
    pw.println(count.waCount());
  }

  static class ResultCount {

    Map<Integer, Result> resultMap = new HashMap<>();
    Map<Integer, AtomicInteger> waCount = new HashMap<>();

    void add(int p, Result result) {
      if (isAC(p)) {
        return;
      }
      if (result == Result.AC) {
        resultMap.put(p, result);
        return;
      }
      waCount.computeIfAbsent(p, i -> new AtomicInteger(0)).incrementAndGet();
    }

    boolean isAC(int p) {
      return resultMap.get(p) == Result.AC;
    }

    int acCount() {
      return (int) resultMap.values().stream().filter(r -> r == Result.AC).count();
    }

    int waCount() {
      return waCount.entrySet()
        .stream()
        .filter(e -> isAC(e.getKey()))
        .map(Entry::getValue)
        .mapToInt(AtomicInteger::get)
        .sum();
    }
  }

  enum Result {
    AC() {
      @Override
      Result add(Result a) {
        return AC;
      }
    },
    WA() {
      @Override
      Result add(Result a) {
        if (a == AC) {
          return AC;
        }
        return WA;
      }
    };

    static Result ofString(String s) {
      if (s.equals("AC")) {
        return AC;
      }
      return WA;
    }

    abstract Result add(Result a);
  }
}
