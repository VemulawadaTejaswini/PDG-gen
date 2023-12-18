import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author dyominov
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    BKEYENCEString solver = new BKEYENCEString();
    solver.solve(1, in, out);
    out.close();
  }

  static class BKEYENCEString {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      String s = in.next();
      String key = "keyence";
      char[] arr = s.toCharArray();
      char[] arr2 = key.toCharArray();
      char[] res = new char[arr2.length];
      int index = 0;
      int count = 0;
      for (int i = 0; i < arr2.length && index < arr.length; ) {
        if (arr[index] == arr2[i]) {
          while (i < arr2.length && index < arr.length && arr[index] == arr2[i]) {
            res[i] = arr2[i];
            index++;
            i++;
          }
        } else {
          count++;
          while (index < arr.length && arr[index] != arr2[i]) {
            index++;
          }
        }
      }
      out.println(Arrays.equals(arr2, res) ? count <= 2 ? "YES" : "NO" : "NO");

    }

  }

  static class InputReader implements AutoCloseable {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public void close() {
    }

  }
}

