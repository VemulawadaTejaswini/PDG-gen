import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
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
    EActiveInfants solver = new EActiveInfants();
    solver.solve(1, in, out);
    out.close();
  }

  static class EActiveInfants {
    private long[][] dp = new long[4001][2001];

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();

      List<Pair<Long, Long>> L = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        L.add(Pair.of((long) in.nextInt(), (long) i));
      }

      Collections.sort(L, Comparator.reverseOrder());

      for (long[] row : dp) {
        Arrays.fill(row, -1);
      }

      dp[0][0] = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (dp[i][j] == -1)
            continue;

          long act = L.get(i).getKey(), idx = L.get(i).getValue();
          int l = n - 1 - (i - j);
          int r = j;

          long lVal = act * Math.abs(l - idx);
          long rVal = act * Math.abs(r - idx);
          dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + lVal);
          dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + rVal);
        }
      }

      long ans = 0;
      for (int i = 0; i < n; i++) {
        ans = Math.max(ans, dp[n][i]);
      }
      out.println(ans);
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


  static class Pair<K extends Comparable<K>, V extends Comparable<V>>
      implements Comparable<Pair<K, V>> {
    private K key;
    private V value;

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

    public static <K extends Comparable<K>, V extends Comparable<V>> Pair<K, V> of(K key, V value) {
      return new Pair<K, V>(key, value);
    }

    private Pair(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public String toString() {
      return key + "=" + value;
    }

    public int hashCode() {
      // name's hashCode is multiplied by an arbitrary prime number (13)
      // in order to make sure there is a difference in the hashCode between
      // these two parameters:
      //  name: a  value: aa
      //  name: aa value: a
      return key.hashCode() * 13 + (value == null ? 0 : value.hashCode());
    }

    public boolean equals(Object o) {
      if (this == o)
        return true;
      if (o instanceof Pair) {
        Pair pair = (Pair) o;
        if (key != null ? !key.equals(pair.key) : pair.key != null)
          return false;
        if (value != null ? !value.equals(pair.value) : pair.value != null)
          return false;
        return true;
      }
      return false;
    }

    public int compareTo(Pair<K, V> o) {
      if (this == o)
        return 0;
      int cmp = key.compareTo(o.getKey());
      if (cmp != 0)
        return cmp;
      return value.compareTo(o.getValue());
    }

  }
}

