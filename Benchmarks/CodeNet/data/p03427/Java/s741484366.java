
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 public class agc021a {

 }

 */
public class Main{
  public void solve() throws FileNotFoundException {
    InputStream inputStream = System.in;

    InputHelper in = new InputHelper(inputStream);

    // actual solution
    long n = in.readLong();

    String ns = String.valueOf(n);

    int sz = ns.length();

    String s = "";

    for (int i = 0; i < sz; i++) {
      s += "9";
    }

    if (Long.valueOf(s) <= n) {
      System.out.println(9 * sz);
      return;
    } else {
      StringBuilder sb = new StringBuilder(s);
      for (int i = 8; i >= 1; i--) {
        sb.replace(0, 1, String.valueOf((char) (i + '0')));
        if (Long.valueOf(sb.toString()) <= n) {
          System.out.println((sz - 1) * 9 + i);
          return;
        }
      }
    }

    System.out.println((sz - 1) * 9);
    // end here
  }

  public static void main(String[] args) throws FileNotFoundException {
    (new Main()).solve();
  }

  class InputHelper {
    StringTokenizer tokenizer = null;
    private BufferedReader bufferedReader;

    public InputHelper(InputStream inputStream) {
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
      bufferedReader = new BufferedReader(inputStreamReader, 16384);
    }

    public String read() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          String line = bufferedReader.readLine();
          if (line == null) {
            return null;
          }
          tokenizer = new StringTokenizer(line);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

      return tokenizer.nextToken();
    }

    public Integer readInteger() {
      return Integer.parseInt(read());
    }

    public Long readLong() {
      return Long.parseLong(read());
    }
  }
}
