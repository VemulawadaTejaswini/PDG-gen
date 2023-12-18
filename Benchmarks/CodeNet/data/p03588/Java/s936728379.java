import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
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
    Tenka1PCB2017B solver = new Tenka1PCB2017B();
    solver.solve(1, in, out);
    out.close();
  }

  static class Tenka1PCB2017B {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      Pair[] p = new Pair[n];
      for (int i = 0; i < n; i++) {
        int a = in.nextInt();
        int b = in.nextInt();
        p[i] = new Pair(a, b);
      }

      Arrays.sort(p);

      System.out.println(p[n - 1].x + p[n - 1].y);

    }

  }

  static class Pair implements Comparable<Pair> {

    int x;
    int y;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int compareTo(Pair p) {
      return Integer.compare(this.x, p.x) * 2 + Integer.compare(this.y, p.y);
    }

  }
}

