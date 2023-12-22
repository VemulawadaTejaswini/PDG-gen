import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class Pair {
  public int first;
  public int second;
}

public class Main {
  static public void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n, m;
    while ((n = s.nextInt()) != 0 && (m = s.nextInt()) != 0) {
      Pair[] pairs = new Pair[m];
      for (int j = 0; j < m; j++) {
        pairs[j] = new Pair();
        pairs[j].first = j + 1;
      }
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          pairs[j].second += s.nextInt();
        }
      }
      Arrays.sort(pairs, new Comparator<Pair>() {
        public int compare(Pair p1, Pair p2) {
          return p2.second - p1.second;
        }
      });
      for (int i = 0; i < m - 1; i++) {
        System.out.printf("%d ", pairs[i].first);
      }
      System.out.printf("%d\n", pairs[m - 1].first);
    }
  }
}