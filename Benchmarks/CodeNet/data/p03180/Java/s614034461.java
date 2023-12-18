import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final long[][] am;
  long[] table;
  
  Solver(int n, long[][] am) {
    this.n = n;
    this.am = am;
  }
  
  private long solveSub(int bitset, int index, int subBitset) {
    if (index == n) {
      if (subBitset == 0 || subBitset == bitset) {
        return Long.MIN_VALUE;
      }
      return solve(subBitset) + solve(bitset - subBitset);
    }
    if (((bitset >> index) & 1) == 0) {
      return solveSub(bitset, index + 1, subBitset);
    }
    long answer1 = solveSub(bitset, index + 1, subBitset | (1 << index));
    long answer2 = solveSub(bitset, index + 1, subBitset);
    return Math.max(answer1, answer2);
  }
  
  private long solve(int bitset) {
    if (table[bitset] != Long.MAX_VALUE) {
      return table[bitset];
    }
    
    long score = 0;
    for (int i = 0; i < n; i++) {
      if (((bitset >> i) & 1) != 1) {
        continue;
      }
      for (int j = i+1; j < n; j++) {
        if (((bitset >> j) & 1) != 1) {
          continue;
        }
        score += am[i][j];
      }
    }
    
    table[bitset] = Math.max(score, solveSub(bitset, 0, 0));
    return table[bitset];
  }
  
  public long solve() {
    table = new long[1 << n];
    Arrays.fill(table, Long.MAX_VALUE);
    return solve((1 << n) - 1);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long[][] am = reader.nextLong(n, n);
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
