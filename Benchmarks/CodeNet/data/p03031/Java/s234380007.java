import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      int[] nm = mapInt(in.readLine().split(" "));
      int N = nm[0];
      int M = nm[1];

      int[][] lp = new int[M][];
      for (int i = 0; i < M; i++) {
        lp[i] = mapInt(in.readLine().split(" "));
      }

      int[] p = mapInt(in.readLine().split(" "));

      int res = 0;
      for (int i = 0; i < (1 << N); i++) {
        int on = 0;
        for (int j = 0; j < M; j++) {
          int cnt = 0;
          for (int k = 1; k <= lp[j][0]; k++) {
            int d = lp[j][k] - 1;
            if(((i >> d) & 1) == 1) cnt++;
          }
          if((cnt % 2) == p[j]) on++;
        }
        if(on == M) res++;
      }

      final int ans = res;
      out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  int atoi(String s) { return Integer.parseInt(s); }
  long atol(String s) { return Long.parseLong(s); }
  int[] mapInt(String[] sa) {
    int[] ret = new int[sa.length];
    for (int i = 0; i < sa.length; i++) ret[i] = Integer.parseInt(sa[i]);
    return ret;
  }
  void mapInt(int[] ret, String[] sa) {
    for (int i = 0; i < sa.length; i++) ret[i] = Integer.parseInt(sa[i]);
  }
  long[] mapLong(String[] sa) {
    long[] ret = new long[sa.length];
    for (int i = 0; i < sa.length; i++) ret[i] = Long.parseLong(sa[i]);
    return ret;
  }
  void mapLong(long[] ret, String[] sa) {
    for (int i = 0; i < sa.length; i++) ret[i] = Long.parseLong(sa[i]);
  }
  boolean[] mapBool(String[] sa) {
    boolean[] ret = new boolean[sa.length];
    for(int i = 0; i < sa.length; i++) ret[i] = Integer.parseInt(sa[i]) == 1 ? true : false;
    return ret;
  }
}