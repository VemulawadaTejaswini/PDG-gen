import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
    A solver = new A();
    solver.solve(1, in, out);
    out.close();
  }

  static class A {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      String N = in.next();
      if (N.endsWith("2") || N.endsWith("4") || N.endsWith("5") || N.endsWith("7") || N.endsWith("9")) {
        out.print("hon");
      } else if (N.endsWith("0") || N.endsWith("1") || N.endsWith("6") || N.endsWith("8")) {
        out.print("pon");
      } else {
        out.print("bon");
      }
    }

  }
}

