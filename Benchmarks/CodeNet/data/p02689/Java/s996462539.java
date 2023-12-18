import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
      int M = in.nextInt();
      Set<Integer> set = new HashSet<>();
      int[] h = new int[N];

      for (int i = 0; i < N; i++) {
        h[i] = in.nextInt();
      }

      for (int j = 0; j < M; j++) {
        int a = in.nextInt();
        int b = in.nextInt();

        if (h[a - 1] == h[b - 1]) {
          set.add(a);
          set.add(b);
        } else {
          set.add(h[a - 1] < h[b - 1] ? a : b);
        }
      }
      out.print(N - set.size());
    }

  }
}

