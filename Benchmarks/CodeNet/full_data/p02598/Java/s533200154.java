import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    List<Integer> logs = new ArrayList<>();
    //PriorityQueue<Double> logs = new PriorityQueue<>(Comparator.reverseOrder());
    for (int i = 0; i < n; i++) {
      logs.add(Integer.parseInt(sc.next()));
    }
    Collections.sort(logs);
    if (k == 0) {
      pw.println(logs.get(logs.size() - 1));
      return;
    }
    int max = logs.get(logs.size() - 1);
    int l = 0;
    int r = max;
    while (r - l > 1) {
      int m = (l + r) / 2;
      int kCandidate = 0;
      for (int j = 0; j < n; j++) {
        int a = logs.get(j);
        kCandidate += Math.ceil((double) a / m) - 1;
      }
      if (k >= kCandidate) {
        r = m;
      } else {
        l = m;
      }
    }
    pw.println(r);
  }
}
