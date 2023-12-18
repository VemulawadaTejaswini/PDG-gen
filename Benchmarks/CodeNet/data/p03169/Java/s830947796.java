import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final int[] as;
  double[][][] table;
  
  Solver(int n, int[] as) {
    this.n = n;
    this.as = as;
  }
  
  private double solve(int dishWith3, int dishWith2, int dishWith1) {
    if (dishWith3 == 0 &&dishWith2 == 0 &&dishWith1 == 0) {
      return 0.0;
    }
    if (table[dishWith3][dishWith2][dishWith1] >= 0.0) {
      return table[dishWith3][dishWith2][dishWith1];
    }
    double dishWithNonEmpty = dishWith3 + dishWith2 + dishWith1;
    // 1.0 + (1.0 - dishWithNonEmpty / n) + (1.0 - dishWithNonEmpty / n)^2 + (1.0 - dishWithNonEmpty / n)^3 + ...
    table[dishWith3][dishWith2][dishWith1] = (double)n / dishWithNonEmpty;
    if (dishWith3 > 0) {
      table[dishWith3][dishWith2][dishWith1] += (double)dishWith3 * solve(dishWith3 - 1, dishWith2 + 1, dishWith1) / dishWithNonEmpty;
    }
    if (dishWith2 > 0) {
      table[dishWith3][dishWith2][dishWith1] += (double)dishWith2 * solve(dishWith3, dishWith2 - 1, dishWith1 + 1) / dishWithNonEmpty;
    }
    if (dishWith1 > 0) {
      table[dishWith3][dishWith2][dishWith1] += (double)dishWith1 * solve(dishWith3, dishWith2, dishWith1 - 1) / dishWithNonEmpty;
    }
    return table[dishWith3][dishWith2][dishWith1];
  }
  
  public double solve() {
    table = new double[n + 1][n + 1][n + 1];
    for (double[][] t1 : table) {
      for (double[] t2 : t1) {
        Arrays.fill(t2, -1.0);
      }
    }
    int[] counts = new int[4];
    for (int a : as) {
      counts[a]++;
    }
    return solve(counts[3], counts[2], counts[1]);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] as = reader.nextInt(n);
    out.printf("%.20f\n", new Solver(n, as).solve());
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
  
  public char nextChar() {
    return next().charAt(0);
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
  
  public char[] nextChar(int n) {
    char[] array = new char[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextChar();
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
  
  public char[][] nextChar(int n, int m) {
    char[][] matrix = new char[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextChar();
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
