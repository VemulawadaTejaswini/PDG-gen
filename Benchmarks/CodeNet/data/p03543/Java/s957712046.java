import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 public class abc079c {

 }

 */
public class Main {
  public void solve() throws FileNotFoundException {
    InputStream inputStream = System.in;

    InputHelper in = new InputHelper(inputStream);

    // actual solution
    String abcd = in.read();

    int[] a = new int[4];

    a[0] = abcd.charAt(0) - '0';
    a[1] = abcd.charAt(1) - '0';
    a[2] = abcd.charAt(2) - '0';
    a[3] = abcd.charAt(3) - '0';

    for (int i = 0; i < 8; i++) {
      int[] b = a.clone();
      for (int j = 0; j < 3; j++) {
        if ((i & (1 << j)) == 0) {
          b[3 - j] = -b[3 - j];
        }
      }

      if (sum(b) == 7) {
        StringBuilder ans = new StringBuilder();
        for (int j = 0; j < b.length; j++) {
          if (b[j] < 0) {
            ans.append('-');
          } else {
            if (j > 0) {
              ans.append('+');
            }
          }
          ans.append(Math.abs(b[j]));
        }
        ans.append("=7");
        System.out.println(ans.toString());
        break;
      }
    }

    // end here
  }

  int sum(int[] b) {
    int s = 0;
    for (int i = 0; i < b.length; i++) {
      s += b[i];
    }

    return s;
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
