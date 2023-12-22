import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    B solver = new B();
    solver.solve(1, in, out);
    out.close();
  }

  static class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int A = in.nextInt();
      int B = in.nextInt();
      int H = in.nextInt();
      int M = in.nextInt();

      double angleA = (H * 60 + M) * Math.PI / 360;
      double angleB = (M * Math.PI) / 30;
      double C = A * A + B * B - (2 * A * B * Math.cos(Math.abs(angleA - angleB)));
      System.out.println(Math.sqrt(C));
    }

  }
}

