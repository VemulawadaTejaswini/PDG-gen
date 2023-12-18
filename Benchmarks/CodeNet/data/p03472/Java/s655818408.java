import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DKatanaThrower solver = new DKatanaThrower();
    solver.solve(1, in, out);
    out.close();
  }

  static class DKatanaThrower {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int h = in.nextInt();
      ArrayList<Pair<Integer, Integer>> p = new ArrayList<>();
      int swing = 0;
      int res = 0;
      // まず振る刀は最も強いものだけを使う
      // 投げる刀は振る刀よりも強いものを強いものから順に使う
      // 投げ終わったら振る
      //
      for (int i = 0; i < n; i++) {
        p.add(new Pair<>(in.nextInt(), in.nextInt()));
      }

      p.sort(Comparator.comparing(a -> -1 * a.getY()));

      for (int i = 0; i < n; i++) {
        swing = Math.max(swing, p.get(i).getX());
      }

      for (int i = 0; i < n; i++) {
        int pitch = p.get(i).getY();
        if (pitch <= swing) {
          break;
        }
        h -= pitch;
        res++;
        if (h <= 0) {
          break;
        }
      }

      if (h > 0) {
        res += (h + swing - 1) / swing;
      }

      out.println(res);
    }

  }

  static class Pair<T, U> {

    private T x;
    private U y;

    public Pair(T t, U u) {
      this.x = t;
      this.y = u;
    }

    public T getX() {
      return x;
    }

    public U getY() {
      return y;
    }

    public String toString() {
      return this.x.toString() + " " + this.y.toString();
    }

  }
}

