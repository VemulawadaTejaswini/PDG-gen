import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Set;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author koneko096
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    BTrickOrTreat solver = new BTrickOrTreat();
    solver.solve(1, in, out);
    out.close();
  }

  static class BTrickOrTreat {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      Set<Integer> S = new HashSet<>();

      int n = in.nextInt(), k = in.nextInt();
      for (int i = 0; i < k; i++) {
        int d = in.nextInt();
        for (int j = 0; j < d; j++) {
          S.add(in.nextInt());
        }
      }

      out.println(n - S.size());
    }

  }


  static class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
