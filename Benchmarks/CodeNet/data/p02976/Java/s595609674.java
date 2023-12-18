import java.io.*;
import java.util.*;

class Edge {
  final int minIndex, maxIndex;
  
  Edge(int index1, int index2) {
    minIndex = Math.min(index1, index2);
    maxIndex = Math.max(index1, index2);
  }
  
  public boolean equals(Object object) {
    Edge edge = (Edge) object;
    return this.minIndex == edge.minIndex && this.maxIndex == edge.maxIndex;
  }
  
  public int hashCode() {
    return 13 * maxIndex + minIndex;
  }
}

class Solver {
  final int n, m;
  final int[][] abs;
  
  List<List<Integer>> graph;
  Set<Edge> visited;
  List<Edge> edgeStack;
  List<String> output;
  
  Solver(int n, int m, int[][] abs) {
    this.n = n;
    this.m = m;
    this.abs = abs;
  }
  
  
  private void assignDirection(Edge edge1, Edge edge2) {
    int[] indexes = new int[]{
      edge1.minIndex,
      edge1.maxIndex,
      edge2.minIndex,
      edge2.maxIndex
    };
    int srcIndex = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = i+1; j < 4; j++) {
        if (indexes[i] == indexes[j]) {
          srcIndex = indexes[i];
        }
      }
    }
    if (srcIndex == 0) {
      throw new RuntimeException();
    }
    for (int index : indexes) {
      if (index == srcIndex) {
        continue;
      }
      output.add(String.format("%d %d", srcIndex, index));
    }
  }
  
  private void mightAssignDirection() {
    if (edgeStack.size() < 4) {
      return;
    }
    Edge edge1 = edgeStack.get(edgeStack.size() - 1);
    Edge edge2 = edgeStack.get(edgeStack.size() - 2);
    Edge edge3 = edgeStack.get(edgeStack.size() - 3);
    Edge edge4 = edgeStack.get(edgeStack.size() - 4);
    if ((edge1.equals(edge2) && edge3.equals(edge4))
        || (edge1.equals(edge4) && edge2.equals(edge3))) {
      edgeStack.remove(edgeStack.size() - 1);
      edgeStack.remove(edgeStack.size() - 1);
      edgeStack.remove(edgeStack.size() - 1);
      edgeStack.remove(edgeStack.size() - 1);
      assignDirection(edge1, edge3);
    }
  }
  
  private String formatNonDirectedEdge(int index1, int index2) {
    int minIndex = Math.min(index1, index2);
    int maxIndex = Math.max(index1, index2);
    return String.format("%d %d", minIndex, maxIndex);
  }
  
  private void edgeDfs(int index) {
    for (int next : graph.get(index)) {
      Edge edge = new Edge(index, next);
      if (visited.contains(edge)) {
        continue;
      }
      visited.add(edge);
      
      edgeStack.add(edge);
      edgeDfs(next);
      edgeStack.add(edge);
      
      mightAssignDirection();
    }
  }
  
  public List<String> solve() {
    if (m % 2 == 1) {
      return Arrays.asList("-1");
    }
    
    graph = new ArrayList<>();
    visited = new HashSet<>();
    edgeStack = new ArrayList<>();
    output = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] ab : abs) {
      int a = ab[0];
      int b = ab[1];
      graph.get(a).add(b);
      graph.get(b).add(a);
    }
    edgeDfs(1);
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[][] abs = reader.nextInt(m, 2);
    for (String line : new Solver(n, m, abs).solve()) {
      out.println(line);
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
