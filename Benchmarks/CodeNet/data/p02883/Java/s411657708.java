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
    EGluttony solver = new EGluttony();
    solver.solve(1, in, out);
    out.close();
  }

  static class EGluttony {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n;
      long k;
      n = in.nextInt();
      k = in.nextLong();

      ArrayList<Long> weak = new ArrayList<>();
      ArrayList<Long> cost = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        weak.add(in.nextLong());
      }
      for (int i = 0; i < n; i++) {
        cost.add(in.nextLong());
      }

      weak.sort(Comparator.naturalOrder());
      cost.sort(Comparator.reverseOrder());
      //　ここからk≦にできるかどうかの二分探索できるかみたいな感じでは
      // N log 10^18だから定数倍重めだけどできなくはなさそう
      out.println(binarySearch(weak, cost, k));
    }

    long binarySearch(ArrayList<Long> a, ArrayList<Long> b, long k) {
      long l = 0;
      long h = (long) 1e12;
      long m;
      while (l < h) {
        m = (l + h) / 2;
        // System.out.println(calc(a, b, m));
        if (calc(a, b, m) > k) {
          // 無理
          // System.out.println(m + " fail");
          l = m + 1;
        } else {
          // 出来た -> 上を固定する
          // System.out.println(m + " success");
          h = m;
        }
      }
      return l;
    }

    private long calc(ArrayList<Long> a, ArrayList<Long> b, long m) {
      long res = 0;
      for (int i = 0; i < a.size(); i++) {
        res += Math.max(0, a.get(i) - m / b.get(i));
      }
      return res;
    }

  }
}

