import java.io.*;
import java.util.*;

class Solver {
  final int h, w, k;
  final char[][] map;
  int cakeNumber;
  Solver(int h, int w, int k, char[][] map) {
    this.h = h;
    this.w = w;
    this.k = k;
    this.map = map;
  }
  
  private List<Integer> split(int rowIndex) {
    List<Integer> output = new ArrayList<>();
    boolean hasCake = false;
    for (int i = 0; i < w; i++) {
      if (map[rowIndex][i] == '#') {
        while (output.size() < i + 1) {
          output.add(cakeNumber);
        }
        cakeNumber++;
      }
    }
    if (output.size() == 0) {
      return null;
    }
    while (output.size() < w) {
      output.add(cakeNumber - 1);
    }
    return output;
  }
  
  public List<List<Integer>> solve() {
    cakeNumber = 1;
    List<List<Integer>> output = new ArrayList<>();
    for (int i = 0; i < h; i++) {
      List<Integer> line = split(i);
      if (line == null) {
        continue;
      }
      while (output.size() < i + 1) {
        output.add(line);
      }
    }
    List<Integer> bottomLine = output.get(output.size() - 1);
    while (output.size() < h) {
      output.add(bottomLine);
    }
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    int k = reader.nextInt();
    char[][] map = reader.nextCharArray(h);
    List<List<Integer>> output = new Solver(h, w, k, map).solve();
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        out.print(output.get(i).get(j));
        out.print(" ");
      }
      out.println();
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
