import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 public class abc084b {

 }

 */
public class Main {
  public void solve() throws FileNotFoundException {
    InputStream inputStream = System.in;

    InputHelper in = new InputHelper(inputStream);

    // actual solution
    int a = in.readInteger();
    int b = in.readInteger();

    String s = in.read();

    if (s.charAt(a) != '-') {
      System.out.println("No");
      return;
    }

    for (int i = 0; i < a; i++) {
      if (!Character.isDigit(s.charAt(i))) {
        System.out.println("No");
        return;
      }
    }

    for (int i = a + 1; i < a + b + 1; i++) {
      if (!Character.isDigit(s.charAt(i))) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");
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
