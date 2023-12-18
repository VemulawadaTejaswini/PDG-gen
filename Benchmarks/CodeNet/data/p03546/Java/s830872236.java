import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 public class abc079d {

 }

 */
public class Main {
  public void solve() throws FileNotFoundException {
    InputStream inputStream = System.in;

    InputHelper in = new InputHelper(inputStream);

    // actual solution
    int h = in.readInteger();
    int w = in.readInteger();

    int[][] c = new int[10][10];

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        c[i][j] = in.readInteger();
      }
    }

    for (int k = 0; k < 10; k++) {
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          c[i][j] = Math.min(c[i][j], c[i][k] + c[k][j]);
        }
      }
    }

    long ans = 0;

    int[][] a = new int[h][w];

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        a[i][j] = in.readInteger();

        if (a[i][j] != -1 && a[i][j] != 1) {
          ans += c[a[i][j]][1];
        }
      }
    }

    System.out.println(ans);
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
