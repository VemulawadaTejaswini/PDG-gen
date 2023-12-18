import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 public class abc084 {

 }

 */
public class Main {
  int max = (int) 1e5;

  public void solve() throws FileNotFoundException {
    InputStream inputStream = System.in;

    InputHelper in = new InputHelper(inputStream);

    // actual solution
    int q = in.readInteger();

    boolean[] isp = new boolean[max + 1];

    for (int i = 2; i <= max; i++) {
      isp[i] = true;
    }

    for (int i = 2; i <= max; i++) {
      if (isp[i]) {
        for (int j = 2 * i; j <= max; j += i) {
          isp[j] = false;
        }
      }
    }

    int[] cum = new int[max + 1];

    cum[1] = 0;
    for (int i = 2; i <= max; i++) {
      if (i % 2 == 1)
        cum[i] = cum[i - 1] + ((isp[i] && isp[(i + 1) / 2]) ? 1 : 0);
      else
        cum[i] = cum[i - 1];
    }

    while (q-- > 0) {
      int l = in.readInteger();
      int r = in.readInteger();

      System.out.println(cum[r] - cum[l - 1]);
    }
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
