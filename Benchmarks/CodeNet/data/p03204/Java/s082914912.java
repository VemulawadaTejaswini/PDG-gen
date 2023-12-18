import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final int[][] abs;
  List<List<Integer>> graph;
  int[] sameGroupCounts;
  int[] costs;
  
  Solver(int n, int[][] abs) {
    this.n = n;
    this.abs = abs;
  }
  
  private void dfs(int index, int parentIndex, int groupRootIndex, int groupRootParentIndex) {
    if (index < groupRootParentIndex) {
      sameGroupCounts[groupRootIndex]++;
      for (int childIndex : graph.get(index)) {
        if (childIndex == parentIndex) {
          continue;
        }
        dfs(childIndex, index, groupRootIndex, groupRootParentIndex);
      }
    } else {
      sameGroupCounts[index]++;
      for (int childIndex : graph.get(index)) {
        if (childIndex == parentIndex) {
          continue;
        }
        dfs(childIndex, index, index, parentIndex);
      }
    }
  }
  
  private void dfs2(int index, int parentIndex, int cost) {
    cost += sameGroupCounts[index];
    costs[index] = cost;
    for (int childIndex : graph.get(index)) {
      if (childIndex == parentIndex) {
        continue;
      }
      dfs2(childIndex, index, cost);
    }
  }
  
  public List<Integer> solve() {
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
    
    sameGroupCounts = new int[n + 1];
    for (int childIndex : graph.get(1)) {
      dfs(childIndex, 1, childIndex, 1);
    }
    
    costs = new int[n + 1];
    dfs2(1, -1, 0);
    
    List<Integer> answers = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      answers.add(costs[i]);
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] abs = reader.nextInt(n - 1, 2);
    for (int answer : new Solver(n, abs).solve()) {
      out.println(answer);
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
