import java.io.*;
import java.util.*;

class NaiveSolver {
  enum Result {
    FIRST_PLAYER_WIN,
    SECOND_PLAYER_WIN,
    NOT_YET
  }
  
  final int x, y;
  Result[][] resultMatrix;
  
  public NaiveSolver(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  private Result dfs(int v1, int v2) {
    if (resultMatrix[v1][v2] != Result.NOT_YET) {
      return resultMatrix[v1][v2];
    }
    for (int i = 2; i <= v1; i += 2) {
      if (dfs(v1 - i, v2 + i / 2) == Result.SECOND_PLAYER_WIN) {
        resultMatrix[v1][v2] = Result.FIRST_PLAYER_WIN;
        return Result.FIRST_PLAYER_WIN;
      }
    }
    for (int j = 2; j <= v2; j += 2) {
      if (dfs(v1 + j / 2, v2 - j) == Result.SECOND_PLAYER_WIN) {
        resultMatrix[v1][v2] = Result.FIRST_PLAYER_WIN;
        return Result.FIRST_PLAYER_WIN;
      }
    }
    resultMatrix[v1][v2] = Result.SECOND_PLAYER_WIN;
    return Result.SECOND_PLAYER_WIN;
  }
  
  public String solve() {
    if (x == 0 && y == 0) {
      return "Brown";
    }
    int max = x + y + 1;
    resultMatrix = new Result[max][max];
    for (Result[] r : resultMatrix) {
      Arrays.fill(r, Result.NOT_YET);
    }
    resultMatrix[0][0] = Result.SECOND_PLAYER_WIN;
    resultMatrix[0][1] = Result.SECOND_PLAYER_WIN;
    resultMatrix[1][1] = Result.SECOND_PLAYER_WIN;
    resultMatrix[1][0] = Result.SECOND_PLAYER_WIN;
    
    Result r = dfs(x, y);
    
    
    
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        System.err.printf("%d", dfs(i, j) == Result.FIRST_PLAYER_WIN ? 1 : 2);
      }
      System.err.println();
    }
    
    
    return r == Result.FIRST_PLAYER_WIN ? "Alice" : "Brown";
  }
}

public class Main {
  private static String solve(long x, long y) {
    long diffAbs = Math.abs(x - y);
    if (diffAbs <= 1) {
      return "Brown";
    }
    return "Alice";
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    /*
    int x = reader.nextInt();
    int y = reader.nextInt();
    out.println(new NaiveSolver(x, y).solve());
    */
    long x = reader.nextLong();
    long y = reader.nextLong();
    out.println(solve(x, y));
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
