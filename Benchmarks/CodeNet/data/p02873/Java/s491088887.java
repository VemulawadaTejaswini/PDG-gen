import java.io.*;
import java.util.*;

class Solver {
  final char[] cs;
  final int n;
  
  Solver(char[] cs) {
    this.cs = cs;
    this.n = cs.length + 1;
  }
  
  public long solve() {
    long[] as = new long[n];
    Arrays.fill(as, -1);
    char prev = '>';
    for (int i = 0; i < cs.length; i++) {
      if (cs[i] == '<') {
        if (prev == '>') {
          as[i] = 0;
        }
        as[i+1] = as[i] + 1;
      }
      prev = cs[i];
    }
    
    /*
    for (int i = 0; i < n; i++) {
      System.err.printf("%3d", as[i]);
    }
    System.err.println();
    */
    
    prev = '<';
    for (int i = cs.length - 1; i >= 0; i--) {
      if (cs[i] == '>') {
        if (prev == '<') {
          as[i + 1] = 0;
        }
        as[i] = Math.max(as[i], as[i + 1] + 1);
      }
      prev = cs[i];
    }
    
    /*
    for (int i = 0; i < n; i++) {
      System.err.printf("%3d", as[i]);
    }
    System.err.println();
    */
    long answer = 0;
    for (long a : as) {
      answer += a;
    }
    
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    char[] cs = reader.next().toCharArray();
    out.println(new Solver(cs).solve());
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
  
  public String[] nextArray(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDoubleArray(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public int[][] nextIntMatrix(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLongMatrix(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDoubleMatrix(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
}
