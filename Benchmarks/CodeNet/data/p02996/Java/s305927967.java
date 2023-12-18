import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    new Main().solve();
  }

  private void solve() {
    try(InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out)) {

      final int n = in.nextInt();
      List<Pear> task = new ArrayList<>(n);
      for (int i = 0; i < n; i++) {
        task.add(new Pear(in.nextInt(), in.nextInt()));
      }

      Collections.sort(task);
      // task.sort((a,b) -> a.compareTo(b));

      boolean isComp = true;
      int time = 0;
      for (Pear p : task) {
        time += p.c;
        if(time > p.l) {
          isComp = false;
          break;
        }
      }

      String ans = isComp ? "Yes" : "No";
      out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
  

  private class Pear implements Comparable<Pear>{
    public int c,l;
    Pear(int c, int l) {
      this.c = c;
      this.l = l;
    }

    @Override
    public int compareTo(Pear o) {
      if(this.l == o.l) return 0;
      return l > o.l ? 1 : -1;
    }
  }

  int atoi(String s) { return Integer.parseInt(s); }
  long atol(String s) { return Long.parseLong(s); }

  static class InputReader implements AutoCloseable {
    public BufferedReader br;
    public StringTokenizer st;

    public InputReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream), 32768);
      st = null;
    }
    public String next() {
      if (st == null || !st.hasMoreTokens()) {
        try { st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      }
      return st.nextToken();
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public long nextLong() { return Long.parseLong(next()); }
    int[] mapInt(int len) {
      int[] ret = new int[len];
      for (int i = 0; i < len; i++) ret[i] = Integer.parseInt(next());
      return ret;
    }
    long[] mapLong(int len) {
      long[] ret = new long[len];
      for (int i = 0; i < len; i++) ret[i] = Long.parseLong(next());
      return ret;
    }
    @Override public void close() throws IOException { br.close(); }
  }
}