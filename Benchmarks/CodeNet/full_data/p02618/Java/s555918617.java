import java.util.*;
import java.io.*;

public class Main {
  static int len;

  // https://atcoder.jp/contests/intro-heuristics/tasks/intro_heuristics_a
  public static void main(String[] args) throws IOException {
    sc = new MScanner(System.in);
    pw = new PrintWriter(System.out);
    // height: index
    len = sc.nextInt();
    int[] c = sc.intArr(26);
    int[][] s = new int[len][26];
    for (int i = 0; i < len; i++) {
      s[i] = sc.intArr(26);
    }

    int[] answer = new int[len];
    int Gain = 0;
    int[] last = new int[26];
    Arrays.fill(last, 0);
    for (int day = 0; day < len; day++) {
      int ch = choose();
      answer[day] = ch;
      last[ch] = day;
      Gain += c[ch];
      Gain -= lost(day, last, s[day]);
    }

    for (int a : answer) {
      pw.println(a);
    }
    pw.flush();

    // sc.close();
    // pw.println(cnt);
    // pw.flush();
  }

  // assume no overflow
  static int lost(int cur, int[] last, int[] params) {
    assert params.length == 26;
    int total = 0;
    for (int i = 0; i < 26; i++) {
      total += (cur - last[i]) * params[i];
    }
    return total;
  }

  static int choose() {
    return 1;
  }

  static PrintWriter pw;
  static MScanner sc;

  static class MScanner {
    StringTokenizer st;
    BufferedReader br;

    public MScanner(InputStream system) {
      br = new BufferedReader(new InputStreamReader(system));
    }

    public MScanner(String file) throws Exception {
      br = new BufferedReader(new FileReader(file));
    }

    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
      return st.nextToken();
    }

    public int[] intArr(int n) throws IOException {
      int[] in = new int[n];
      for (int i = 0; i < n; i++) in[i] = nextInt();
      return in;
    }

    public long[] longArr(int n) throws IOException {
      long[] in = new long[n];
      for (int i = 0; i < n; i++) in[i] = nextLong();
      return in;
    }

    public int[] intSortedArr(int n) throws IOException {
      int[] in = new int[n];
      for (int i = 0; i < n; i++) in[i] = nextInt();
      shuffle(in);
      Arrays.sort(in);
      return in;
    }

    public long[] longSortedArr(int n) throws IOException {
      long[] in = new long[n];
      for (int i = 0; i < n; i++) in[i] = nextLong();
      shuffle(in);
      Arrays.sort(in);
      return in;
    }

    public Integer[] IntegerArr(int n) throws IOException {
      Integer[] in = new Integer[n];
      for (int i = 0; i < n; i++) in[i] = nextInt();
      return in;
    }

    public Long[] LongArr(int n) throws IOException {
      Long[] in = new Long[n];
      for (int i = 0; i < n; i++) in[i] = nextLong();
      return in;
    }

    public String nextLine() throws IOException {
      return br.readLine();
    }

    public int nextInt() throws IOException {
      return Integer.parseInt(next());
    }

    public double nextDouble() throws IOException {
      return Double.parseDouble(next());
    }

    public char nextChar() throws IOException {
      return next().charAt(0);
    }

    public long nextLong() throws IOException {
      return Long.parseLong(next());
    }

    public boolean ready() throws IOException {
      return br.ready();
    }

    public void waitForInput() throws InterruptedException {
      Thread.sleep(3000);
    }
  }

  static void shuffle(int[] in) {
    for (int i = 0; i < in.length; i++) {
      int idx = (int) (Math.random() * in.length);
      int tmp = in[i];
      in[i] = in[idx];
      in[idx] = tmp;
    }
  }

  static void shuffle(long[] in) {
    for (int i = 0; i < in.length; i++) {
      int idx = (int) (Math.random() * in.length);
      long tmp = in[i];
      in[i] = in[idx];
      in[idx] = tmp;
    }
  }
}
