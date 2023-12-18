import java.io.*;
import java.util.*;

class DfsResult {
  final int size;
  final boolean hasOddCycle;
  
  DfsResult(int size, boolean hasOddCycle) {
    this.size = size;
    this.hasOddCycle = hasOddCycle;
  }
}

class Solver {
  final int n, m;
  final int[][] uvs;
  List<List<Integer>> graph;
  int[] visited;
  
  Solver(int n, int m, int[][] uvs) {
    this.n = n;
    this.m = m;
    this.uvs = uvs;
  }
  
  public DfsResult dfs(int index, int color) {
    visited[index] = color;
    
    int size = 1;
    int nextColor = 3 - color;
    boolean hasOddCycle = false;
    for (int next : graph.get(index)) {
      if (visited[next] == 0) {
        DfsResult result = dfs(next, nextColor);
        size += result.size;
        hasOddCycle |= result.hasOddCycle;
      } else if (visited[next] != nextColor) {
        hasOddCycle = true;
      }
    }
    return new DfsResult(size, hasOddCycle);
  }
  
  public long solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] uv : uvs) {
      int u = uv[0];
      int v = uv[1];
      graph.get(u).add(v);
      graph.get(v).add(u);
    }
    
    visited = new int[n + 1];
    
    long countWithOddCycle = 0;
    long countWithoutOddCycle = 0;
    long countSingle = 0;
    for (int i = 1; i <= n; i++) {
      if (visited[i] != 0) {
        continue;
      }
      DfsResult result = dfs(i, 1);
//      System.err.println(answer);
//      System.err.printf("%d %s\n", result.size, result.hasOddCycle);
      long size = result.size;
//      answer -= size * size;
      if (size == 1) {
        countSingle++;
      } else if (result.hasOddCycle) {
        countWithOddCycle++;
      } else {
        countWithoutOddCycle++;
      }
    }
    long longN = n;
    long v1 = 2 * countSingle * longN - countSingle * countSingle;
    long v2 = countWithOddCycle * countWithOddCycle;
    long v3 = 2 * countWithoutOddCycle * countWithoutOddCycle;
    long v4 = 2 * countWithOddCycle * countWithoutOddCycle;
    
//    System.err.printf("%d %d %d %d %d %d %d %d\n", countSingle, countWithOddCycle, countWithoutOddCycle, v1, v2, v3, v4, v5);
    
    return v1 + v2 + v3 + v4;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[][] uvs = reader.nextInt(m, 2);
    out.println(new Solver(n, m, uvs).solve());
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
