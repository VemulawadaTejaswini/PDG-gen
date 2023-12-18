import java.io.*;
import java.util.*;

public class Main {
  private static InputReader in;
  private static PrintWriter out;

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out, true);

    int n = in.nextInt();
    long L = in.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) a[i] = in.nextInt();
    boolean ok = false;
    int start = -1;
    for (int i = 0; i+1 < n; i++) {
      if (a[i]+a[i+1] >= L) {
        ok = true;
        start = i;
        break;
      }
    }
    if (!ok) out.println("Impossible");
    else {
      out.println("Possible");
      for (int i = 0; i < start; i++) out.println(i+1);
      for (int i = n-2; i > start; i--) out.println(i+1);
      out.println(start+1);
    }
    
    out.close();
    System.exit(0);
  }

  static class InputReader {
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

    public int nextInt() {
      return Integer.parseInt(next());
    }
  }


}
