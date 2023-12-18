import java.io.*;
import java.util.*;

class BinaryIndexedTree {
  private final int n;
  private final int[] values;
  
  BinaryIndexedTree(int n) {
    this.n = n;
    this.values = new int[n + 1];
  }
  
  public int sum(int index) {
    int value = 0;
    while (index > 0) {
      value += values[index];
      index -= index & -index;
    }
    return value;
  }
  
  public void add(int index, int value) {
    while (index <= n) {
      values[index] += value;
      index += index & -index;
    }
  }
}

class DI implements Comparable<DI> {
  final double d;
  final int i;
  
  DI(double d, int i) {
    this.d = d;
    this.i = i;
  }
  
  public int compareTo(DI di) {
    return Double.compare(this.d, di.d);
  }
}

class SubSolver {
  final int n;
  final double[] as, bs, cs;
  int[] tangentRanks;
  
  
  SubSolver(int n, double[] as, double[] bs, double[] cs) {
    this.n = n;
    this.as = as;
    this.bs = bs;
    this.cs = cs;
  }
  
  // ax + by = c
  // y = -(a/b) x + c/b
  private void setUpTangentRanks() {
    DI[] dis = new DI[n];
    for (int i = 0; i < n; i++) {
      dis[i] = new DI(-1.0 * as[i] / bs[i], i);
//      System.err.printf("%d: %f\n", i, -1.0 * as[i] / bs[i]);
    }
    Arrays.sort(dis);
    
    tangentRanks = new int[n];
    for (int i = 0; i < n; i++) {
      tangentRanks[dis[i].i] = i + 1;
    }
    
    /*
    for (int i = 0; i < n; i++) {
      System.err.printf("%d: %d\n", i, tangentRanks[i]);
    }
    */
  }
  
  private long count(double x) {
//    System.err.printf("Count: %f\n", x);
    DI[] dis = new DI[n];
    for (int i = 0; i < n; i++) {
      dis[i] = new DI((cs[i] - as[i] * x) / bs[i], i);
//      System.err.printf("%d: %f\n", i, dis[i].d);
    }
    Arrays.sort(dis);
    
    int[] xTangentRanks = new int[n];
    for (int i = 0; i < n; i++) {
      xTangentRanks[i] = tangentRanks[dis[i].i];
//      System.err.printf("%d, ", xTangentRanks[i]);
    }
//    System.err.println();
    
    BinaryIndexedTree binaryIndexedTree = new BinaryIndexedTree(n);
    long answer = 0;
    for (int i = 0; i < n; i++) {
      int v = xTangentRanks[i];
      binaryIndexedTree.add(v, 1);
      answer += i + 1 - binaryIndexedTree.sum(v);
    }
    
    return answer;
  }
  
  public double solve() {
    setUpTangentRanks();
    
    long longN = n;
    long targetCount = (longN * (longN - 1) / 2 + 2) / 2;
//    System.err.printf("Target count: %d\n", targetCount);
    double minX = -1e12;
    double maxX = 1e12;
    for (int i = 0; i < 128; i++) {
      double midX = (minX + maxX) / 2;
      long c = count(midX);
//      System.err.printf("%f %f %f %d\n", minX, maxX, midX, c);
      if (c < targetCount) {
        maxX = midX;
      } else {
        minX = midX;
      }
    }
    
    return maxX;
  }
}

class Solver {
  final int n;
  final double[] as, bs, cs;
  
  Solver(int n, double[] as, double[] bs, double[] cs) {
    this.n = n;
    this.as = as;
    this.bs = bs;
    this.cs = cs;
  }
  
  public String solve() {
    double x = new SubSolver(n, as, bs, cs).solve();
    double y = new SubSolver(n, bs, as, cs).solve();
    return String.format("%.20f %.20f", x, y);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    double[] as = new double[n];
    double[] bs = new double[n];
    double[] cs = new double[n];
    for (int i = 0; i < n; i++) {
      as[i] = reader.nextInt();
      bs[i] = reader.nextInt();
      cs[i] = reader.nextInt();
    }
    out.println(new Solver(n, as, bs, cs).solve());
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
