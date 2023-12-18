import java.io.*;
import java.util.*;

public class Main {
  private static InputReader in;
  private static PrintWriter out;

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out, true);

    int a = in.nextInt(), b= in.nextInt();
    if (a <= 0 && b >= 0) {
      out.println("Zero");
    } else if (a > 0 && b > 0) {
      out.println("Positive");
    } else {
      int terms = (b-a+1);
      out.println(terms%2 == 0 ? "Positive" : "Negative");
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
