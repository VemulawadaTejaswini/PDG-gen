import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

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
    String s = sc.next();
    int q = sc.nextInt();
    BitSet[] bitsets = new BitSet[26];
    for (int i = 0; i < 26; i++) {
      bitsets[i] = new BitSet(s.length());
    }
    for (int i = 0; i < s.length(); i++) {
      int codepoint = s.codePointAt(i) - 97;
      bitsets[codepoint].set(i, true);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < q; i++) {
      int type = sc.nextInt();
      if (type == 1) {
        int index = sc.nextInt() -  1;
        int ci = sc.next().codePointAt(0) - 97;
        int oi = s.codePointAt(index) - 97;
        if (oi == ci) continue;
        bitsets[oi].set(index, false);
        bitsets[ci].set(index, true);
      } else {
        int l = sc.nextInt() - 1;
        int r = sc.nextInt() - 1;
        int count = 0;
        for (int j = 0; j < 26; j++) {
          BitSet sub = bitsets[j].get(l, r + 1);
          count += sub.cardinality() > 0 ? 1 : 0;
        }
        if (sb.length() > 0) sb.append("\n");
        sb.append(count);
      }
    }
    System.out.println(sb.toString());
  }
}