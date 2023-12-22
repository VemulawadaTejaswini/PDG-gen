//package atcoder.beginnercontest.r176;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author pribic (Priyank Doshi)
 * @since 29/08/20
 */
public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int h, w, m;
      h = sc.nextInt();
      w = sc.nextInt();
      m = sc.nextInt();

      int[] ha = new int[h + 1];
      int[] wa = new int[w + 1];
      Set<Pair> bomb = new HashSet<>();
      for (int i = 0; i < m; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        bomb.add(new Pair(x, y));
        ha[x]++;
        wa[y]++;
      }
      int ans = -1;
      for (int i = 1; i <= h; i++) {
        for (int j = 1; j <= w; j++) {
          ans = Math.max(ans, bomb.contains(new Pair(i, j)) ? (ha[i] + wa[j] - 1) : (ha[i] + wa[j]));
        }
      }
      System.out.println(ans);
    }
  }

  static class Pair {
    int x, y;

    public Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Pair pair = (Pair) o;

      if (x != pair.x) return false;
      return y == pair.y;
    }

    @Override
    public int hashCode() {
      int result = x;
      result = 31 * result + y;
      return result;
    }
  }
}