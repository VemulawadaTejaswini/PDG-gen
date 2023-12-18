import java.io.*;
import java.util.*;

public class Main {
  private static String solve(long t1, long t2, long c1, long c2) {
//    System.err.printf("%d %d %d %d\n", t1, t2, c1, c2);
    long d1 = t1 * c1;
    long d2 = t2 * c2;
    // k * d1 - (k - 1) d2 > 0
    // k * d1 - k * d2 - d2 > 0
    // (d1 - d2) k > d2
    // k < d2 / (d2 - d1)
    if (d2 % (d2 - d1) == 0) {
      return String.format("%d", 2 * (d2 / (d2 - d1) - 1));
    } else {
      return String.format("%d", 2 * (d2 / (d2 - d1) - 1) + 1);
    }
  }
  
  private static String solve(long t1, long t2, long a1, long a2, long b1, long b2) {
//    System.err.println("1");
    if (t1 * a1 + t2 * a2 == t1 * b1 + t2 * b2) {
      return "infinity";
    }
    
//    System.err.println("1");
    long c1 = a1 - b1;
    long c2 = a2 - b2;
    if (c1 > 0 && c2 > 0) {
      return "0";
    }
    if (c1 < 0 && c2 < 0) {
      return "0";
    }
    if (t1 * c1 > 0 && (t1 * c1 + t2 * c2) > 0) {
      return "0";
    }
    if (t1 * c1 < 0 && (t1 * c1 + t2 * c2) < 0) {
      return "0";
    }
    
    return solve(t1, t2, Math.abs(c1), Math.abs(c2));
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    long t1 = reader.nextLong();
    long t2 = reader.nextLong();
    long a1 = reader.nextLong();
    long a2 = reader.nextLong();
    long b1 = reader.nextLong();
    long b2 = reader.nextLong();
    out.println(solve(t1, t2, a1, a2, b1, b2));
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
