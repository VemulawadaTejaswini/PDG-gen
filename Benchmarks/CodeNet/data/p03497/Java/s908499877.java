import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/*
 public class arc086a {

 }

 */
public class Main {
  class a {
    int num;
    int cnt;

    /**
     * @param num
     * @param cnt
     */
    public a(int num, int cnt) {
      super();
      this.num = num;
      this.cnt = cnt;
    }


  }

  public void solve() throws FileNotFoundException {
    InputStream inputStream = System.in;

    InputHelper in = new InputHelper(inputStream);

    // actual solution
    int n = in.readInteger();
    int k = in.readInteger();

    int[] a = new int[n];

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < n; i++) {
      a[i] = in.readInteger();
      map.put(a[i], map.getOrDefault(a[i], 0) + 1);
    }

    List<a> al = new ArrayList<a>();

    for (Integer key : map.keySet()) {
      al.add(new a(key, map.get(key)));
    }

    al.sort((a1, a2) -> a1.cnt - a2.cnt);

    if (al.size() <= k) {
      System.out.println("0");
      return;
    }

    int ans = 0;
    for (int i = 0; i < al.size() - k; i++) {
      ans += al.get(i).cnt;
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
