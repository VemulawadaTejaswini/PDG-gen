import java.io.*;
import java.util.*;

public class Main {
  private static String solve(char[] ss, char[] ts) {
    int[][] table = new int[ss.length + 1][ts.length + 1];
    for (int i = 0; i < ss.length; i++) {
      for (int j = 0; j < ts.length; j++) {
        table[i + 1][j + 1] = Math.max(table[i+1][j], table[i][j+1]);
        if (ss[i] == ts[j]) {
          table[i + 1][j + 1] = Math.max(table[i + 1][j + 1], table[i][j] + 1);
        }
      }
    }
    Deque<Character> deque = new ArrayDeque<>();
    {
      int i = ss.length;
      int j = ts.length;
      while (i > 0 && j > 0) {
        if (ss[i - 1] == ts[j - 1] && table[i][j] == table[i - 1][j - 1] + 1) {
          deque.addFirst(ss[i - 1]);
          i--;
          j--;
        } else if (table[i][j] == table[i - 1][j]) {
          i--;
        } else {
          j--;
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    for (Character c : deque) {
      sb.append(c);
    }
    return sb.toString();
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    char[] ss = reader.nextCharArray();
    char[] ts = reader.nextCharArray();
    out.println(solve(ss, ts));
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
