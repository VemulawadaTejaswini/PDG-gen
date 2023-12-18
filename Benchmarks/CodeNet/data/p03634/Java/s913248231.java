import java.io.*;
import java.util.*;

class Node {
  final int destination, cost;
  
  Node(int destination, int cost) {
    this.destination = destination;
    this.cost = cost;
  }
}

class Solver {
  final int n, q, k;
  final int[][] abcs, xys;
  List<List<Node>> graph;
  long[] costTable;
  
  Solver(int n, int[][] abcs, int q, int k, int[][] xys) {
    this.n = n;
    this.abcs = abcs;
    this.q = q;
    this.k = k;
    this.xys = xys;
  }
  
  private void dfs(int index, long totalCost) {
    costTable[index] = totalCost;
    for (Node next : graph.get(index)) {
      if (costTable[next.destination] >= 0) {
        continue;
      }
      dfs(next.destination, totalCost + next.cost);
    }
  }
  
  public List<Long> solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] abc : abcs) {
      int a = abc[0];
      int b = abc[1];
      int c = abc[2];
      graph.get(a).add(new Node(b, c));
      graph.get(b).add(new Node(a, c));
    }
    
    costTable = new long[n + 1];
    Arrays.fill(costTable, -1);
    dfs(k, 0);
    
    List<Long> answers = new ArrayList<>();
    for (int[] xy : xys) {
      int x = xy[0];
      int y = xy[1];
      answers.add(costTable[x] + costTable[y]);
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] abcs = reader.nextInt(n - 1, 3);
    int q = reader.nextInt();
    int k = reader.nextInt();
    int[][] xys = reader.nextInt(q, 2);
    for (long answer : new Solver(n, abcs, q, k, xys).solve()) {
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
