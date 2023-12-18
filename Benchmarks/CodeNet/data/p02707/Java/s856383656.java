import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

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
    C solver = new C();
    solver.solve(1, in, out);
    out.close();
  }

  static class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int N = in.nextInt();
      List<Integer> list = new ArrayList<>();

      for (int i = 1; i < N; i++) {
        list.add(in.nextInt());
      }

      for (int i = 1; i <= N; i++) {
        int finalI = i;
        List<Integer> res = list.stream().filter(l -> finalI == l).collect(Collectors.toList());
        out.print(res.size() + "\n");

        if (res.size() == 0) break;
      }
    }

  }
}

