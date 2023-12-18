import java.io.*;
import java.util.*;

class Solver {
  // x1 <= x2
  // y1 <= y2
  final int x1, y1, x2, y2, n;
  final int[] xs, ys;
  
  private Solver(int x1, int y1, int x2, int y2, int n, int[] xs, int[] ys) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.n = n;
    this.xs = xs;
    this.ys = ys;
  }
  
  private static int flipIfNeeded(int v, boolean flip) {
    if (flip) {
      return 100_000_000 - v - 1;
    } else {
      return v;
    }
  }
  
  public static Solver createInstance(int x1, int y1, int x2, int y2, int n, int[][] xys) {
    boolean xFlip = x1 > x2;
    int normX1 = flipIfNeeded(x1, xFlip);
    int normX2 = flipIfNeeded(x2, xFlip);
    
    boolean yFlip = y1 > y2;
    int normY1 = flipIfNeeded(y1, yFlip);
    int normY2 = flipIfNeeded(y2, yFlip);
    
    int[] normXs = new int[n];
    int[] normYs = new int[n];
    for (int i = 0; i < n; i++) {
      normXs[i] = flipIfNeeded(xys[i][0], xFlip);
      normYs[i] = flipIfNeeded(xys[i][1], yFlip);
    }
    
    return new Solver(normX1, normY1, normX2, normY2, n, normXs, normYs);
  }
  
  private boolean existBetween(int a, int bMin, int bMax, int[] as, int[] bs) {
    for (int i = 0; i < n; i++) {
      if (as[i] == a && bMin < bs[i] && bs[i] < bMax) {
        return true;
      }
    }
    return false;
  }
  
  public double solve() {
    if (x1 == x2) {
      if (existBetween(x1, y1, y2, xs, ys)) {
        return 100.0 * (y2 - y1) + Math.PI * 10.0 - 20.0;
      }
      return 100.0 * (y2 - y1);
    }
    if (y1 == y2) {
      if (existBetween(y1, x1, x2, ys, xs)) {
        return 100.0 * (x2 - x1) + Math.PI * 10.0 - 20.0;
      }
      return 100.0 * (x2 - x1);
    }
    
    TreeMap<Integer, Integer> xToY = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      if (xs[i] < x1 || x2 < xs[i] || ys[i] < y1 || y2 < ys[i]) {
        continue;
      }
      xToY.put(xs[i], ys[i]);
    }
    
    TreeMap<Integer, Integer> yToCount = new TreeMap<>();
    yToCount.put(y1 - 1, 0);
    for (int y : xToY.values()) {
      int countForY = yToCount.lowerEntry(y).getValue() + 1;
      Integer existingHigherKey = yToCount.higherKey(y);
      if (existingHigherKey != null) {
        yToCount.remove(existingHigherKey);
      }
      yToCount.put(y, countForY);
    }
    int diffMin = Math.min(x2 - x1, y2 - y1);
    int maxCount = yToCount.lastEntry().getValue();
    if (maxCount < diffMin + 1) {
      return 100.0 * (x2 - x1) + 100.0 * (y2 - y1) + Math.PI * 5.0 * maxCount - 20.0 * maxCount;
    } else {
      return 100.0 * (x2 - x1) + 100.0 * (y2 - y1) + Math.PI * 5.0 * (maxCount + 1) - 20.0 * maxCount;
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int x1 = reader.nextInt();
    int y1 = reader.nextInt();
    int x2 = reader.nextInt();
    int y2 = reader.nextInt();
    int n = reader.nextInt();
    int[][] xys = reader.nextInt(n, 2);
    out.printf("%.20f\n", Solver.createInstance(x1, y1, x2, y2, n, xys).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }
  
  public int nextInt() {
    return Integer.parseInt(next());
  }
  
  public long nextLong() {
    return Long.parseLong(next());
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
  
  public String[] next(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextInt(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLong(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDouble(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public char[] nextCharArray() {
    return next().toCharArray();
  }
  
  public int[][] nextInt(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLong(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDouble(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
  
  public char[][] nextCharArray(int n) {
    char[][] matrix = new char[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = next().toCharArray();
    }
    return matrix;
  }
}
