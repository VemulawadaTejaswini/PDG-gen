import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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

  private static int getIndex(int[] p, List<List<Integer>> perms) {
    int ans = 0;
    for (int i = 0; i < perms.size(); i++) {
      boolean match = true;
      List<Integer> perm = perms.get(i);
      for (int j = 0; j < p.length; j++) {
        if (p[j] != perm.get(j)) {
          match = false;
          break;
        }
      }
      if (match) {
        ans = i;
        break;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] p = sc.nextIntArray(n);
    int[] q = sc.nextIntArray(n);
    List<List<Integer>> perms = new ArrayList<>();
    List<List<Integer>> nextPerms = new ArrayList<>();
    perms.add(new ArrayList<Integer>());
    for (int i = 0; i < n; i++) {
      nextPerms.clear();
      for (List<Integer> perm : perms) {
        for (int j = 1; j <= n; j++) {
          if (perm.contains(j)) continue;
          List<Integer> pm = new ArrayList<>();
          pm.addAll(perm);
          pm.add(j);
          nextPerms.add(pm);
        }
      }
      perms.clear();
      perms.addAll(nextPerms);
    }
    int a = getIndex(p, perms);
    int b = getIndex(q, perms);
    System.out.println((int) Math.abs(a - b));
  }
}