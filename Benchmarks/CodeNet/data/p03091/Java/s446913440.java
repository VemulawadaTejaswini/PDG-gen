import java.io.*;
import java.util.*;

class Solver {
  final int n, m;
  final int[][] abs;
  List<List<Integer>> graph;
  
  boolean[] visited;
  int src, dst;
  
  Solver(int n, int m, int[][] abs) {
    this.n = n;
    this.m = m;
    this.abs = abs;
  }
  
  private boolean dfs(int index, int parentIndex) {
    if (index == dst) {
      return false;
    }
    if (index == src && parentIndex >= 0) {
      return true;
    }
    for (int nextIndex : graph.get(index)) {
      if (nextIndex == parentIndex) {
        continue;
      }
      if (dfs(nextIndex, index)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean solve() {
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
    boolean hasSixDegreesNode = false;
    List<Integer> fourDegreesNode = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      int size = graph.get(i).size();
      if (size % 2 == 1) {
        return false;
      }
      hasSixDegreesNode |= size >= 6;
      if (size == 4) {
        fourDegreesNode.add(i);
      }
    }
    if (hasSixDegreesNode || fourDegreesNode.size() >= 3) {
      return true;
    }
    if (fourDegreesNode.size() < 2) {
      return false;
    }
    int count = 0;
    src = fourDegreesNode.get(0);
    dst = fourDegreesNode.get(1);
    return dfs(src, -1);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[][] abs = reader.nextInt(m, 2);
    out.println(new Solver(n, m, abs).solve() ? "Yes" : "No");
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
