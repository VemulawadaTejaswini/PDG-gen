import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
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
    CGrandGarden solver = new CGrandGarden();
    solver.solve(1, in, out);
    out.close();
  }

  static class CGrandGarden {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      ArrayList<Integer> a = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        a.add(in.nextInt());
      }

      out.println(func(a));

    }

    int func(ArrayList<Integer> a) {
      // a.forEach(x -> System.out.print(x + " "));

      if (a.size() == 0) {
        return 0;
      }

      int res = 0;

      while (!a.contains(0)) {
        res++;
        for (int i = 0; i < a.size(); i++) {
          a.set(i, a.get(i) - 1);
        }
      }

      ArrayList<Integer> b = new ArrayList<>();
      for (int i = 0; i < a.size(); i++) {
        if (a.get(i) != 0) {
          b.add(a.get(i));
        } else {
          res += func(b);
          b.clear();
        }
      }
      res += func(b);
      return res;
    }

  }
}

