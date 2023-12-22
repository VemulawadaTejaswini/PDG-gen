import javax.swing.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
  static class Pair {
    int num;
    int cut;

    Pair(int num, int cut) {
      this.num = num;
      this.cut = cut;
    }

    double getVal() {
      return -num / (double) cut;
    }
  }

  public static void main(String[] args) throws IOException {
    sc = new MScanner(System.in);
    pw = new PrintWriter(System.out);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] ps = sc.intArr(N);
    int[] cs = sc.intArr(N);
    // memo log2(k) * N
    int bit = 0;
    int xx = K;
    while (xx > 0) {
      bit++;
      xx = xx >> 1;
    }
    int[][] scores = new int[bit + 1][N + 1];
    // next into index from current index
    int[][] idx = new int[bit + 1][N + 1];
    for (int i = 0; i < N; i++) {
      idx[0][i + 1] = ps[i];
      scores[0][i + 1] = cs[i];
    }
    for (int b = 1; b < bit + 1; b++) {
      for (int i = 1; i < N + 1; i++) {
        idx[b][i] = idx[b - 1][idx[b - 1][i]];
        scores[b][i] = scores[b - 1][i] + scores[b - 1][idx[b - 1][i]];
      }
    }

    long max = 0;
    long res[] = new long[N + 1];
    // iter start position.
    for (int i = 1; i < N + 1; i++) {
      int cur = i;
      for (int b = bit; b > 0; b--) {
        if (((b << 1) & K) != 0) {
          res[i] += scores[b][cur];
          cur = idx[b][cur];
        }
      }
      max = Math.max(res[i], max);
    }

    pw.println(Arrays.deepToString(scores));
    pw.println(Arrays.deepToString(idx));
    // pw.println();
    pw.println(max);
    pw.flush();
    // System.out.println(cnt);
  }

  static long solve(long X, long D, long K) {
    if (K * D < X) {
      return (X - K * D);
    }
    long multiple = Math.floorDiv(X, D);
    long res = X - D * multiple;
    if (((K - multiple) & 1) == 0) {
      return (Math.min(res, Math.abs(res - 2 * D)));
    } else {
      return (Math.min(Math.abs(res - D), Math.abs(res + D)));
    }
  }

  /**
   * https://www.slideshare.net/hcpc_hokudai/binary-indexed-tree A space efficient version segment
   * tree. Usually for range sum. Or the required metric can be calulated in that:
   *
   * <p>right_metric = parant_metric - left_metric Only then, we can stop memoizing right_metric
   *
   * <p>The internal structure is a 1-base array, to simplify calculation of parent node's idx. lsb
   * = 3 & -3 = 2 (0x0011 & 0x1101 = 0x0001) lastParentOf3 = 3 - lsb = 2 curParentOf3 = 3 + lsb = 4
   */
  static class FenwickTree {
    private final long[] state;
    private final int size;

    FenwickTree(int size) {
      this.size = size;
      state = new long[size + 1];
    }

    @Override
    public String toString() {
      return Arrays.toString(state);
    }

    long queryRangeSumFromZeroTo(int idx) {
      long sum = 0;
      while (idx != 0) {
        sum += state[idx];
        idx -= (idx & -idx);
      }
      return sum;
    }

    /** @param val can be negative */
    void updateElement(int idx, long val) {
      while (idx <= size) {
        state[idx] += val;
        idx += (idx & -idx);
      }
    }
  }

  // sc.close();
  // pw.println(cnt);
  // pw.flush();

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
