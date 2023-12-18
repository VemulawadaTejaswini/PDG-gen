import javax.swing.plaf.multi.MultiButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int r = sc.nextInt();
    int s = sc.nextInt();
    int p = sc.nextInt();
    String t = sc.next();
    int result = 0;
    Map<Character, Integer> scoreForAdversarial = new HashMap<>();
    scoreForAdversarial.put('r', p);
    scoreForAdversarial.put('s', r);
    scoreForAdversarial.put('p', s);
    for (int i = 0; i < k; i++) {
      int j = 0;
      while (i + k * j < n) {
        int count = 0;
        char initial = t.charAt(i + k * j);
        while (i + k * j < n && initial == t.charAt(i + k * j)) {
          count++;
          j++;
        }
        if (count % 2 == 0) {
          result += (count / 2) * scoreForAdversarial.get(initial);
        } else {
          result += ((count / 2) + 1) * scoreForAdversarial.get(initial);
        }
      }
    }
    System.out.println(result);
  }
}