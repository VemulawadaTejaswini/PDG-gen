import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    long a[] = new long[n + 1];
    for (int i = 0; i < n; i++) {
      a[i + 1] = Integer.parseInt(sc.next());
    }
    Map<Long, Indexes> lx = new HashMap<>();
    Map<Long, Indexes> rx = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      long l = i + a[i];
      long r = i - a[i];
      Integer iv = Integer.valueOf(i);
      lx.computeIfAbsent(l, k -> new Indexes()).add(iv);
      rx.computeIfAbsent(r, k -> new Indexes()).add(iv);
    }
    long ans = 0;
    for (Map.Entry<Long, Indexes> lEntry : lx.entrySet()) {
      Long k = lEntry.getKey();
      if (rx.containsKey(k)) {
        ans += lEntry.getValue().countMatches(rx.get(k));
      }
    }
    pw.println(ans);
  }

  static class Indexes {

    List<Integer> indexes;

    public Indexes() {
      indexes = new ArrayList<>();
    }

    void add(Integer i) {
      indexes.add(i);
    }

    int size() {
      return indexes.size();
    }


    long countMatches(Indexes other) {
      long ans = 0;
      for (Integer i : indexes) {
        int otherIndex = Collections.binarySearch(other.indexes, i);
        if (otherIndex >= 0) {
          ans += other.size() - otherIndex - 1;
        } else {
          ans += other.size() - (-otherIndex - 1);
        }
      }
      return ans;
    }
  }
}
