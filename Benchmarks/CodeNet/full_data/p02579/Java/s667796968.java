import java.io.*;
import java.util.*;

import static java.lang.Long.max;

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

  static int H;
  static int W;

  static int getId(int l, int r) {
    return l * H + r;
  }

  static int getId(int[] rr) {
    return rr[0] * H + rr[1];
  }

  static int[] toIdx(int id) {
    return new int[] {id / H, id % H};
  }

  static int getMap(int[][] map, int[] idx) {
    return map[idx[0]][idx[1]];
  }

  static void setMap(int[][] map, int[] idx, int val) {
    map[idx[0]][idx[1]] = val;
  }

  public static void main(String[] args) throws IOException {
    sc = new MScanner(System.in);
    pw = new PrintWriter(System.out);
    H = sc.nextInt();
    W = sc.nextInt();
    int C1 = sc.nextInt() - 1;
    int C2 = sc.nextInt() - 1;
    int D1 = sc.nextInt() - 1;
    int D2 = sc.nextInt() - 1;
    int[][] map = new int[H][W];
    int mark = 10000005;
    for (int i = 0; i < H; i++) {
      String input = sc.nextLine();
      int idx = 0;
      for (char ch : input.toCharArray()) {
        if (ch == '.') {
          map[i][idx] = -1;
        }
        if (ch == '#') {
          map[i][idx] = mark;
        }
        idx++;
      }
    }

    // double BFS?
    Queue<Integer> searchQueue = new LinkedList<>();
    Queue<Integer> warpQueue = new LinkedList<>();
    searchQueue.offer(getId(C1, C2));
    map[C1][C2] = 0;
    while (!searchQueue.isEmpty() || !warpQueue.isEmpty()) {
      while (!searchQueue.isEmpty()) {
        int id = searchQueue.poll();
        int[] idx = toIdx(id);
        int val = getMap(map, idx);
        int[] left = new int[] {idx[0], idx[1] - 1};
        // valid point
        if (left[1] >= 0) {
          if (getMap(map, left) < 0) {
            setMap(map, left, val);
            searchQueue.offer(getId(left));
          }
          if (getMap(map, left) == mark) {
            warpQueue.offer(id);
          }
        }
        int[] right = new int[] {idx[0], idx[1] + 1};
        // valid point
        if (right[1] < W) {
          if (getMap(map, right) < 0) {
            setMap(map, right, val);
            searchQueue.offer(getId(right));
          }
          if (getMap(map, right) == mark) {
            warpQueue.offer(id);
          }
        }

        int[] up = new int[] {idx[0] - 1, idx[1]};
        // valid point
        if (up[0] >= 0) {
          if (getMap(map, up) < 0) {
            setMap(map, up, val);
            searchQueue.offer(getId(up));
          }
          if (getMap(map, up) == mark) {
            warpQueue.offer(id);
          }
        }
        int[] down = new int[] {idx[0] + 1, idx[1]};
        // valid point
        if (down[0] < H) {
          if (getMap(map, down) < 0) {
            setMap(map, down, val);
            searchQueue.offer(getId(down));
          }
          if (getMap(map, down) == mark) {
            warpQueue.offer(id);
          }
        }
      }

      while (!warpQueue.isEmpty()) {
        int id = warpQueue.poll();
        int[] idx = toIdx(id);
        int val = getMap(map, idx);
        for (int r = -2; r < 3; r++) {
          for (int l = -3; l < 3; l++) {
            int row = idx[0] + r;
            int col = idx[1] + l;

            if (row < 0) continue;
            if (row >= H) continue;
            if (col < 0) continue;
            if (col >= W) continue;
            if (getMap(map, new int[] {row, col}) < 0) {
              setMap(map, new int[] {row, col}, val + 1);
              searchQueue.offer(getId(row, col));
            }
          }
        }
      }
    }

    pw.println(map[D1][D2]);
    // pw.println("end");
    // pw.println();

    pw.flush();
    // System.out.println(cnt);
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
