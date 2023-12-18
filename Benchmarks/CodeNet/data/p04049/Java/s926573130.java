import java.io.*;
import java.util.*;

class Solver {
  final int n, k;
  final int[][] abs;
  List<List<Integer>> graph;
  
  Solver(int n, int k, int[][] abs) {
    this.n = n;
    this.k = k;
    this.abs = abs;
  }
  
  private int reachable(int[] initialNodes) {
    int count = 0;
    int[] costs = new int[n + 1];
    Arrays.fill(costs, -1);
    
    Deque<Integer> queue = new ArrayDeque<>();
    for (int initialNode : initialNodes) {
      costs[initialNode] = 0;
      queue.addLast(initialNode);
      count++;
    }
    while (!queue.isEmpty()) {
      int node = queue.pollFirst();
      for (int next : graph.get(node)) {
        if (costs[next] >= 0) {
          continue;
        }
        costs[next] = costs[node] + 1;
        count++;
        if (costs[next] < k / 2) {
          queue.addLast(next);
        }
      }
    }
    return n - count;
  }
  
  private int solveEven() {
    int answer = Integer.MAX_VALUE;
    for (int i = 1; i <= n; i++) {
      answer = Math.min(answer, reachable(new int[]{i}));
    }
    return answer;
  }
  
  private int solveOdd() {
    int answer = Integer.MAX_VALUE;
    for (int[] ab : abs) {
      answer = Math.min(answer, reachable(ab));
    }
    return answer;
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
    if (k % 2 == 0) {
      return solveEven();
    } else {
      return solveOdd();
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    int[][] abs = reader.nextInt(n - 1, 2);
    out.println(new Solver(n, k, abs).solve());
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
