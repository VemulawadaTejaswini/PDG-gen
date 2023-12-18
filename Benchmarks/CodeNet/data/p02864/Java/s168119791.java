import java.io.*;
import java.util.*;

public class Main {
  private static long INF = 1L << 40;
  
  private static long solve(int n, int k, int[] hs) {
    int[] h2s = new int[n + 2];
    for (int i = 0; i < n; i++) {
      h2s[i + 1] = hs[i];
    }
    long[][] dptable = new long[n + 2][k + 1];
    dptable[0][0] = 0;
    for (int i = 1; i < n + 2; i++) {
      Arrays.fill(dptable[i], INF);
      for (int j = 0; j <= k; j++) {
        dptable[i][j] = dptable[i-1][j] + Math.max(0, h2s[i] - h2s[i-1]);
        for (int t = 1; t <= j; t++) {
          if (i - 1 - t < 0) {
            break;
          }
          dptable[i][j] = Math.min(dptable[i][j], dptable[i-1-t][j-t] + Math.max(0, h2s[i] - h2s[i-1-t]));
        }
      }
    }
    
    /*
    for (int i = 0; i < n + 2; i++) {
      for (int j = 0; j <= k; j++) {
        System.err.printf("%15d", dptable[i][j]);
      }
      System.err.println();
    }
    */
    
    long answer = INF;
    for (int i = 0; i <= k; i++) {
      answer = Math.min(answer, dptable[n + 1][k]);
    }
    return answer;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    int[] hs = reader.nextInt(n);
    out.println(solve(n, k, hs));
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
