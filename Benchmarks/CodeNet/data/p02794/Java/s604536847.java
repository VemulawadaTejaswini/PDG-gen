import java.io.*;
import java.util.*;

class Solver {
  final int n, m;
  final int[][] abs, uvs;
  List<List<Integer>> graph;
  int[] parents;
  List<List<Integer>> paths;
  
  Solver(int n, int[][] abs, int m, int[][] uvs) {
    this.n = n;
    this.abs = abs;
    this.m = m;
    this.uvs = uvs;
  }
  
  private void dfs(int index, int parentIndex) {
    parents[index] = parentIndex;
    for (int childIndex : graph.get(index)) {
      if (childIndex == parentIndex) {
        continue;
      }
      dfs(childIndex, index);
    }
  }
  
  public long solve() {
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
    
    parents = new int[n + 1];
    parents[1] = -1;
    dfs(1, -1);
    
    paths = new ArrayList<>();
    for (int[] uv : uvs) {
      int u = uv[0];
      int v = uv[1];
      
      Set<Integer> pathSet = new HashSet<>();
      int tempU = u;
      while (tempU >= 1) {
        pathSet.add(tempU);
        tempU = parents[tempU];
      }
      int tempV = v;
      while (tempV >= 1) {
        if (pathSet.contains(tempV)) {
          pathSet.remove(tempV);
        } else {
          pathSet.add(tempV);
        }
        tempV = parents[tempV];
      }
      
      List<Integer> path = new ArrayList<>();
      path.addAll(pathSet);
      paths.add(path);
    }
    
    long answer = 1L << (n - 1);
    for (int bitset = 1; bitset < (1 << m); bitset++) {
      int bitCount = 0;
      Set<Integer> path = new HashSet<>();
      for (int i = 0; i < m; i++) {
        if (((bitset >> i) & 1) == 1) {
          bitCount++;
          for (int p : paths.get(i)) {
            path.add(p);
          }
        }
      }
      if (bitCount % 2 == 1) {
        answer -= 1L << (n - 1 - path.size());
      } else {
        answer += 1L << (n - 1 - path.size());
      }
    }
    
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] abs = reader.nextInt(n - 1, 2);
    int m = reader.nextInt();
    int[][] uvs = reader.nextInt(m, 2);
    out.println(new Solver(n, abs, m, uvs).solve());
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
