import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
  final int i, j, cost;
  
  Node(int i, int j, int cost) {
    this.i = i;
    this.j = j;
    this.cost = cost;
  }
  
  public int compareTo(Node node) {
    return this.cost - node.cost;
  }
}

class Solver {
  private final int[] DI = new int[]{1, 0, -1, 0};
  private final int[] DJ = new int[]{0, 1, 0, -1};
  
  final int h, w;
  final char[][] sm;
  
  Solver(int h, int w, char[][] sm) {
    this.h = h;
    this.w = w;
    this.sm = sm;
  }
  
  private int dijkstra(int i0, int j0) {
    boolean[][] visited = new boolean[h][w];
    PriorityQueue<Node> queue = new PriorityQueue<>();
    queue.add(new Node(i0, j0, 0));
    int maxCost = 0;
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      int i = node.i;
      int j = node.j;
      int cost = node.cost;
      if (visited[i][j]) {
        continue;
      }
      visited[i][j] = true;
      maxCost = Math.max(maxCost, cost);
      for (int k = 0; k < 4; k++) {
        int nextI = i + DI[k];
        int nextJ = j + DJ[k];
        if (nextI < 0 || h <= nextI || nextJ < 0 || w <= nextJ || visited[nextI][nextJ] || sm[nextI][nextJ] == '#') {
          continue;
        }
        queue.add(new Node(nextI, nextJ, cost + 1));
      }
    }
    return maxCost;
  }
  
  public int solve() {
    int answer = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (sm[i][j] == '#') {
          continue;
        }
        answer = Math.max(answer, dijkstra(i, j));
      }
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    char[][] sm = reader.nextCharArray(h);
    out.println(new Solver(h, w, sm).solve());
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
