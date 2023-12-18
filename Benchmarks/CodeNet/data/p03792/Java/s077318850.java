import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final char[][] am;
  boolean[][] bm;
  
  Solver(int n, char[][] am) {
    this.n = n;
    this.am = am;
  }
  
  private int solveA(int i) {
    int countBlack = 0;
    for (int j = 0; j < n; j++) {
      if (bm[i][j]) {
        countBlack++;
      }
    }
    
    boolean hasBlack = false;
    for (int j = 0; j < n; j++) {
      if (bm[j][i]) {
        hasBlack = true;
      }
    }
    if (!hasBlack) {
      return Integer.MAX_VALUE;
    }
    
    int allBlackColumnCount = 0;
    for (int j = 0; j < n; j++) {
      boolean allBlack = true;
      for (int k = 0; k < n; k++) {
        if (!bm[k][j]) {
          allBlack = false;
          break;
        }
      }
      if (allBlack) {
        allBlackColumnCount++;
      }
    }
    return n - countBlack + n - allBlackColumnCount;
  }
  /*
  private int solveB(int i) {
    int countBlack = 0;
    for (int j = 0; j < n; j++) {
      if (bm[i][j]) {
        countBlack++;
      }
    }
    if (countBlack == 0) {
      return Integer.MAX_VALUE;
    }
    
    int copyCount = 0;
    for (int j = 0; j < n; j++) {
      boolean needCopy = false;
      for (int k = 0; k < n; k++) {
        if (bm[i][k] && !bm[k][j]) {
          needCopy = true;
          break;
        }
      }
      if (needCopy) {
        copyCount++;
      }
    }
    return n - countBlack + n - copyCount;
  }
  */
  
  
  public int solve() {
    bm = new boolean[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        bm[i][j] = am[i][j] == '#';
      }
    }
    
    int answer = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      answer = Math.min(answer, solveA(i));
//      System.err.printf("%d: %d\n", i, solveA(i));
//      answer = Math.min(answer, solveB(i));
    }
    if (answer == Integer.MAX_VALUE) {
      return -1;
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    char[][] am = reader.nextCharArray(n);
    out.println(new Solver(n, am).solve());
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
