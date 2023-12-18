import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
    AGC034KenKenRace solver = new AGC034KenKenRace();
    solver.solve(1, in, out);
    out.close();
  }

  static class AGC034KenKenRace {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      // A < B < C < D のときは簡単で,Bから先にジャンプさせればいい
      // A < C < B < D でも同じ
      // A < B < D < C が面倒で,追い越さなければいけない
      // 追い越しは...と3連続が存在する必要があり,Bはこれの真ん中より手前であればいい.
      int n = in.nextInt();
      int a = in.nextInt() - 1;
      int b = in.nextInt() - 1;
      int c = in.nextInt() - 1;
      int d = in.nextInt() - 1;
      char[] s = in.next().toCharArray();
      boolean flagA = isReachable(s, a, c);
      boolean flagB = isReachable(s, b, d);
      boolean res = flagA && flagB;
      if (d < c) {
        res &= isOikoshiable(s, b, d);
      }

      out.println(res ? "Yes" : "No");

    }

    private boolean isReachable(char[] s, int from, int to) {
      int now = from;
      while (true) {
        if (s[now + 2] == '.') {
          now += 2;
        } else if (s[now + 1] == '.') {
          now += 1;
        } else {
          break;
        }
        if (now == to - 1 || now == to - 2) {
          return true;
        }
      }
      return false;
    }

    private boolean isOikoshiable(char[] s, int b, int d) {
      // b-1からdの1個手前までのいずれかから3連続で.があればよい
      for (int i = b + 1; i < d + 1; i++) {
        if (s[i] == '.' && s[i - 1] == '.' && s[i - 2] == '.') {
          return true;
        }
      }
      return false;
    }

  }
}

