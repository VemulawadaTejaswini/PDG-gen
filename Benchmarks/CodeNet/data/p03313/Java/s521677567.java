import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final long[] as;
  
  long[] topValues;
  int[] topSources;
  long[] secondValues;
  
  Solver(int n, long[] as) {
    this.n = n;
    this.as = as;
  }
  
  public Deque<Long> solve() {
    topValues = new long[1 << n];
    topSources = new int[1 << n];
    secondValues = new long[1 << n];
    
    Deque<Long> output = new ArrayDeque<>();
    topValues[0] = as[0];
    topSources[0] = 0;
    secondValues[0] = 0;
    long lastValue = 0;
    for (int i = 1; i < (1 << n); i++) {
      topValues[i] = as[i];
      topSources[i] = i;
      secondValues[i] = 0;
      for (int k = 0; k < n; k++) {
        if (((i >> k) & 1) != 1) {
          continue;
        }
        int subIndex = i - (1 << k);
        if (topValues[i] < topValues[subIndex] && topSources[i] != topSources[subIndex]) {
          secondValues[i] = topValues[i];
          topValues[i] = topValues[subIndex];
          topSources[i] = topSources[subIndex];
        } else if (secondValues[i] < topValues[subIndex] && topSources[i] != topSources[subIndex]) {
          secondValues[i] = topValues[subIndex];
        }
//        System.err.printf("%4d: %4d %4d %4d\n", i, topSources[i], topValues[i], secondValues[i]);
      }
      /*
      for (int j = 0; j <= i; j++) {
        System.err.printf("%4d: %4d %4d %4d\n", j, topSources[j], topValues[j], secondValues[j]);
      }
      System.err.println();
      */
      lastValue = Math.max(lastValue, topValues[i] + secondValues[i]);
      output.addLast(lastValue);
    }
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long[] as = reader.nextLong(1 << n);
    Deque<Long> answers = new Solver(n, as).solve();
    while (!answers.isEmpty()) {
      out.println(answers.pollFirst());
    }
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
