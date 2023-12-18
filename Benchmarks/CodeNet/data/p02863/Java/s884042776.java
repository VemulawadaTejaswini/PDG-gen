import java.io.*;
import java.util.*;

class Solver {
  final int n, t;
  final int[][] abs;
  
  Solver(int n, int t, int[][] abs) {
    this.n = n;
    this.t = t;
    this.abs = abs;
  }
  
  public int solve() {
    int[][] dptable1 = new int[n + 1][t];
    for (int i = 0; i < n; i++) {
      int a = abs[i][0];
      int b = abs[i][1];
      for (int j = t - 1; j >= 0; j--) {
        if (j >= a) {
          dptable1[i+1][j] = Math.max(dptable1[i][j], dptable1[i][j - a] + b);
        } else {
          dptable1[i+1][j] = dptable1[i][j];
        }
      }
    }
    
    int[][] dptable2 = new int[n + 2][t];
    for (int i = n-1; i > 0; i--) {
      int a = abs[i][0];
      int b = abs[i][1];
      for (int j = t - 1; j >= 0; j--) {
        if (j >= a) {
          dptable2[i+1][j] = Math.max(dptable2[i+2][j], dptable2[i+2][j - a] + b);
        } else {
          dptable2[i+1][j] = dptable2[i+2][j];
        }
      }
    }
    
    int answer = 0;
    for (int i = 0; i < n; i++) {
      int a = abs[i][0];
      int b = abs[i][1];
      for (int k = 0; k < t; k++) {
        answer = Math.max(answer, dptable1[i][k] + dptable2[i+2][t - k - 1] + b);
      }
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int t = reader.nextInt();
    int[][] abs = reader.nextInt(n, 2);
    out.println(new Solver(n, t, abs).solve());
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
