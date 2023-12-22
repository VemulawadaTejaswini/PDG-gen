import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
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
    int k = Integer.parseInt(sc.next());
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < k; i++) {
      int d = Integer.parseInt(sc.next());
      for (int j = 0; j < d; j++) {
        int s = Integer.parseInt(sc.next());
        map.computeIfAbsent(s, key -> new ArrayList<>()).add(j);
      }
    }
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      if (!map.containsKey(i)) {
        ans++;
      }
    }
    pw.println(ans);
  }
}
