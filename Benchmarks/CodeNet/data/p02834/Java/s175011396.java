import java.io.*;
import java.util.*;

class Solver {
  final int n, u, v;
  final int[][] abs;
  
  List<List<Integer>> graph;
  int[] fromT, fromA;
  
  Solver(int n, int u, int v, int[][] abs) {
    this.n = n;
    this.u = u;
    this.v = v;
    this.abs = abs;
  }
  
  private void dfs(int[] fromArray, int index, int prevIndex, int distance) {
    for (int nextIndex : graph.get(index)) {
      if (nextIndex == prevIndex) {
        continue;
      }
      fromArray[index] = distance;
      dfs(fromArray, nextIndex, index, distance + 1);
    }
  }
  
  private int findMax(int index, int prevIndex) {
    int maxValue = Math.max(0, fromA[index]);
    for (int nextIndex : graph.get(index)) {
      if (nextIndex == prevIndex || fromT[nextIndex] > fromA[nextIndex]) {
        continue;
      }
      maxValue = Math.max(maxValue, findMax(nextIndex, index));
    }
    return maxValue;
  }
  
  public int solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] ab : abs) {
      int a = ab[0];
      int b = ab[1];
      graph.get(a).add(b);
      graph.get(b).add(a);
    }
    
    fromT = new int[n + 1];
    dfs(fromT, u, -1, 0);
    
    fromA = new int[n + 1];
    dfs(fromA, v, -1, 0);
    
    return findMax(u, -1);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int u = reader.nextInt();
    int v = reader.nextInt();
    int[][] abs = reader.nextInt(n - 1, 2);
    out.println(new Solver(n, u, v, abs).solve());
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
